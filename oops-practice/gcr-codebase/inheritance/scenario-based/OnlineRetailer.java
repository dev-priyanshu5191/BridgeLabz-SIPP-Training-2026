public class OnlineRetailer{
    class Order{
        protected int orderID;
        protected String orderDate;

        public Order(int orderID, String orderDate){
            this.orderID = orderID;
            this.orderDate = orderDate;
        }
        public String getOrderStatus(){
            return "Order Placed";
        }
        public void display(){
            System.out.println("Order id: "+orderID);
            System.out.println("Order Date: "+orderDate);

        }
    }
    class ShippedOrder extends Order{
        protected int trackingNumber;
        public ShippedOrder(int orderID, String orderDate, int trackingNumber){
            super(orderID, orderDate);
            this.trackingNumber = trackingNumber;
        }
        @Override
        public String getOrderStatus(){
            return "Order Shipped";
        }
        public void display(){
            super.display();
            System.out.println("Track Number: "+trackingNumber);
        }
    }
    class DeliveredOrder extends ShippedOrder{
        private String deliveryDate;
        public DeliveredOrder(int orderID, String orderDate, int trackingNumber, String deliveryDate){
            super(orderID, orderDate, trackingNumber);
            this.deliveryDate = deliveryDate;
        }
        @Override
        public String getOrderStatus(){
            return "Order Delivered";
        }
        public void display(){
            super.display();
            System.out.println("Delivery Date: "+deliveryDate);
        }
    }
    public void main(String[] args) {
        DeliveredOrder order = new DeliveredOrder(56, "2025-06-25", 9546321, "2025-06-28");
        ShippedOrder o2 = new ShippedOrder(56, "2025-06-25", 9546321);
        order.display();
        o2.display();
        System.out.println("Status: "+order.getOrderStatus());
        System.out.println("Status: " +o2.getOrderStatus());
    }
}
