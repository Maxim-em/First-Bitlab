package Project_Java.Module2_Practice8;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server {
    public static void main(String[] args){
        try{
            ServerSocket server = new ServerSocket(9999);

            while(true){
                System.out.println("Waiting for connection");
                Socket socket = server.accept();
                System.out.println("Client connected");
                ClientHandler handler = new ClientHandler(socket);
                handler.start();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
