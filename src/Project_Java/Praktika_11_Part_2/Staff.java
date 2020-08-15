package Project_Java.Praktika_11_Part_2;

public class Staff implements Workers{
    private int id;
    private String name;
    private String surname;
    private double salary;
    public Staff(){
    }
    public Staff(int id, String name, String surname, double salary){
        this.id=id;
        this.name=name;
        this.surname=surname;
        this.salary=salary;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getSurname(){
        return surname;
    }
    public void setSurname(String surname){
        this.surname=surname;
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(int salary){
        this.salary=salary;
    }
    public String getWorkerData(){
        return "ID: "+getId()+", "+"Name: "+getName()+", "+"Surname: "+getSurname()+
                ", "+"Salary: "+getSalary();
    }

}
