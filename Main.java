package day3;

public class Main {
    public static void main(String[] args) {
        BankBranch branch = new BankBranch("SBI", "123, Street Name, City");
 
        SavingsAccount savingsAccount = new SavingsAccount("SAV123", "chandu", "Kukkatpally", "1234567890",
                1000.0, "AADHAR123", "PAN123");
        branch.openAccount(savingsAccount);
 
        CurrentAccount currentAccount = new CurrentAccount("CUR123", "ABC Corporation", "Madhapur", "9876543210",
                5000.0, "chandu123", "Business proof Documents");
        branch.openAccount(currentAccount);
    }
}
