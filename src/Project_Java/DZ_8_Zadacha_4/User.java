package Project_Java.DZ_8_Zadacha_4;

public class User {
    int id;
    private String login;
    String password;
    String role;
    public User(int id,String login, String password, String role ){
        this.id = id;
        this.login=login;
        this.password=password;
        this.role=role;
    }
    public String toString(){
        return "ID: "+" "+id+"login: "+" "+login+"password: "+" "+password+"role: "+role;
    }
    public String getLogin(){
        return login;
    }
    public String setLogin(String login){
        this.login=login;
        return login;
    }
}
