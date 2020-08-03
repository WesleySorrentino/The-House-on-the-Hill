package Assets;

// Handles checking if user has the key to the desired door
public class Door {
    private final String name;
    private final int doorId;

    public Door(String name, int doorId) {
        this.name = name;
        this.doorId = doorId;
    }

    /**
     * @param key Enter the key object required for door
     */
    public void openDoor(Key key) {
//      Checks if key id and door id are the same
        if (doorId == key.getId()) {
            System.out.println("You have opened the " + name + " with " + key.getName());
        } else {
            System.out.println("You tried to open the " + name + ", but you have the wrong key!\n");
        }
    }

    public String getName() {
        return name;
    }
}
