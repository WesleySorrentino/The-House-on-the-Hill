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
        slowTextScroll("Prologue\\intro.txt",1000);
    }
//  Display's text for the first chapter
    public void entry() {
        slowTextScroll("ChapterOne\\entry.txt",1000);

        Door backYardGate = new Door("Backyard Gate",0,false);
        Door mainGate = new Door("Main Gate",1,true);
        var backWay = new Location("The Back Way",backYardGate,"locations\\backWay.txt");
        var mainGateLocation = new Location("Main Courtyard",mainGate,"locations\\mainGate.txt");

        int firstEncounter = encounter(mainGate,backYardGate);

        locationSelector(firstEncounter,mainGateLocation,backWay);
    }

    public void insideTheManor() {
        backEntranceLocation();
        foyerLocation();
    }
// Location Methods

// Back Entrance Location
    private void backEntranceLocation() {
//      Work in progress

        slowTextScroll("ChapterOne\\kitchen\\kitchenOptions.txt");
    }

//  Foyer Location
    private void foyerLocation(){
        boolean insideFoyer = true;
        while (insideFoyer){
            System.out.println("You are now inside the foyer");
            System.out.println(
                    "1. Bathroom\n" +
                    "2. Office\n" +
                    "3. Go back to Kitchen\n"
            );
            Door bathroomDoor = new Door("Bathroom Door",2,false);
            Door officeDoor = new Door("Office Door",3,true);
            Door kitchenDoor = new Door("Kitchen Door",4,false);

            var bathroom = new Location("Bathroom",bathroomDoor,"ChapterOne\\bathroom.txt");
            var office = new Location("Office",officeDoor,"ChapterOne\\office.txt");
            var kitchen = new Location("Kitchen",kitchenDoor,"ChapterOne\\kitchen\\kitchen.txt");


            int foyerEncounter = encounter(bathroomDoor,officeDoor);
            var loc = locationSelector(foyerEncounter,bathroom,office);

            switch (loc) {
                case 1:
                    bathroomLocation();
                    break;
                case 2:
                    System.out.println(officeDoor.isLocked());
                    break;
                case 3:
                    backEntranceLocation();
                    break;
            }
            insideFoyer = false;
        }
    }

    private void bathroomLocation(){
        System.out.println("Welcome to the bathroom");
        boolean isChoosing = true;
        while (isChoosing) {
            System.out.println("Type a num: ");
            int choice = s.nextInt();
            s.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Checked something");
                    break;
                case 2:
                    System.out.println("Leaving bathroom");
                    isChoosing = false;
            }
        }
    }

    /**
     * @param doors add one or multiple door objects and display them for user to select
     */
    private int encounter(Door ... doors) {
        ArrayList<Door> doorList = new ArrayList<>();

        int increment = 1;
        for (Door d : doors) {
            System.out.println(increment++ + ". " + d.getName());
            doorList.add(d);
        }

        while (true) {
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