package Project_Java.DZ_8_Zadacha_4;

public class DZ_8_Zadacha_4 {
    public static void main(String[] args){
    User users[]= new User[3];
    users[0]= new User(123456, "maxim", "qwerty", "student");
    users[1]= new User(654321, "max", "1234", "teacher");
    users[2]= new User(431256, "Log", "qwrkpqwjrpq", "assistant");
    for (int i=0; i<users.length; i++){
        System.out.println(users[i].getLogin());
    }
    for (int i=0; i<users.length; i++){
        System.out.println(users[i].setLogin("LOGIN"));
    }
    }
}
