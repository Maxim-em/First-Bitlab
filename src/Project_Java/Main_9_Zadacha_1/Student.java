package Project_Java.Main_9_Zadacha_1;

public class Student extends User {
    private double gpa;
    private String courses[] = new String[100];
    private int indexOfCourses = 0;
    public Student(){
    }
    public Student(int id, String login, String password, String name, String surname, double gpa){
        super(id, login, password, name, surname);
        this.gpa=gpa;
    }
    public double getGpa(){
        return gpa;
    }
    public void setGpa(double gpa){
        this.gpa=gpa;
    }
    public String getData(){
        return "Id: "+getId()+", "+"login: "+getLogin()+", "+"password: "+getPassword()+
                ", "+"name: "+getName()+", "+"surname: "+getSurname()+", "+"gpa: "+getGpa();
    }
    public void addCourse(String course){
        courses[indexOfCourses]=course;
        indexOfCourses++;
    }
    public void showCourses(){
        for (int i=0; i<indexOfCourses; i++){
            System.out.println(courses[i]);
        }
    }
}
