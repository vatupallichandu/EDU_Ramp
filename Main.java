package comn;

public class Main {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("Chandu", "1234567890", 1000);
        savingsAccount.displayAccountDetails();
        System.out.println("Interest: " + savingsAccount.calculateInterest());
        savingsAccount.withdraw(500);
 
        CurrentAccount currentAccount = new CurrentAccount("ABC Corporation", "9876543210", 5000);
        currentAccount.displayAccountDetails();
        System.out.println("Interest: " + currentAccount.calculateInterest());
        currentAccount.withdraw(3000);
    }
}
