package Assets;

// Handles all the different locations the player can go to
public class Location {
    private String name;
    private Door door;

    public Location(String name, Door door) {
        this.name = name;
        this.door = door;
    }
}
