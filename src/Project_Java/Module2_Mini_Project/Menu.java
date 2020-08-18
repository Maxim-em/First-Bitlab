package Project_Java.Module2_Mini_Project;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JPanel {
    protected JButton addStudent;
    protected JButton listStudent;
    protected JButton exit;
    public Menu(MainFrame frame){
        setSize(500, 650);
        setLayout(null);

        addStudent = new JButton("ADD STUDENT");
        addStudent.setSize(200, 30);
        addStudent.setLocation(100, 100);
        addStudent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.getPage();
            }
        });
        add(addStudent);

        listStudent = new JButton("LIST STUDENTS");
        listStudent.setSize(200, 30);
        listStudent.setLocation(100, 140);
        listStudent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.getListOfStudents();
            }
        });
        add(listStudent);

        exit = new JButton("EXIT");
        exit.setSize(200, 30);
        exit.setLocation(100, 180);
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });
        add(exit);
    }
}
