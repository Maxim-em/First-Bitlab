package Project_Java.Module2_Lab_1_Try2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddPage extends JPanel {
    Database base;
    MainFrame frame;
    String[] facs = {"Information Technologies", "Economics", "Mathematics"};
    public AddPage(Database base, MainFrame frame){
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

        JLabel grouplbl= new JLabel("Group: ");
        grouplbl.setSize(70, 30);
        grouplbl.setLocation(100, 200);
        add(grouplbl);

        JLabel facultieslbl= new JLabel("Faculties: ");
        facultieslbl.setSize(70, 30);
        facultieslbl.setLocation(100, 250);
        add(facultieslbl);

        JTextField name = new JTextField();
        name.setSize(200, 30);
        name.setLocation(200, 100);
        add(name);

        JTextField surname = new JTextField();
        surname.setSize(200, 30);
        surname.setLocation(200, 150);
        add(surname);

        JTextField group = new JTextField();
        group.setSize(200, 30);
        group.setLocation(200, 200);
        add(group);

        JComboBox faculties = new JComboBox(facs);
        faculties.setSize(200, 30);
        faculties.setLocation(200, 250);
        add(faculties);

        JButton add = new JButton("ADD");
        add.setSize(100, 30);
        add.setLocation(100, 400);
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Students s = new Students();
                s.setName(name.getText());
                s.setSurname(surname.getText());
                s.setFaculty((String) faculties.getSelectedItem());
                s.setGroup(group.getText());
                base.addStudent(s);
                name.setText("");
                surname.setText("");
                group.setText("");
                faculties.setSelectedIndex(0);
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
