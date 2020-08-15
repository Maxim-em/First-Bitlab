package Project_Java.Praktika_11_Part_1;

import java.util.Scanner;

public class Praktika_11_Part_1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        User[] users=new User[10];
        users[0]=new User("John", "Smith");
        users[1]=new User("James", "Smith");
        users[2]=new User("Alex", "Smith");
        users[3]=new User("John", "Adams");
        users[4]=new User("John", "Jefferson");
        users[5]=new User("Josh", "Smith");
        users[6]=new User("George", "Reeves");
        users[7]=new User("Adam", "Smith");
        users[8]=new User("Brad", "Johnson");
        users[9]=new User("Bradley", "Smith");
        UserBeanImp DataBase= new UserBeanImp(users);
        DataBase.getAllUsers();
        DataBase.getUsersByName("John");
        DataBase.getUsersBySurname("Smith");
    }
}
