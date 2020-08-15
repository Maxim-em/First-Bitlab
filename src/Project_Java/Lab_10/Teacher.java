package Project_Java.Lab_10;

public class Teacher extends User {
    private String nickName;
    private String status;
    private String subjects[] = new String[10];
    int sizeOfSubjects = 0;
    public Teacher(){
    }
    public Teacher(int id, String login, String password, String nickName, String status){
        super(id, login, password);
        this.nickName=nickName;
        this.status=status;
    }
    public String getNickName(){
        return nickName;
    }
    public void setNickName(String nickName){
        this.nickName=nickName;
    }
    public String getStatus(){
        return status;
    }
    public void setStatus(String status){
        this.status=status;
    }
    public int getSizeOfSubjects(){
        return sizeOfSubjects;
    }
    public String getSubjects(){
        String resultSubjects=" ";
        for (int i=0; i<sizeOfSubjects; i++){
            resultSubjects+=""+subjects[i]+", ";
        }
        return resultSubjects;
    }
    public void addSubject(String subject){
        subjects[sizeOfSubjects]=subject;
        sizeOfSubjects++;
    }
    public String getUserData(){
        return "ID: "+getId()+", "+"Login: "+getLogin()+", "+"Password: "+getPassword()+", "+
                "nickName: "+getNickName()+", "+"Status: "+getStatus()+", "+"Subjects: "+ getSubjects();
    }
}
