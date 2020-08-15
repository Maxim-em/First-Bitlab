package Project_Java.Mid_Project;

public class CityBankAccount implements BankAccount{
    private String name;
    private String surname;
    private int balance;
    private String accountNumber;
    private String pinCode;

    public CityBankAccount(){
    }
    public CityBankAccount(String name, String surname, int balance, String accountNumber, String pinCode){
        this.name=name;
        this.surname=surname;
        this.balance=balance;
        this.accountNumber=accountNumber;
        this.pinCode=pinCode;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
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

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
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
        return "Name: "+name+", "+"Surname: "+surname+", "+"Balance: "+balance+", "+
                "Account Number: "+accountNumber;
    }
}
