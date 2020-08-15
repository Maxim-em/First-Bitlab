package Project_Java.Module2_Lab8;

import java.io.ObjectInputStream;
import java.net.Socket;

public class ClientHandler extends Thread{
    private Socket socket;

    public ClientHandler(Socket socket){
        this.socket = socket;
    }

    @Override
    public void run() {
        try{
            String message = null;
            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
            while((message = (String) inputStream.readObject())!=null){
                System.out.println(message);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
