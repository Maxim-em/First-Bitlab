package Project_Java.Lab_10;

import java.util.Scanner;

public class Lab_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ERPSystem Univer = new ERPSystem();
        while (true) {
            System.out.println("PRESS [1] TO ADD USER");
            System.out.println("PRESS [2] TO LIST USERS");
            System.out.println("PRESS [0] TO EXIT");
            int choice = in.nextInt();
            if (choice == 1) {
                System.out.println("PRESS [1] TO ADD STUDENT" + "\n" + "PRESS [2] TO ADD TEACHER");
                int choice2 = in.nextInt();
                if (choice2 == 1) {
                    System.out.println(" ID:\n" + " Login:\n" +
                            "\n" + " Password:\n" + "\n" +
                            "Name:\n" + "\n" + "Surname:\n" +
                            "\n" + "Group:\n" + "\n" + "GPA:");
                    Student newStudent = new Student(in.nextInt(), in.next(), in.next(),
                            in.next(), in.next(), in.next(), in.nextDouble());
                    Univer.addUser(newStudent);
                } else if (choice2 == 2) {
                    System.out.println(" ID:\n"+" Login:\n" + "\n" + " Password:\n" +
                            " Nick Name:\n" + "\n" + "Status:");
                    Teacher newTeacher = new Teacher(in.nextInt(), in.next(), in.next(), in.next(), in.next());
                    Univer.addUser(newTeacher);
                    System.out.println("PRESS [1] TO ADD SUBJECT\n" +
                            "\n" + "PRESS [0] TO FINISH ADDING SUBJECT");
                    int choice3 = in.nextInt();
                    while (choice3 == 1) {
                        System.out.println("Insert title of subject");
                        newTeacher.addSubject(in.next());
                        System.out.println("PRESS [1] TO ADD SUBJECT\n" +
                                "\n" + "PRESS [0] TO FINISH ADDING SUBJECT");
                        choice3=in.nextInt();
                    }
                    if (choice3 == 0) {
                        System.out.println("EXIT");
                    }
                }
            }
            else if(choice ==2){
                Univer.printAllUsers();
            }
            else if(choice ==0){
                System.out.println("EXIT");
                break;
            }
        }
    }
}
