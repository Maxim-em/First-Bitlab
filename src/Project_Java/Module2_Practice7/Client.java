package Project_Java.Module2_Practice7;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Date;
import java.util.Scanner;

public class Client {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Insert User Name");
        String name = in.next();
        try{
            Socket socket = new Socket("127.0.0.1", 1987);
            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            while(true){
                System.out.println("PRESS [1] TO SEND MESSAGE\n"+
                        "PRESS [2] TO EXIT");
                int choice = in.nextInt();
                if (choice==1){
                    System.out.println("Insert message text");
                    String message = in.next();
                    MessageData messageData = new MessageData(name, message, new Date());
                    outputStream.writeObject(messageData);
                }
                else if(choice ==2){
                    break;
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
