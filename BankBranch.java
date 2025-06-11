 package day3;
 class BankBranch {
    private String branchName;
    private String branchAddress;
 
    public BankBranch(String branchName, String branchAddress) {
        this.branchName = branchName;
        this.branchAddress = branchAddress;
    }
 
    void openAccount(Account account) {
        System.out.println("Opening account at " + branchName + " branch, " + branchAddress);
        account.openAccount();
    }
}
 