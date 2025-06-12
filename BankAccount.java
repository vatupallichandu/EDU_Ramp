package comn;

abstract class BankAccount {
    private static int accountNumberCounter = 1000;
    protected int accountNumber;
    protected String accountHolderName;
    protected String mobileNumber;
    protected double balance;
 
    public BankAccount(String accountHolderName, String mobileNumber, double initialDeposit) {
        this.accountNumber = accountNumberCounter++;
        this.accountHolderName = accountHolderName;
        this.mobileNumber = mobileNumber;
        this.balance = initialDeposit;
    }
 
    public abstract void openAccount();
 
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Mobile Number: " + mobileNumber);
        System.out.println("Balance: " + balance);
    }
 
    public abstract double calculateInterest();
 
    public abstract void withdraw(double amount);
 
    protected void validateAccount() {
        if (balance < 0) {
            System.out.println("Invalid account balance.");
            return;
        }
        System.out.println("Account validated and confirmed.");
    }
 
    protected boolean isValidWithdrawalAmount(double amount) {
        return amount > 0 && amount <= balance;
    }
}
