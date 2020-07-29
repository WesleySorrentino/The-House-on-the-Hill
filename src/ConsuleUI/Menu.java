package ConsuleUI;

import Utilities.Utilities;

import java.util.Scanner;

public class Menu {
    private final Scanner s = new Scanner(System.in);

    public void startScreen() {
        System.out.println("Welcome to The House on the Hill!");
        selection();
    }

    private void selection() {
//      Displays options on the menu
        while (true) {
            System.out.println(
                    "\n1. Start Game\n" +
                            "2. Backstory\n" +
                            "3. Quit Game\n");

            System.out.println("Type a number for your selection: ");
            int choice = s.nextInt();
            s.nextLine();

            switch (choice) {
                case 1:
//                  Runs the game
                    StoryManager.startGame();
                    System.out.println("To be continued... Game under construction\nPlease wait til next update...");
                    break;
                case 2:
//                  Displays text about backstory
                    backStory();
                    break;
                case 3:
//                  Quits the application
                    System.exit(1);
            }
        }
    }

    private void backStory() {
//      Displays backstory text
        String text =
                "\nThe year is 2000, You are a 13 year old kid.\n" +
                "You just finished your dad's old Hardy boys books\n" +
                "and you feel inspired to go on a mystery yourself.\n";

        Utilities.slowTextScroll(text,800);
    }
}
