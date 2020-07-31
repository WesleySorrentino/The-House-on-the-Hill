package Assets;

// Handles all the different keys the user can get
public class Key extends Item{
    private final int id;
    private final int quantity;
    /**
     * @param name Enter the name of the key
     * @param id Enter the specific Identifier for key
     * @param quantity enter the quantity
     */
    public Key(String name, int id, int quantity) {
        super(name);
        this.id = id;
        this.quantity = quantity;
    }

    /**
     * @param name Enter the name of the key
     * @param id Enter the specific Identifier for key
     *
     * Quantity is default to 1
     */
    public Key(String name, int id) {
        this(name,id,1);
    }

    public int getId() {
        return id;
    }

    public int getQuantity() {
        return quantity;
    }
}
