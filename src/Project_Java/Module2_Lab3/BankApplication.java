package Project_Java.Module2_Lab3;

import java.util.ArrayList;

public class BankApplication {
    private String name;
    private ArrayList<Account> accounts = new ArrayList<Account>();
    public BankApplication(){
    }

    public BankApplication(String name) {
        this.name = name;
    }
    public void addAccount(Account a){
        accounts.add(a);
    }
    public  void removeAccount(int i){
        accounts.remove(i);
    }
    public Account getMaxAccount(){
        Account a = new Account();
        for (int i=0; i<accounts.size(); i++){
            if (accounts.get(i).getBalance()>a.getBalance()){
                a=accounts.get(i);
            }
        }
        return a;
    }
    public double getAverageBalance(){
        double avBalance=0;
        for (Account a:accounts){
            avBalance+=a.getBalance();
        }
        return avBalance/accounts.size();
    }
    public double getTotalBalance(){
        double totalBalance=0;
        for (Account a:accounts){
            totalBalance+=a.getBalance();
        }
        return totalBalance;
    }
    public int totalAccounts(){
        return accounts.size();
    }
    String getBankData(){
        return "Name: "+name+", "+"Количество счетов: "+totalAccounts()+", "+ "Сумма баланса всех пользователей: "
                +getTotalBalance()+", "+"Среднее значение баланса: "+getAverageBalance();
    }
}
