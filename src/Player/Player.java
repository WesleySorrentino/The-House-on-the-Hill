package Player;

import Assets.Item;

import java.util.HashMap;
import java.util.Map;

public class Player {
    private String name;
    private Map<Item,Integer> inventory = new HashMap<>();

    public Player(String name) {
        this.name = name;

        inventory.put(new Item("Flashlight"),2);
        inventory.put(new Item("Pocket Knife"),1);
        inventory.put(new Item("Water"),1);
    }

    public void openInventory() {
        for (Map.Entry<Item,Integer> entry : inventory.entrySet()) {
            Item items = entry.getKey();
            int quantity = entry.getValue();
            System.out.println(items.getName() + ": x" + quantity);
        }
    }
}
