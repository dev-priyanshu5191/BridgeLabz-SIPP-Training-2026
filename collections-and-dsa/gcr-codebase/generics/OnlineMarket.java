import java.util.*;

abstract class Category {
    String name;

    Category(String name) {
        this.name = name;
    }
}

class BookCategory extends Category {
    BookCategory(String name) {
        super(name);
    }
}

class ClothingCategory extends Category {
    ClothingCategory(String name) {
        super(name);
    }
}

class GadgetCategory extends Category {
    GadgetCategory(String name) {
        super(name);
    }
}

class Product<T extends Category> {
    String productName;
    double price;
    T category;

    Product(String productName, double price, T category) {
        this.productName = productName;
        this.price = price;
        this.category = category;
    }

    @Override
    public String toString() {
        return productName + "  Price = " + price + "  Category = " + category.name;
    }
}

public class OnlineMarket {

    static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        product.price = product.price - (product.price * percentage / 100);
    }

    public static void main(String[] args) {

        ArrayList<Product<?>> catalog = new ArrayList<>();

        Product<BookCategory> b =
                new Product<>("Java Book", 500, new BookCategory("Education"));

        Product<ClothingCategory> c =
                new Product<>("T-Shirt", 1000, new ClothingCategory("Men"));

        Product<GadgetCategory> g =
                new Product<>("Laptop", 60000, new GadgetCategory("Electronics"));

        catalog.add(b);
        catalog.add(c);
        catalog.add(g);

        applyDiscount(b, 10);
        applyDiscount(c, 20);
        applyDiscount(g, 5);

        for (Product<?> p : catalog) {
            System.out.println(p);
        }
    }
}