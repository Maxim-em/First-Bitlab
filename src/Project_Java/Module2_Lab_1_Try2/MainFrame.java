package Project_Java.Module2_Lab_1_Try2;

import javax.swing.*;

public class MainFrame extends JFrame {
    Menu menu;
    AddPage page;
    List listOfStudents;
    Database base;
    public MainFrame(Database base){
        setSize(500, 650);
        setTitle("STUDENT APPLICATION");
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menu = new Menu(base, this);
        add(menu);
        page = new AddPage(base, this);
        add(page);
        listOfStudents = new List(base, this);
        add(listOfStudents);
        menu.setVisible(true);
        page.setVisible(false);
        listOfStudents.setVisible(false);
    }
    public void getMenu(){
        menu.setVisible(true);
        page.setVisible(false);
        listOfStudents.setVisible(false);
    }
    public void getPage(){
        menu.setVisible(false);
        page.setVisible(true);
        listOfStudents.setVisible(false);
    }
    public void getListOfStudents(){
        menu.setVisible(false);
        page.setVisible(false);
        listOfStudents.setVisible(true);
    }
}
