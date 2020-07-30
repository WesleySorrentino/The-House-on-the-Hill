package Assets;

// Handles all the different keys the user can get
public class Key extends Item{
    private int id;

    /**
     *
     * @param name Enter the name of the key
     * @param id Enter the specific Identifier for key
     */
    public Key(String name, int id) {
        super(name);
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
