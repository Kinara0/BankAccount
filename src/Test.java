public class Test {
    public static void main(String[] args) {
        BankAccount obj = new BankAccount();
        obj.setAccount_No(123);
        obj.setAccountHolderName("Kinara");
        obj.setAccountType("Savings");
        obj.setBranchName("Ku6bhi");
        obj.setBranchAddress("On Earth");
        obj.setBalance(5999.10);

        obj.checkBalance();
        obj.withdrawAmount(56);
        obj.depositAmount(1.90);

    }
}
