public class BankAccount{
    String accountNumber;
    String accountHolder;
    double balance;
    int totalAccount=0;

    public BankAccount(String accountNumber, String accountHolder, double balance){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
        totalAccount++;
    }
    public void deposit(String accountNumber, String accountHolder, int amount){
        if((this.accountNumber.equals(accountNumber)) && (this.accountHolder.equals(accountHolder))){
            this.balance += amount;
            System.out.print(amount+" Amount deposited in: "+accountHolder+ " current balance is: "+this.balance);
        }else{
            System.out.println("Invalid AccountHolder & Invalid credentials");
        }
    }
    public void withdraw(String accountNumber, String accountHolder,int amount){
        if((this.accountNumber.equals(accountNumber)) && (this.accountHolder.equals(accountHolder))){
            this.balance -= amount;
            System.out.print(amount+" Amount withdraw from: "+accountHolder+ " current balance is: "+this.balance);
        }
        else{
            System.err.println("Invalid user");
        }
    }
    public void getStatement(String accountNumber, String accountHolder, double balance){
        System.out.println("Account number is: "+accountNumber+", Accoun Holder is: "+accountHolder+", Balance is: "+balance);
    }
    public static void totalUser(int totalAccount){
        System.err.println("Total Account is: "+totalAccount);
    }
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("1123546880", "None Singh", 5000);
        BankAccount b2 = new BankAccount("45454545", "jojo", 6300);
        BankAccount b3 = new BankAccount("69696999", "lolo", 5200);
        b1.withdraw("1123546880", "None Singh", 2000);

        
    }
}