package Project_Java.Lab_10;

public class ERPSystem {
    User []memory = new User[1000]; ////максимум 1000 пользователей
    int sizeOfUsers = 0;
    public void addUser(User u){
        memory[sizeOfUsers]=u;
        sizeOfUsers++;
    }
    public void printAllUsers(){
        for (int i=0; i<sizeOfUsers; i++){
            System.out.println(memory[i].getUserData());
        }
    }
    public void printUser(int index){
        for (int i=0; i<sizeOfUsers; i++){
            if (i==index){
                System.out.println(memory[i].getUserData());
            }
            else{
                System.out.println("No user in this index");
            }
        }
    }
}
