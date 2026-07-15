class Person{
    protected String name;
    protected int id;

    public Person(String name, int id){
        this.name = name;
        this.id = id;
    }

    public void displayPerson(){
        System.out.println("Person Name: "+name);
        System.out.println("Person ID: "+id);
    }
}
interface Worker {
    void performDuties();
}
class Chef extends Person implements Worker{
    public Chef(String name, int id){
        super(name, id);
    }

    public void performDuties(){
        System.out.println("Chef Prepares Food");
    }
}
class Waiter extends Person implements Worker{
    public Waiter(String name, int id){
        super(name, id);
    }
    public void performDuties(){
        System.out.println("Waiter Serves Food");
    }
}

public class RestaurantMgmt{
    public void main(String[] args) {
         Chef chef = new Chef("Rahul",101);

        Waiter waiter = new Waiter("Aman",102);

        chef.displayPerson();
        chef.performDuties();

        System.out.println();

        waiter.displayPerson();
        waiter.performDuties();
    }
}