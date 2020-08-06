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
    public boolean useKey(Door door) {
        displayInventory();
        System.out.println("Type the number of the key you want to use: ");
        int choice = s.nextInt();

        if (choice <= keyInventory.size()) {
            return door.openDoor(keyInventory.get(choice - 1));
        } else {
            System.out.println("Please enter a valid number!");

            return false;
        }
    }
//  Adds a item to inventory
//    /**
//     * @param item Adds an item or multiple items to user's inventory
//     */
//    public void addToInventory(Item item) {
//        addToInventory(item);
//    }
//  Adds a Key to inventory
    /**
     * @param item adds a key/item or multiple to user's inventory
     */
    public void addToInventory(Key ... item) {
        for (Key i : item) {
            keyInventory.add(i);
            System.out.println("Added " + i.getName() + " to inventory.\n");
        }
    }
//  Display's the available options for the user
//  TODO Add ability to use items
    public boolean userAction(Door door) {
        String text =
                "\n1. Use Key on " + door.getName() +
                "\n2. Open " + door.getName() +
                "\n3. Display Inventory" +
                "\n4. Go back\n";

        System.out.println(text);

        System.out.println("Type a number listed above: ");
        int selection = s.nextInt();
        s.nextLine();

        switch (selection) {
            case 1:
                return useKey(door);
            case 2:
//              Checks to see if door is locked
                if (!door.isLocked()) {
                    return true;
                }
                break;
            case 3:
                displayInventory();
                return false;
            case 4:
//              Gets out of selecting options
                return false;
            default:
                System.out.println("Please enter a valid number!");
                return false;
        }
        return false;
    }

    public String getName() {
        return name;
    }
}
