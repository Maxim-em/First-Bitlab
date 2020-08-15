package Project_Java.Module2_Practice8;

import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        try{
            Socket socket = new Socket("localhost", 9999);
            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
            PackageData packageData = (PackageData) inputStream.readObject();
            while(true){
                System.out.println("PRESS 1 TO LIST BOOKS\n" +
                        "PRESS 2 TO ADD BOOKS\n" +
                        "PRESS 0 TO DISCONNECT FROM SERVER");
                int choice = in.nextInt();
                if (choice==1){
                    System.out.println(packageData.toString());
                }
                else if(choice ==2){
                    System.out.println("Insert ID of the Book");
                    int id = in.nextInt();
                    System.out.println("Insert name of the Book");
                    String name= in.next();
                    System.out.println("Insert Author of the Book");
                    String author = in.next();
                    packageData.addBook(new Book(id, name, author));
                }
                else if(choice ==0){
                    break;
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
