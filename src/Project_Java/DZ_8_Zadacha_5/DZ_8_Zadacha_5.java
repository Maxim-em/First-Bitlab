package Project_Java.DZ_8_Zadacha_5;

import java.util.Scanner;

public class DZ_8_Zadacha_5 {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        User users[]= new User[5];
        users[0]= new User("maxim", "qwerty");
        users[1]= new User("Log", "1234");
        users[2]= new User("darya", "asdfg");
        users[3]= new User("dasha", "zxcvb");
        users[4]= new User("java", "4321");
        String newLogin;
        String newPassword;
        String currentLogin;
        String currentPassword;
        while(true) {
            System.out.println("Insert login");
            newLogin = in.next();
            System.out.println("Insert Password");
            newPassword = in.next();
            for (int i = 0; i < users.length; i++) {
                if (newLogin.equals(users[i].getLogin()) && newPassword.equals(users[i].getPassword())) {
                    currentLogin = users[i].getLogin();
                    currentPassword = users[i].getPassword();
                    System.out.println("Welcome " + currentLogin);
                    System.out.println("PRESS [1] TO EDIT LOGIN");
                    System.out.println("PRESS [2] TO CHANGE PASSWORD");
                    System.out.println("PRESS [3] TO LIST USERS");
                    System.out.println("PRESS [0] TO EXIT");
                    int choice = in.nextInt();
                    if (choice == 1) {
                        System.out.println("Insert new Login");
                        users[i].setLogin(in.next());
                    } else if (choice == 2) {
                        System.out.println("Insert old password");
                        if (users[i].getPassword().equals(in.next())) {
                            System.out.println("Insert new password");
                            String changedPassword = in.next();
                            System.out.println("Re-insert new password");
                            if (changedPassword.equals(in.next())) {
                                users[i].setPassword(changedPassword);
                                System.out.println("Password has changed");
                            }
                        } else {
                            System.out.println("Error");
                        }
                    } else if (choice == 3) {
                        for (int j = 0; j < users.length; j++) {
                            System.out.println(users[j]);
                        }
                    } else if (choice == 0) {
                        break;
                    }
                }
            }
        }
    }
}
