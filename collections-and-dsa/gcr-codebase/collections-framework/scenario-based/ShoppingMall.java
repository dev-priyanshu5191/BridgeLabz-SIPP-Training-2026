import java.util.*;

public class ShoppingMall{
    ArrayList<String> v = new ArrayList<>();
    
    public void addVehicle(String number){
        v.add(number);
        System.out.println("Vehicle Added Successfully !");
    }
    public void removeVehicle(String number){
        if(v.remove(number)){
            System.out.println("Vehicle Removed");
        }
        else{
            System.out.println("Vehicle Not Found");
        }
    }
    public void searchVehicle(String number){
        if(v.contains(number)){
            System.out.println("Vehicle found");
        }
        else{
            System.out.println("Vehicle not found");
        }
    }

    public void displayVehicle(){
        for(String i:v){
            System.out.println(i);
        }
        System.out.println("Parking alot: "+v.size());
    }
    public static void main(String[] args) {
        ShoppingMall sm = new ShoppingMall();
        sm.addVehicle("UP81BR5284");
        sm.addVehicle("UP81CV1669");
        sm.addVehicle("UP81AT0773");
        sm.addVehicle("UP81T5480");
        sm.addVehicle("UP81CW0773");

        sm.searchVehicle("UP81AT0773");

        sm.removeVehicle("UP81T5480");

        sm.displayVehicle();
    }
}