package comn;

class SavingsAccount extends BankAccount {
    private static final double MIN_DEPOSIT = 1000;
    private static final double INTEREST_RATE = 0.04;
    private static final int MAX_WITHDRAWALS_PER_MONTH = 3;
    private int withdrawalsThisMonth = 0;
 
    public SavingsAccount(String accountHolderName, String mobileNumber, double initialDeposit) {
        super(accountHolderName, mobileNumber, initialDeposit);
        if (initialDeposit < MIN_DEPOSIT) {
            System.out.println("Minimum deposit of ₹1000 required for Savings Account.");
            return;
        }
        openAccount();
    }
 
    @Override
    public void openAccount() {
        System.out.println("Opening Savings Account...");
        validateAccount();
    }
 
    @Override
    public double calculateInterest() {
        return balance * INTEREST_RATE;
    }
 
    @Override
    public void withdraw(double amount) {
        if (withdrawalsThisMonth >= MAX_WITHDRAWALS_PER_MONTH) {
            System.out.println("Maximum withdrawals per month exceeded.");
            return;
        }
        if (isValidWithdrawalAmount(amount)) {
            balance -= amount;
            withdrawalsThisMonth++;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }
}
 
