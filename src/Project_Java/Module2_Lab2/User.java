package Project_Java.Module2_Lab2;

public class User {
    private String name;
    private String surname;
    private String login;
    private String password;
    public User(){
    }

    public User(String name, String surname, String login, String password) {
        this.name = name;
        this.surname = surname;
        this.login = login;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getUserData(){
        return "Name; "+getName()+", "+"Surname; "+getSurname()+", "+"Login; "+getLogin()+", "+"Password; "+getPassword();
    }
}
