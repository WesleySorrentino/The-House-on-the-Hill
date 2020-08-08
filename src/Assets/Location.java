package Assets;

import Utilities.Utilities;

// Handles all the different locations the player can go to
public class Location {
    private final String name;
    private final Door door;
    private final String dialogue;

    public Location(String name, Door door, String dialogue) {
        this.name = name;
        this.door = door;
        this.dialogue = dialogue;
    }

    public String getName() {
        return name;
    }

    public Door getDoor() {
        return door;
    }

    public String getDialogue() {
        return Utilities.slowTextScroll(dialogue);
    }
}
