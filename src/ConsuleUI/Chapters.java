package ConsuleUI;

import Assets.*;

import java.util.ArrayList;
import java.util.Scanner;

import static Utilities.Utilities.slowTextScroll;

public class Chapters {
    private static final Player player = new Player("Jake");
    private static final Scanner s = new Scanner(System.in);
//  Displays text for the intro
    public void intro(String userName) {
        String introText =
                "Intro: " +
                        "September 13th, It’s the beginning of the school year. Everyday on your way to school every year,\n" +
                        "You pass by this house on the hill. It has been deteriorating and has been covered with vines for several years.\n" +
                        "Once you get to school you tell your best friend.\n" +

                        "\n" + userName +":" + " Hey Mark, We should go explore the house on the hill after school\n" +
                        "\nMark: Have you been reading your dads hardy books again?\n" +
                        "\n" + userName +":" + " Yes, but that’s not the point, According to this newspaper (pulls out newspaper)\n" +
                        "Date is 1990, It says the owners got up and left, leaving everything behind. No one knows Why they left.\n" +
                        "\nMark: Do you know how dangerous it is? There could be ghosts!\n" +
                        "\n" + userName +":" + " Ghosts don't exist Mark. Have you ever watched Scooby doo?\n" +
                        "\nThere is always a person behind the monster or ghost.\n" +
                        "\nMark: Of course I watch Scooby doo you numb nut, let me think about it\n" +
                        "\nNarrator: Mark walks to class and follows\n" +
                        "\nNarrator: The time is now 4:00..\n" +
                        "\n" + userName +":" + " What do you say Mark?\n" +
                        "\nMark: You know what " + userName + ", I'm in.\n" +
                        "\n" + userName +":" + " Awesome, we will go on Saturday. We can tell our parent we are just going to hangout in town.\n" +
                        "\nNarrator: The day is now Saturday the boys pack the supplies they might need for the exploration, with them being Boy Scouts they know to Be Prepared.\n";
        slowTextScroll(introText,1100);
    }
//  Display's text for the first chapter
    public void entry(String userName) {
        String entryText =
                "\nChapter 1 - Entry\n" +
                        "\nNarrator: Mark and Jake both agreed to meet at Jake's house..\n" +
                        "\nMark: (Knocks on door)\n" +
                        "\n" + userName + "'s Mom: Hey Mark, it's nice to see you.\n" +
                        "\nMark: Hello Ms. " + userName + "'s mom, Is "+  userName + " ready?\n" +
                        "\nJake's Mom: Let me go see if he is.\n" +
                        "\nJake's Mom: (Shouts from downstairs) "+ userName +"! Mark is here!\n" +
                        "\n" + userName + "'s Mom: He's in his room Mark, You can come on in.\n" +
                        "\nMark: Thanks, Ms. "+ userName +"'s Mom.\n" +
                        "\nNarrator: Mark heads upstairs to "+ userName +"'s room.\n" +
                        "\n" + userName +":" + " Did you bring supplies?\n" +
                        "\nMark: Yep, I brought. One flashlight, My First aid kit we made last Boy Scout meeting,\n" +
                        "some snacks and my pocket knife. What did you bring?\n" +
                        "\n" + userName +":" + " I packed Two flashlights, I wanted to make sure we were prepared,\n" +
                        "I got some water bottles from my fridge just in case we need them,\n" +
                        "and I brought my favorite pocket knife.\n" +
                        "\nMark: We've got food and water covered as well as some flashlights.\n" +
                        "Are we ready to head out?\n" +
                        "\n" + userName +":" + " Let's head out.\n" +
                        "\nNarrator: The boys head out on their journey. After a 10 minute walk they reach the house.." +
                        "\nMark: Well we are here, what's the plan Jake?\n" +
                        "\n" + userName +":" + " We can either go through the main gate or we can go around the back of the house.\n" +
                        "\nMark: Its your call, What are we going to do?";
        slowTextScroll(entryText);

        String mainGateText = "In main gate (placementText)";
        String backYardText = "In back yard (placementText)";
        Door backYardGate = new Door("Backyard Gate",0,false);
        Door mainGate = new Door("Main Gate",1,true);
        var backWay = new Location("The Back Way",backYardGate,backYardText);
        var mainGateLocation = new Location("Main Courtyard",mainGate,mainGateText);

        locationSelector(encounter(mainGate,backYardGate),mainGateLocation,backWay);
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
    
    /**
     * @param encounter Pass the encounter method
     * @param locations enter the locations you want the user to see
     */
    private void locationSelector(int encounter, Location... locations) {
        for (Location l : locations) {
            if (encounter != -1 && encounter == l.getDoor().getDoorId()) {
//              Displays the selected locations dialogue
                l.getDialogue();
                break;
            }
        }
    }
}
