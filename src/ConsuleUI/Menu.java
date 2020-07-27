package ConsuleUI;

import java.util.Scanner;

public class Menu {
    private final Scanner s = new Scanner(System.in);

    public void startScreen() {
        System.out.println("Welcome to The House on the Hill!");
        selection();
    }

    private void selection() {
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
                    System.out.println("Starting game... Game under construction\nPlease wait til next update...");
                    break;
                case 2:
                    backStory();
                    break;
                case 3:
                    System.exit(1);
            }
        }
    }

    private void backStory() {
        System.out.println("\nThe year is 2000, You are a 13 year old kid.\n" +
                "You just finished your dad's old Hardy boys books\n" +
                "and you feel inspired to go on a mystery yourself.\n");
    }

}
