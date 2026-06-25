class Vehicle {

    public double fuelCost(int km) {
        return 0;
    }
}

// Car Class
class Car extends Vehicle {

    @Override
    public double fuelCost(int km) {
        return km * 8;      // ₹8 per km
    }
}

// Bus Class
class Bus extends Vehicle {

    @Override
    public double fuelCost(int km) {
        return km * 15;     // ₹15 per km
    }
}

// Bike Class
class Bike extends Vehicle {

    @Override
    public double fuelCost(int km) {
        return km * 3;      // ₹3 per km
    }
}

// New Class (Open/Closed Principle)
class ElectricCar extends Vehicle {

    @Override
    public double fuelCost(int km) {
        return km * 2;      // ₹2 per km (charging cost)
    }
}

public class TransportCompany {

    public static void main(String[] args) {

        Vehicle[] fleet = {
                new Car(),
                new Bus(),
                new Bike(),
                new ElectricCar()
        };

        int km = 100;

        for (Vehicle v : fleet) {

            if (v instanceof Car) {
                Car c = (Car) v;
                System.out.println("Car Fuel Cost = " + c.fuelCost(km));
            }

            else if (v instanceof Bus) {
                Bus b = (Bus) v;
                System.out.println("Bus Fuel Cost = " + b.fuelCost(km));
            }

            else if (v instanceof Bike) {
                Bike b = (Bike) v;
                System.out.println("Bike Fuel Cost = " + b.fuelCost(km));
            }

            else if (v instanceof ElectricCar) {
                ElectricCar e = (ElectricCar) v;
                System.out.println("Electric Car Cost = " + e.fuelCost(km));
            }
        }
    }
}