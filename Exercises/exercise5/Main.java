package exercise5;

import java.util.*;

// Singleton Pattern
class BakeryStoreManager {
    private static BakeryStoreManager instance;

    private BakeryStoreManager() {
        System.out.println("Manager is here.");
    }

    public static synchronized BakeryStoreManager getInstance() {
        if (instance == null) {
            instance = new BakeryStoreManager();
        }
        return instance;
    }

    public void openStore() {
        System.out.println("Bakery Store is now open.");
    }
}

// Observer Pattern
interface NewItemListener {
    void onNewItemArrival(String itemName);
}

class BakeryStore {
    private List<NewItemListener> listeners = new ArrayList<>();

    public void addNewItemListener(NewItemListener listener) {
        listeners.add(listener);
    }

    public void newItemArrived(String itemName) {
        for (NewItemListener listener : listeners) {
            listener.onNewItemArrival(itemName);
        }
    }
}

// Factory Method Pattern
abstract class BakeryItemFactory {
    public abstract BakeryItem createItem(String type);
}

class ConcreteBakeryItemFactory extends BakeryItemFactory {
    public BakeryItem createItem(String type) {
        switch (type) {
            case "Cake":
                return new Cake();
            case "Bread":
                return new Bread();
            default:
                throw new IllegalArgumentException("Unknown item type.");
        }
    }
}

class BakeryItem {
    public void prepare() {
        System.out.println("Preparing the bakery item.");
    }
}

class Cake extends BakeryItem {
    @Override
    public void prepare() {
        System.out.println("Preparing a cake.");
    }
}

class Bread extends BakeryItem {
    @Override
    public void prepare() {
        System.out.println("Preparing bread.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Singleton
        BakeryStoreManager manager = BakeryStoreManager.getInstance();
        manager.openStore();

        // Observer
        BakeryStore store = new BakeryStore();
        store.addNewItemListener(itemName -> System.out.println("New item arrived: " + itemName));
        store.newItemArrived("Chocolate Cake");

        // Factory Method
        BakeryItemFactory itemFactory = new ConcreteBakeryItemFactory();
        BakeryItem cake = itemFactory.createItem("Cake");
        BakeryItem bread = itemFactory.createItem("Bread");

        cake.prepare();
        bread.prepare();
    }
}
