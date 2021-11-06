public class BankAccount {
//Create a class BankAccount  and add few properties in it like AccountNo, AccountHolderName, AccountType, BranchName, BranchAddress, balance(make balance as double)
//2) Then add getters, setters, toString using generate option(take a look at the generated code of getters, setters)
//3) Add 3 functionalities in this class :  public void checkBalance(), public void depositAmount(double amount), public void withdrawAmount(double amount) ....code these methods accordingly
//4. create another Test class  with psvm and create an object of BankAccount class , try to getters and setters and test the three functionalities that you have created.
private int Account_No;
private String AccountHolderName;
private String AccountType;
private String BranchName, BranchAddress;
private double Balance;

    public int getAccount_No() {
        return Account_No;
    }

    public void setAccount_No(int account_No) {
        Account_No = account_No;
    }

    public String getAccountHolderName() {
        return AccountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        AccountHolderName = accountHolderName;
    }

    public String getAccountType() {
        return AccountType;
    }

    public void setAccountType(String accountType) {
        AccountType = accountType;
    }

    public String getBranchName() {
        return BranchName;
    }

    public void setBranchName(String branchName) {
        BranchName = branchName;
    }

    public String getBranchAddress() {
        return BranchAddress;
    }

    public void setBranchAddress(String branchAddress) {
        BranchAddress = branchAddress;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }
    public void checkBalance(){
        System.out.println("Balance "+Balance);

    }
    public void depositAmount(double amount){
        Balance=Balance+amount;
        System.out.println("Deposit "+Balance);
    }
    public void withdrawAmount(double amount){
Balance -= amount;
        System.out.println("Withdraw Amount "+Balance);
    }
}
