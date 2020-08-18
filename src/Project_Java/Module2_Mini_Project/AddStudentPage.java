package Project_Java.Module2_Mini_Project;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class AddStudentPage extends JPanel {
    MainFrame frame;
    public AddStudentPage(MainFrame frame){
        setSize(500, 650);
        setLayout(null);

        JLabel namelbl = new JLabel("Name: ");
        namelbl.setSize(70, 30);
        namelbl.setLocation(100, 100);
        add(namelbl);

        JLabel surnamelbl = new JLabel("Surname: ");
        surnamelbl.setSize(70, 30);
        surnamelbl.setLocation(100, 150);
        add(surnamelbl);

        JLabel agelbl= new JLabel("Age: ");
        agelbl.setSize(70, 30);
        agelbl.setLocation(100, 200);
        add(agelbl);

        JTextField name = new JTextField();
        name.setSize(200, 30);
        name.setLocation(200, 100);
        add(name);

        JTextField surname = new JTextField();
        surname.setSize(200, 30);
        surname.setLocation(200, 150);
        add(surname);

        JTextField age = new JTextField();
        age.setSize(200, 30);
        age.setLocation(200, 200);
        add(age);

        JButton add = new JButton("ADD");
        add.setSize(100, 30);
        add.setLocation(100, 400);
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Student s = new Student();
                s.setName(name.getText());
                s.setSurname(surname.getText());
                s.setAge((Integer.parseInt(age.getText())));
                try{
                    Socket socket = new Socket("localhost", 9999);
                    ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
                    outputStream.writeObject(new PackageData("Add_student", null, s));
                }catch(Exception exc){
                    exc.printStackTrace();
                }

                name.setText("");
                surname.setText("");
                age.setText("");
            }
        });
        add(add);

        JButton back = new JButton("BACK");
        back.setSize(100, 30);
        back.setLocation(300, 400);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.getMenu();
            }
        });
        add(back);
    }
}
