package Project_Java.Module2_Practice_1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    Integer [] ages = new Integer[100];
    public MainFrame(){
        for (int i=0; i<100; i++){
            ages[i]=i+1;
        }
        setSize(500, 650);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Java Module 2, Practice 1");

        JLabel namelbl = new JLabel("Name: ");
        namelbl.setSize(50, 30);
        namelbl.setLocation(100, 100);
        add(namelbl);

        JLabel phonelbl = new JLabel("Phone: ");
        phonelbl.setSize(50, 30);
        phonelbl.setLocation(100, 150);
        add(phonelbl);

        JLabel agelbl= new JLabel("Age: ");
        agelbl.setSize(50, 30);
        agelbl.setLocation(100, 200);
        add(agelbl);

        JTextField name = new JTextField();
        name.setSize(200, 30);
        name.setLocation(200, 100);
        add(name);

        JTextField phone = new JTextField();
        phone.setSize(200, 30);
        phone.setLocation(200, 150);
        add(phone);

        JComboBox agecombo = new JComboBox(ages);
        agecombo.setSize(200, 30);
        agecombo.setLocation(200, 200);
        add(agecombo);

        JTextArea list = new JTextArea();
        list.setSize(400, 250);
        list.setLocation(50, 300);
        list.setEditable(false);
        add(list);

        JButton btn = new JButton("ADD CONTACT");
        btn.setSize(300, 30);
        btn.setLocation(100, 250);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = name.getText();
                Integer a = (Integer) agecombo.getSelectedItem();
                list.append(text+" - "+phone.getText()+" - "+a+"\n");
                name.setText("");
                phone.setText("");
                agecombo.setSelectedIndex(0);
            }
        });
        add(btn);
    }
}
