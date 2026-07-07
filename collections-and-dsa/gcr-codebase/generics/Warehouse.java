import java.util.*;

abstract class WarehouseItem {
    String name;

    WarehouseItem(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}

class Electronics extends WarehouseItem {
    Electronics(String name) {
        super(name);
    }
}

class Groceries extends WarehouseItem {
    Groceries(String name) {
        super(name);
    }
}

class Furniture extends WarehouseItem {
    Furniture(String name) {
        super(name);
    }
}

class Storage<T extends WarehouseItem> {
    ArrayList<T> items = new ArrayList<>();

    void addItem(T item) {
        items.add(item);
    }

    ArrayList<T> getItems() {
        return items;
    }
}

public class Warehouse {

    static void displayItems(List<? extends WarehouseItem> list) {
        for (WarehouseItem item : list) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {

        Storage<Electronics> e = new Storage<>();
        e.addItem(new Electronics("Laptop"));
        e.addItem(new Electronics("Mobile"));

        Storage<Groceries> g = new Storage<>();
        g.addItem(new Groceries("Rice"));
        g.addItem(new Groceries("Milk"));

        Storage<Furniture> f = new Storage<>();
        f.addItem(new Furniture("Chair"));
        f.addItem(new Furniture("Table"));

        System.out.println("Electronics:");
        displayItems(e.getItems());

        System.out.println("Groceries:");
        displayItems(g.getItems());

        System.out.println("Furniture:");
        displayItems(f.getItems());
    }
}