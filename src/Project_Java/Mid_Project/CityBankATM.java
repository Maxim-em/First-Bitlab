package Project_Java.Mid_Project;

import java.util.Scanner;

public class CityBankATM {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер счета");
        String newAccountNumber=in.next();
        System.out.println("Введите пин-код");
        String newPinCod=in.next();
        for (int i=0; i<10; i++){
            if (Database.allAccounts[i].getAccountNumber().equals(newAccountNumber) &&
            Database.allAccounts[i].getPinCode().equals(newPinCod)){
                if (Database.allAccounts[i] instanceof CityBankAccount){
                    System.out.println("PRESS [1] TO CASH WITHDRAWAL\n" +
                            "PRESS [2] TO VIEW BALANCE \n" +
                            "PRESS [3] TO CHANGE PIN CODE\n" +
                            "PRESS [4] TO CASH IN ACCOUNT \n" +
                            "PRESS [5] TO VIEW ACCOUNT DATA\n" +
                            "PRESS [6] TO EXIT // выход");
                    int choice =in.nextInt();
                    if (choice ==1){
                        System.out.println("Введите сумму, которую желаете снять");
                        int credit = in.nextInt();
                        if (credit <Database.allAccounts[i].totalBalance()){
                            Database.allAccounts[i].creditBalance(credit);
                            System.out.println("Остаток на счете: "+Database.allAccounts[i].totalBalance());
                        }
                        else{
                            System.out.println("Error");
                        }
                    }
                    else if (choice ==2){
                        System.out.println("Остаток на счете: "+Database.allAccounts[i].totalBalance());
                    }
                    else if(choice ==3){
                        System.out.println("Введите новый pin код");
                        Database.allAccounts[i].setPinCode(in.next());
                    }
                    else if(choice ==4){
                        System.out.println("Введите сумму, которую хотите внести");
                        Database.allAccounts[i].debetBalance(in.nextInt());
                        System.out.println("Сумма добавлена на счет");
                        System.out.println("Остаток на счете: "+Database.allAccounts[i].totalBalance());
                    }
                    else if(choice ==5){
                        System.out.println(Database.allAccounts[i].accountData());
                    }
                    else if(choice ==6){
                        System.out.println("EXIT");
                        break;
                    }
                }
                else if(Database.allAccounts[i] instanceof NationalBankAccount){
                    System.out.println("PRESS [1] TO CASH WITHDRAWAL\n" +
                            "PRESS [2] TO VIEW BALANCE\n" +
                            "PRESS [3] TO EXIT");
                    int choice =in.nextInt();
                    if (choice ==1){
                        System.out.println("Введите сумму, которую хотите снять, комиссия: 200 тг");
                        int credit = in.nextInt();
                        if (credit+200 <Database.allAccounts[i].totalBalance()){
                            Database.allAccounts[i].creditBalance(credit+200);
                            System.out.println("Остаток на счете: "+Database.allAccounts[i].totalBalance());
                        }
                        else{
                            System.out.println("Error");
                        }
                    }
                    else if(choice ==2){
                        System.out.println("Остаток на счете: "+Database.allAccounts[i].totalBalance());
                    }
                    else if(choice ==3){
                        System.out.println("EXIT");
                        break;
                    }
                }
            }
        }
    }
}
