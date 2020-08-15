package Project_Java.Module2_Lab3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        BankApplication bank1 = new BankApplication("National Bank");
        bank1.addAccount(new Account(1234, "Max", "Surname1", 1000));
        bank1.addAccount(new Account(1235, "Max2", "Surname2", 2000));
        bank1.addAccount(new Account(1236, "Max3", "Surname3", 3000));
        bank1.addAccount(new Account(1237, "Max4", "Surname4", 4000));
        bank1.addAccount(new Account(1238, "Max5", "Surname5", 5000));
        BankApplication bank2 = new BankApplication("City Bank");
        bank2.addAccount(new Account(4321, "Name1", "Surname6", 2500));
        bank2.addAccount(new Account(4322, "Name2", "Surname7", 2600));
        bank2.addAccount(new Account(4323, "Name3", "Surname8", 2700));
        bank2.addAccount(new Account(4324, "Name4", "Surname9", 2800));
        bank2.addAccount(new Account(4325, "Name5", "Surname0", 2900));
        BankApplication bank3 = new BankApplication("Local Bank");
        bank3.addAccount(new Account(5671, "Login1", "Sur1", 6000));
        bank3.addAccount(new Account(5671, "Login2", "Sur2", 6100));
        bank3.addAccount(new Account(5671, "Login3", "Sur3", 6200));
        bank3.addAccount(new Account(5671, "Login4", "Sur4", 6300));
        bank3.addAccount(new Account(5671, "Login5", "Sur5", 6400));
        ArrayList<BankApplication> allBanks = new ArrayList<BankApplication>();
        allBanks.add(bank1);
        allBanks.add(bank2);
        allBanks.add(bank3);
        BankApplication a = allBanks.get(0);
        BankApplication b = allBanks.get(1);
        BankApplication c = allBanks.get(2);
        if (a.getAverageBalance()>b.getAverageBalance()){
            if (a.getAverageBalance()>c.getAverageBalance()){
                System.out.println(a.getBankData());
                if (b.getAverageBalance()>c.getAverageBalance()){
                    System.out.println(b.getBankData());
                    System.out.println(c.getBankData());
                }
                else if(c.getAverageBalance()>b.getAverageBalance()){
                    System.out.println(c.getBankData());
                    System.out.println(b.getBankData());
                }
            }
            else if(c.getAverageBalance()>a.getAverageBalance()){
                System.out.println(c.getBankData());
                System.out.println(a.getBankData());
                System.out.println(b.getBankData());
            }
        }
        else if(a.getAverageBalance()<b.getAverageBalance()){
            if (c.getAverageBalance()>b.getAverageBalance()){
                System.out.println(c.getBankData());
                System.out.println(b.getBankData());
                System.out.println(a.getBankData());
            }
            else if(b.getAverageBalance()>c.getAverageBalance()){
                System.out.println(b.getBankData());
                if (c.getAverageBalance()>a.getAverageBalance()){
                    System.out.println(c.getBankData());
                    System.out.println(a.getBankData());
                }
                else if(a.getAverageBalance()>c.getAverageBalance()){
                    System.out.println(a.getBankData());
                    System.out.println(c.getBankData());
                }
            }
        }
    }
}
