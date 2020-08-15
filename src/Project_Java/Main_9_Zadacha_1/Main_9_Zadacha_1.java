package Project_Java.Main_9_Zadacha_1;

import java.util.Scanner;

public class Main_9_Zadacha_1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        User users[]= new User[3];
        Staff staff[]=new Staff[3];
        Student students[] = new Student[3];
        users[0]= new User(111, "maxim", "qwerty", "Maxim", "Em");
        users[1]= new User(222, "Log", "1234", "Ivan", "Surname");
        users[2]= new User(333, "Programmer", "9876", "Name", "N");
        staff[0]= new Staff(444, "anat","8888", "Anatoliy", "Ann", 20000 );
        staff[1]= new Staff(555, "alex","9284", "Alexander", "Al", 30000 );
        staff[2]= new Staff(666, "arm","2267", "Arman", "arma", 25000 );
        students[0]= new Student(777, "as","2857", "Asem", "Ab", 3.4 );
        students[1]= new Student(888, "naz","2967", "Nazerke", "Ka", 3.2 );
        students[2]= new Student(999, "am","8662", "Amir", "Sl", 3.7 );
        for (int i=0; i<3; i++){
            students[i].addCourse("Math");
            students[i].addCourse("Physics");
            staff[i].addSubject("Java");
            staff[i].addSubject("PE");
        }
        User[] all= new User[9];
        all[0]=users[0];
        all[1]=users[1];
        all[2]=users[2];
        all[3]=staff[0];
        all[4]=staff[1];
        all[5]=staff[2];
        all[6]=students[0];
        all[7]=students[1];
        all[8]=students[2];
        System.out.println("PRESS [1] TO ADD USER");
        System.out.println("PRESS [2] TO LIST USERS");
        System.out.println("PRESS [0] TO EXIT");
        int choice=in.nextInt();
        if (choice==1){
            User newby = new User();
            newby=null;
            System.out.println("PRESS [1] TO ADD STUDENT");
            System.out.println("PRESS [2] TO ADD STAFF");
            int choice2=in.nextInt();
            if (choice2==1){
                System.out.println("Insert id, login, password, name, surname, gpa");
                newby = new Student(in.nextInt(), in.next(), in.next(), in.next(), in.next(), in.nextDouble());
                System.out.println(newby.getData());
            }
            else if(choice2==2){
                System.out.println("insert id, login, password, name, surname, salary");
                newby = new Staff(in.nextInt(), in.next(), in.next(), in.next(), in.next(), in.nextDouble());
                System.out.println(newby.getData());
            }

        }
        else if(choice==2){
            System.out.println("PRESS [1] TO LIST STUDENTS\n" +
                    "PRESS [2] TO LIST STAFF");
            int choice3 =in.nextInt();
            if (choice3==1){
                for (int i=0; i<9; i++){
                    if (all[i] instanceof Student){
                        System.out.println(all[i].getData());
                    }
                }
            }
            else if(choice3==2){
                for (int i=0; i<9; i++){
                    if (all[i] instanceof Staff){
                        System.out.println(all[i].getData());
                    }
                }
            }

        }
        else if(choice ==0){
            System.out.println("Exit");
        }

    }
}
