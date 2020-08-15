package ConsuleUI;

import Utilities.Utilities;

import java.util.Scanner;

public class Menu {
    private final Scanner s = new Scanner(System.in);

    public void startScreen() {
        String userName = enterName();
        System.out.println("Welcome to The House on the Hill " + userName + "!");
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
        Utilities.slowTextScroll("Misc\\backstory.txt",800);
    }
//  Ask's user for name
    private String enterName() {
        System.out.println("Please enter your name: ");
        String name = s.nextLine();

        if (name.isEmpty()) {
            return "Jake";
        }
        return name;
    }
}
