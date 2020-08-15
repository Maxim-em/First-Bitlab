package Project_Java.Module2_Practice2;

import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        User users[] = new User[5];
        for (int i=0; i<5; i++){
            System.out.println("Введите имя, фамилию пользователя");
            users[i] = new User(in.next(), in.next(), 0);
            System.out.println("Введите возраст пользователя");
            try{
                users[i].age=in.nextInt();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        int sum=0;
        for (int i=0; i<5; i++){
            sum+=users[i].age;
        }
        System.out.println(sum/5);
    }
}
