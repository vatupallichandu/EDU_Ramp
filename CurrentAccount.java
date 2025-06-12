package comn;

class CurrentAccount extends BankAccount {
    private static final double MIN_DEPOSIT = 5000;
    private static final double MIN_BALANCE = 2000;
    private static final double PENALTY = 500;
 
    public CurrentAccount(String accountHolderName, String mobileNumber, double initialDeposit) {
        super(accountHolderName, mobileNumber, initialDeposit);
        if (initialDeposit < MIN_DEPOSIT) {
            System.out.println("Minimum deposit of ₹5000 required for Current Account.");
            return;
        }
        openAccount();
    }
 
    @Override
    public void openAccount() {
        System.out.println("Opening Current Account...");
        validateAccount();
    }
 
    @Override
    public double calculateInterest() {
        return 0;
    }
 
    @Override
    public void withdraw(double amount) {
        if (isValidWithdrawalAmount(amount)) {
            balance -= amount;
            if (balance < MIN_BALANCE) {
                balance -= PENALTY;
                System.out.println("Minimum balance not maintained. Penalty of ₹500 applied.");
            }
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }
}
 
