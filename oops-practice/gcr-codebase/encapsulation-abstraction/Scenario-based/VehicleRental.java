public class VehicleRental{
    abstract class Vehicle{
        private int vehicleNumber;
        private String vehicleType;

        public void setNumber(int num){
            this.vehicleNumber = num;
        }
        public void getNumber(){
            System.out.println("Vehicle Number is: "+vehicleNumber);
        }
        public void setType(String type){
            this.vehicleType = type;
        }
        public void getType(){
            System.out.println("Vehicle Type is: "+vehicleType);
        }
    }

    class Car extends Vehicle{
        private int dailyRate;

        public void setRate(int rate){
            this.dailyRate = rate;
        }
        public void getRate(){
            System.out.println("Rate is: "+dailyRate);
        }
        public void calculateRentalCost(int days){
            double cost = days*dailyRate;
            System.out.println("Total cost is: "+cost);
        }
    }

    class Bike extends Vehicle{
        private int dailyRate;

        public void setRate(int rate){
            this.dailyRate = rate;
        }
        public void getRate(){
            System.out.println("Rate is: "+dailyRate);
        }
        public void calculateRentalCost(int days){
            double cost = days*dailyRate;
            System.out.println("Total cost is: "+cost);
        }
    }

    class Truck extends Vehicle{
        private int dailyRate;
        private int loadingCharge;

        public void setRate(int rate){
            this.dailyRate = rate;
        }
        public void getRate(){
            System.out.println("Rate is: "+dailyRate);
        }

        public void setCharge(int charge){
            this.loadingCharge = charge;
        }
        public void getCharge(){
            System.out.println("Rate is: "+loadingCharge);
        }
        public void calculateRentalCost(int days){
            double cost = (days*dailyRate)+loadingCharge;
            System.out.println("Total cost is: "+cost);
        }
    }
    public void main(String[] args) {
        Car c1 = new Car();
        Bike b1 = new Bike();
        Truck t1 = new Truck();

        System.out.println("-----------Car--------------");
        c1.setNumber(1669);
        c1.setType("Sedan");
        c1.setRate(3600);
        c1.calculateRentalCost(2);
        c1.getNumber();
        c1.getType();
        c1.getRate();
        System.out.println("-----------Bike--------------");
        b1.setNumber(0774);
        b1.setType("Normal");
        b1.setRate(2000);
        b1.calculateRentalCost(3);
        b1.getNumber();
        b1.getType();
        b1.getRate();
        System.out.println("-----------Truck--------------");
        t1.setNumber(7669);
        t1.setType("Eicher-12Tyre");
        t1.setRate(5500);
        t1.setCharge(360);
        t1.calculateRentalCost(8);
        t1.getNumber();
        t1.getType();
        t1.getRate();
    }
}