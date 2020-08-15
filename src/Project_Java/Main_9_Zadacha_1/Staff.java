package Project_Java.Main_9_Zadacha_1;

public class Staff extends User{
    private double salary;
    private String subjects[] = new String[100];
    private int indexOfSubject = 0;
    public Staff(){
    }
    public Staff(int id, String login, String password, String name, String surname, double salary){
        super(id, login, password,name, surname);
        this.salary=salary;
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }
    public String getData(){
        return "Id: "+getId()+", "+"login: "+getLogin()+", "+"password: "+getPassword()+
                ", "+"name: "+getName()+", "+"surname: "+getSurname()+", "+"salary: "+getSalary();
    }
    public void addSubject(String subject){
        subjects[indexOfSubject]=subject;
        indexOfSubject++;
    }
    public void showSubjects(){
        for (int i=0; i<indexOfSubject; i++){
            System.out.println(subjects[i]);
        }
    }
}
