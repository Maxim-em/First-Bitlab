package Project_Java.Praktika_11_Part_2;

public class Programmers implements  Workers{
    private int id;
    private String nickname;
    private double salary;
    private double bonusSalary;
    private double KPIValue;
    public Programmers(){
    }
    public Programmers(int id, String nickname,double salary, double bonusSalary, double KPIValue){
        this.id=id;
        this.nickname=nickname;
        this.salary=salary;
        this.bonusSalary=bonusSalary;
        this.KPIValue=KPIValue;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getNickname(){
        return nickname;
    }
    public void setNickname(String nickname){
        this.nickname=nickname;
    }
    public double getSalary(){
        return salary + KPIValue*bonusSalary;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }
    public String getWorkerData(){
        return "ID: "+getId()+", "+"nickname: "+getNickname()+", "+"Salary: "+getSalary();
    }
}
