package Project_Java.Praktika_11_Part_2;

public class HRManagers implements Workers {
    private int id;
    private String fullName;
    private double salary;
    public HRManagers(){
    }
    public HRManagers(int id, String fullName, double salary){
        this.id=id;
        this.fullName=fullName;
        this.salary=salary;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getFullName(){
        return fullName;
    }
    public void setFullName(String fullName){
        this.fullName=fullName;
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(int salary){
        this.salary=salary;
    }
    public String getWorkerData(){
        return "ID: "+getId()+", "+"FullName: "+getFullName()+", "+"Salary: "+getSalary();
    }
}
