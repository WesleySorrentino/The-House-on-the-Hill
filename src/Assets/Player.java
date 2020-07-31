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

    private void displayInventory() {
        int increment = 1;
        for (Key key : keyInventory) {
            System.out.println(increment++ + ". " + key.getName() + " x" + key.getQuantity());
        }
    }

    public void useKey(Door door) {
        displayInventory();
        System.out.println("Type the number of the key you want to use: ");
        int choice = s.nextInt();

        if (choice <= keyInventory.size()) {
            door.openDoor(keyInventory.get(choice - 1));
            keyInventory.remove(choice -1);
        } else {
            System.out.println("Please enter a valid number!");
        }
    }
    /**
     * @param item enter the item you wanna give the user
     */
    public void addToInventory(Key item) {
        keyInventory.add(item);
        System.out.println("Added " + item.getName() + " to inventory.\n");
    }
//  Display's the available options for the user
    public void userAction(Door door) {
        System.out.println("1. Use Key");
        System.out.println("2. Display Inventory");

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
            default:
                System.out.println("Please enter a valid number!");
        }
    }

    public String getName() {
        return name;
    }
}
