

public class EmployeePayroll{
    abstract class Employee{
        private int employeeID;
        private String employeeName;

        public void setName(String empName){
            this.employeeName = empName;
        }
        public String getName(){
            return employeeName;
        }
        public void setID(int empid){
            this.employeeID = empid;
        }
        public int getID(){
            return employeeID;
        }
        public abstract void calculateSalary();

        public void displayEmployeeInfo(){
            System.out.println("Employee Name is: "+employeeName);
            System.out.println("Employee ID is: "+employeeID);
        }
    }

    class FullTimeEmployee extends Employee{
        private double monthlySalary;

        public void setSalary(double monthlySalary){
            this.monthlySalary = monthlySalary;
        }
        public void getSalary(){
            System.out.println("Salary is: "+monthlySalary);
        }
        @Override
        public void calculateSalary(){
            System.out.println("Salary is: "+monthlySalary);
        }
    }

    class PartTimeEmployee extends Employee{
        private int hoursWorked;
        private int hourlyRate;

        public void setHours(int hoursWorked){
            this.hoursWorked = hoursWorked;
        }
        public int getHours(){
            return hoursWorked;
        }
        public void setRate(int hourlyRate){
            this.hourlyRate = hourlyRate;
        }
        public int getRate(){
            return hourlyRate;
        }
        @Override
        public void calculateSalary(){
            double sal = hourlyRate*hoursWorked;
            System.out.println("Calculated Salary is: "+sal);
        }
    }
    public void main(String[] args) {
        PartTimeEmployee pe = new PartTimeEmployee();
        FullTimeEmployee fe = new FullTimeEmployee();
        System.out.println("------Part Time Employee-------");
        pe.setName("Manoj Singh");
        pe.setID(2);
        pe.setHours(25);
        pe.setRate(10);
        pe.calculateSalary();
        pe.displayEmployeeInfo();
        System.out.println("-----Full Time Employee------");
        fe.setName("Tanuj Sharma");
        fe.setID(6);
        fe.setSalary(36500);
        fe.calculateSalary();
        fe.displayEmployeeInfo();
    }
}


