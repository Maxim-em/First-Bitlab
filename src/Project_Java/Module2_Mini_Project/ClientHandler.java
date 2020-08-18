package Project_Java.Module2_Mini_Project;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;

public class ClientHandler extends Thread{
    private Socket socket;

    public ClientHandler(Socket socket){
        this.socket = socket;
    }

    @Override
    public void run() {
        try{
            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
            PackageData packageData = (PackageData) inputStream.readObject();
            DBManager db = new DBManager();
            db.connect();
            if (packageData.getOperationType().equals("Add_student")){
                db.addStudent(packageData.getStudent());
            }
            else if(packageData.getOperationType().equals("List_students")){
                ArrayList<Student> students = db.getAllStudents();
                ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
                outputStream.writeObject(students);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
