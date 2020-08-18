package Project_Java.Module2_Mini_Project;
import javax.swing.*;

public class MainFrame extends JFrame {
    Menu menu;
    AddStudentPage page;
    ListStudentsPage listOfStudents;

    public MainFrame(){
        setSize(500, 650);
        setTitle("STUDENT APPLICATION");
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menu = new Menu(this);
        add(menu);

        page = new AddStudentPage(this);
        add(page);

        listOfStudents = new ListStudentsPage(this);
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
