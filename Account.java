package day3;

abstract class Account {
    protected String accountNumber;
    protected String accountHolderName;
    protected String address;
    protected String contactNumber;
 
    public Account(String accountNumber, String accountHolderName, String address, String contactNumber) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.address = address;
        this.contactNumber = contactNumber;
    }
 
    abstract void openAccount();
 
    void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Address: " + address);
        System.out.println("Contact Number: " + contactNumber);
    }
}
 
