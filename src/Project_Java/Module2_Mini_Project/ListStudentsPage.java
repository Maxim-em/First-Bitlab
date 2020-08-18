package Project_Java.Module2_Mini_Project;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;

public class ListStudentsPage extends JPanel {
    MainFrame frame;
    public ListStudentsPage(MainFrame frame){
        setLayout(null);
        setSize(500, 650);

        JTextArea list = new JTextArea();
        list.setEditable(false);
        list.setSize(450, 250);
        list.setLocation(20, 50);
        add(list);

        JButton List = new JButton("LIST");
        List.setSize(100, 30);
        List.setLocation(100, 400);
        List.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    Socket socket = new Socket("localhost", 9999);
                    ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
                    outputStream.writeObject(new PackageData("List_students", null, null));
                    ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
                    ArrayList<Student> students = (ArrayList<Student>) inputStream.readObject();
                    for(Student s:students){
                        list.append(s.toString()+"\n");
                    }
                    list.setVisible(true);
                }catch(Exception exc){
                    exc.printStackTrace();
                }
            }
        });
        add(List);


        JButton back = new JButton("BACK");
        back.setSize(100, 30);
        back.setLocation(300, 400);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                list.setText("");
                frame.getMenu();
            }
        });
        add(back);
    }
}
