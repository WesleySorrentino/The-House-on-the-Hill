package Assets;

// Handles checking if user has the key to the desired door
public class Door {
    private final String name;
    private final int doorId;
    private final boolean isLocked;

    public Door(String name, int doorId, boolean isLocked) {
        this.name = name;
        this.doorId = doorId;
        this.isLocked = isLocked;
    }

    /**
     * @param key Enter the key object required for door
     */
    public boolean openDoor(Key key) {
//      Checks if key id and door id are the same
        if (isLocked) {
            if (doorId == key.getId()) {
                System.out.println("You have opened the " + name + " with " + key.getName());
                return true;
            } else {
                System.out.println("You tried to open the " + name + ", but you have the wrong key!\n");
                return false;
            }

        } else {
            System.out.println(name + " was not locked, You open it.");
            return true;
        }
    }

    public String getName() {
        return name;
    }

    public boolean isLocked() {
        if (isLocked) {
            System.out.println(name + " is locked..");
            return true;
        } else {
            System.out.println(name + "was not locked");
            return false;
        }
    }
}
