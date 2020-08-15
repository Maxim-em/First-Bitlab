package Project_Java.Mid_Project;

public interface BankAccount {
    public String getAccountNumber();
    public String getPinCode();
    public void setPinCode(String pinCode);
    public int totalBalance();
    public void creditBalance(int credit); //Снятие со счета
    public void debetBalance(int debet); // Добавление на счет
    public String accountData();
}
