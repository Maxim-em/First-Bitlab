package Project_Java.Module2_Practice8;

import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;

public class ClientHandler extends Thread {
    private Socket socket;

    public ClientHandler(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try{
            ArrayList<Book> books = new ArrayList<>();
            PackageData packageData = new PackageData("package", books);
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            outputStream.writeObject(packageData);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
