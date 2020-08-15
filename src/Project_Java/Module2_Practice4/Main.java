package Project_Java.Module2_Practice4;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        File file = new File("memory.txt");
        ArrayList<User> users = new ArrayList<>();
        while(true){
            if (file.exists()){
                users = getUsersList();
                System.out.println("PRESS [1] TO ADD USERS\n" +
                        "PRESS [2] TO LIST USERS\n" +
                        "PRESS [3] TO DELETE USERS\n" +
                        "PRESS [4] TO EXIT");
                int choice = in.nextInt();
                if (choice ==1){
                    System.out.println("Введите id, login, password");
                    users.add(new User(in.next(), in.next(), in.next()));
                    saveUsersList(users);
                }
                else if(choice ==2){
                    for (User us:users){
                        System.out.println(us.toString());
                    }
                }
                else if(choice ==3){
                    System.out.println("Введите индекс");
                    users.remove(in.nextInt());
                    saveUsersList(users);
                }
                else if(choice ==4){
                    break;
                }
            }
            else{
                saveUsersList(users);
            }
        }
    }
    public static ArrayList<User> getUsersList(){
        ArrayList<User> users = new ArrayList<>();
        try{
            BufferedReader br = new BufferedReader(new FileReader("memory.txt"));
            String message;
            while((message = br.readLine())!=null){
                String[] us = message.split(" ");
                users.add(new User(us[0], us[1], us[2]));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return users;
    }
    public static void saveUsersList(ArrayList<User> users){
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter("memory.txt"));
            for (User user:users){
                bw.write(user.toString()+"\n");
            }
            bw.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
