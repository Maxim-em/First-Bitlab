package Project_Java.Mid_Project;

public class NationalBankAccount implements BankAccount{
    private String fullName;
    private int balance;
    private String accountNumber;
    private String pinCode;

    public NationalBankAccount(){
    }
    public NationalBankAccount(String fullName, int balance, String accountNumber, String pinCode){
        this.fullName=fullName;
        this.balance=balance;
        this.accountNumber=accountNumber;
        this.pinCode=pinCode;
    }

    public String getFullName() {
        return fullName;
    }

    public int getBalance() {
        return balance;
    }

    @Override
    public String getAccountNumber() {
        return accountNumber;
    }

    @Override
    public String getPinCode() {
        return pinCode;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }
    public int totalBalance(){
        return balance;
    }
    public void creditBalance(int credit){
        balance-=credit;
    }
    public void debetBalance(int debet){
        balance+=debet;
    }
    public String accountData(){
        return "Full Name: "+fullName+", "+"Balance: "+balance+", "+
                "Account Number: "+accountNumber;
    }
}
