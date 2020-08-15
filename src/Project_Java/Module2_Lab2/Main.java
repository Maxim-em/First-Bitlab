package Project_Java.Module2_Lab2;

import java.util.Scanner;

public class Main {
    public static void main(String [] args) throws DatabaseIncorrectException{
        Scanner in = new Scanner(System.in);
        Connection newCon = DatabaseDriverUtil.getConnection("https://bitlab.kz:3306/ ", "maindatabase", "root",
                "bitlab2017");
        User[] users = newCon.getUsersList();
        for (int i=0; i<users.length; i++){
            System.out.println(users[i].getUserData());
        }
    }
}
