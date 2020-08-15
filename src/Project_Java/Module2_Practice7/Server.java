package Project_Java.Module2_Practice7;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args){
        try{
            ServerSocket server = new ServerSocket(1987);
            System.out.println("Waiting for connection");
            Socket socket = server.accept();
            System.out.println("Client connected");
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
            MessageData messageData = new MessageData();
            while((messageData=(MessageData) inputStream.readObject())!=null){
                System.out.println(messageData.toString());
            }
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
