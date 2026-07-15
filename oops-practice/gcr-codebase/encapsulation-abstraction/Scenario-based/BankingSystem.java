public class BankingSystem{
    abstract class BankAccount{
        private String accountNumber;
        private String holderName;
        private double balance;


        public BankAccount(String accountNumber, String holderName, double balance){
            this.accountNumber = accountNumber;
            this.holderName = holderName;
            this.balance = balance;
        }
        public void setNumber(String accNum){
            this.accountNumber = accNum;
        }
        public String getNumber(){
            return accountNumber;
        }
        public void setName(String name){
            this.holderName = name;
        }
        public String getName(){
            return holderName;
        }
        public void setbalance(double bal){
            this.balance = bal;
        }
        public double getbalance(){
            return balance;
        }

        public void deposit(double amt){
            balance += amt;
            System.out.println("Amount deposited: "+amt);
            System.out.println("Current balance is: "+balance);
        }
        public void withdraw(double amt){
            balance -= amt;
            System.out.println("Amount withdraw: "+amt);
            System.out.println("Current balance is: "+balance);
        }
        public void displayAccountDetails(){
            System.out.println("Account number: "+accountNumber);
            System.out.println("Account Holder name: "+holderName);
            System.out.println("Current Balance: "+balance);
        }
        abstract double calculateInterest();
    }
    class SavingsAccount extends BankAccount{
        private double interestRate;

        public SavingsAccount(String accountNumber, String holderName, double balance, double interestRate){
            super(accountNumber, holderName, balance);
            this.interestRate = interestRate;
        }
        public void setRate(double rate){
            this.interestRate = rate;
        }
        public double getRate(){
            return interestRate;
        }
        @Override
        public double calculateInterest(){
            return getbalance()*interestRate/100;
        }
    }

    class CurrentAccount extends BankAccount{
        private double monthlyBonusRate;

        public CurrentAccount(String accountNumber, String holderName, double balance, double monthlyBonusRate){
            super(accountNumber, holderName, balance);
            this.monthlyBonusRate = monthlyBonusRate;
        }

        public void setMonth(double month){
            this.monthlyBonusRate = month;
        }
        public double getMonth(){
            return monthlyBonusRate;
        }

        @Override
        public double calculateInterest(){
            return getbalance()*monthlyBonusRate/100;
        }
    }
    public void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("56369", "Khushi",25000, 3);
        CurrentAccount ca = new CurrentAccount("845976", "titu", 3600, 2);
        sa.deposit(5000);
        sa.withdraw(2000);

        ca.deposit(3000);
        ca.withdraw(1000);

        System.out.println("\nSavings Account Details:");
        sa.displayAccountDetails();
        System.out.println("Interest: " + sa.calculateInterest());

        System.out.println("\nCurrent Account Details:");
        ca.displayAccountDetails();
        System.out.println("Interest: " + ca.calculateInterest());
    }
}