package Project_Java.Module2_Lab_1_Try2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class List extends JPanel {
    Database base;
    MainFrame frame;
    public List(Database base, MainFrame frame){
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
                list.setText(base.listStudents()+"\n");
            }
        });
        add(List);


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
