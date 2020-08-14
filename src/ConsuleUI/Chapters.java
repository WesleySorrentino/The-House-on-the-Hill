package ConsuleUI;

import Assets.Door;
import Assets.Location;
import Assets.Player;

import java.util.ArrayList;
import java.util.Scanner;

import static Utilities.Utilities.locationSelector;
import static Utilities.Utilities.slowTextScroll;

public class Chapters {
    private static final Player player = new Player("Jake");
    private static final Scanner s = new Scanner(System.in);
//  Displays text for the intro
    public void intro() {
        slowTextScroll("intro.txt",1000);
    }
//  Display's text for the first chapter
    public void entry() {
        slowTextScroll("entry.txt",1000);

        Door backYardGate = new Door("Backyard Gate",0,false);
        Door mainGate = new Door("Main Gate",1,true);
        var backWay = new Location("The Back Way",backYardGate,"locations\\backWay.txt");
        var mainGateLocation = new Location("Main Courtyard",mainGate,"locations\\mainGate.txt");

        int firstEncounter = encounter(mainGate,backYardGate);

        locationSelector(firstEncounter,mainGateLocation,backWay);
    }

    /**
     * @param doors add one or multiple door objects and display them for user to select
     */
    private int encounter(Door ... doors) {
        ArrayList<Door> doorList = new ArrayList<>();

        while (true) {
            int increment = 1;
            for (Door d : doors) {
                System.out.println(increment++ + ". " + d.getName());
                doorList.add(d);
            }

            System.out.println("Enter a number: ");
            int choice = s.nextInt();
            s.nextLine();

            if (choice <= 0) {
                System.out.println("Enter a valid number between 1 - " + doorList.size());
            } else if (choice <= doorList.size()) {
                player.userAction(doorList.get(choice -1));

                return doorList.get(choice-1).getDoorId();
            } else {
                System.out.println("Enter a valid number.\n");
            }
        }
    }
}
