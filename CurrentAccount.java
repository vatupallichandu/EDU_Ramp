package day3;

class CurrentAccount extends Account {
    private double initialDeposit;
    private String gstNumber;
    private String businessProof;
 
    public CurrentAccount(String accountNumber, String accountHolderName, String address, String contactNumber,
                         double initialDeposit, String gstNumber, String businessProof) {
        super(accountNumber, accountHolderName, address, contactNumber);
        this.initialDeposit = initialDeposit;
        this.gstNumber = gstNumber;
        this.businessProof = businessProof;
    }
 
    @Override
    void openAccount() {
        System.out.println("Opening Current Account...");
        System.out.println("Required Documents:");
        System.out.println("1. GST Certificate: " + gstNumber);
        System.out.println("2. Business Proof: " + businessProof);
        System.out.println("3. Proof of Address: " + address);
        System.out.println("4. Proof of Identity: " + accountHolderName);
        displayAccountDetails();
        System.out.println("Initial Deposit: " + initialDeposit);
    }
}
 
