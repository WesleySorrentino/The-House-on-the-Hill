package Assets;

import java.util.*;

public class Player {
    private final String name;
    private final Map<Key, Integer> inventory = new HashMap<>();
    private final ArrayList<Key> keyInventory = new ArrayList<>();
    private final Scanner s = new Scanner(System.in);

    public Player(String name) {
        this.name = name;
    }
//  Displays the current Inventory the user has
    private void displayInventory() {
        int increment = 1;
        for (Key key : keyInventory) {
            System.out.println(increment++ + ". " + key.getName() + " x" + key.getQuantity());
        }
    }
    /**
     * Allows user to try and open doors
     * @param door Input the door you want to try and open
     */
    public void useKey(Door door) {
        displayInventory();
        System.out.println("Type the number of the key you want to use: ");
        int choice = s.nextInt();

        if (choice <= keyInventory.size()) {
            door.openDoor(keyInventory.get(choice - 1));
        } else {
            System.out.println("Please enter a valid number!");
        }
    }
//  Adds a item to inventory
    /**
     * @param item Adds an item to user's inventory
     */
    public void addToInventory(Item item) {
        addToInventory(item);
    }
//  Adds a Key to inventory
    /**
     * @param item enter the item you wanna give the user
     */
    public void addToInventory(Key item) {
        keyInventory.add(item);
        System.out.println("Added " + item.getName() + " to inventory.\n");
    }
//  Display's the available options for the user
//  TODO Add ability to use items
    public void userAction(Door door) {
        String text =
                "\n1. Use Key on " + door.getName() +
                "\n2. Display Inventory" +
                "\n3. Go back";

        System.out.println(text);

        System.out.println("Type a number listed above: ");
        int selection = s.nextInt();
        s.nextLine();

        switch (selection) {
            case 1:
                useKey(door);
                break;
            case 2:
                displayInventory();
                break;
            case 3:
//              Gets out of selecting options
                break;
            default:
                System.out.println("Please enter a valid number!");
                break;
        }
    }

    public String getName() {
        return name;
    }
}
