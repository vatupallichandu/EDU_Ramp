package day3;

class SavingsAccount extends Account {
    private double initialDeposit;
    private String aadharCardNumber;
    private String panCardNumber;
 
    public SavingsAccount(String accountNumber, String accountHolderName, String address, String contactNumber,
                         double initialDeposit, String aadharCardNumber, String panCardNumber) {
        super(accountNumber, accountHolderName, address, contactNumber);
        this.initialDeposit = initialDeposit;
        this.aadharCardNumber = aadharCardNumber;
        this.panCardNumber = panCardNumber;
    }
 
    @Override
    void openAccount() {
        System.out.println("Opening Savings Account...");
        System.out.println("Required Documents:");
        System.out.println("1. Aadhar Card: " + aadharCardNumber);
        System.out.println("2. PAN Card: " + panCardNumber);
        System.out.println("3. Proof of Address: " + address);
        System.out.println("4. Proof of Identity: " + accountHolderName);
        displayAccountDetails();
        System.out.println("Initial Deposit: " + initialDeposit);
    }
}
 
