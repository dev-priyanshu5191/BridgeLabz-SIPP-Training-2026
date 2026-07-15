public class OnlineFoodDelivery{
    abstract class FoodItem{
        private String itemName;
        private int price;
        private int quantity;

        public FoodItem(String itemName, int price, int quantity){
            this.itemName = itemName;
            this.price = price;
            this.quantity = quantity;
        }
        public void setItem(String item){
            this.itemName = item;
        }
        public String getItem(){
            return itemName;
        }
        public void setPrice(int price){
            this.price = price;
        }
        public int getPrice(){
            return price;
        }
        public void setQuantity(int quantity){
            this.quantity = quantity;
        }
        public int getQuantity(){
            return quantity;
        }
        abstract double calculateTotalPrice();
        public void displayItemDetails(){
            System.out.println("FoodItem: "+itemName);
            System.out.println("Price: "+price);
            System.out.println("Quantity: "+quantity);
        }
    }

    class VegItem extends FoodItem{
        public VegItem(String itemName, int price, int quantity){
            super(itemName, price, quantity);
        }
        @Override
        public double calculateTotalPrice(){
            return (getPrice()*getQuantity());
        }
    }

    class NonVegItem extends FoodItem{
        public NonVegItem(String itemName, int price, int quantity){
            super(itemName, price, quantity);
        }
        @Override
        public double calculateTotalPrice(){
            return (getPrice()*getQuantity())+150;
        }
    }
    public void main(String[] args) {
        VegItem v1 = new VegItem("Panner Do payza", 220, 2);
        NonVegItem n1 = new NonVegItem("Chicken 555", 450, 2);
        v1.displayItemDetails();
        System.out.println("Total Price is: "+v1.calculateTotalPrice());
        n1.displayItemDetails();
        System.out.println("Total Price is: "+n1.calculateTotalPrice());
    }
}