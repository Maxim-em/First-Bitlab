package Project_Java.Module2_Practice5;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] agrs){
        Scanner in = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        File st= new File("students.txt");
        if (st.exists()){
            students = readStudents();
        }
        else{
            writeStudent(students);
        }
        while(true){
            System.out.println(" PRESS [1] TO ADD STUDENT"+"\n"+
                            "PRESS [2] TO LIST STUDENTS"+"\n"+ "PRESS [0] TO EXIT");
            int choice = in.nextInt();
            if (choice ==1){
                System.out.println("Input Name");
                String name = in.next();
                System.out.println("Input surname");
                String surname = in.next();
                System.out.println("PRESS [1] TO ADD SUBJECT"+"\n"+
                        "PRESS [0] TO GO TO MAIN MENU");
                int choice1=in.nextInt();
                if (choice1==1){
                    System.out.println("Input name of subject");
                    String nameOfSubject = in.next();
                    System.out.println("Input credits");
                    int credits = in.nextInt();
                    Student student = new Student(name, surname);
                    student.addSubject(new Subject(nameOfSubject, credits));
                    students.add(student);
                    writeStudent(students);
                }
            }
            else if(choice ==2){
                students =readStudents();
                for (Student s:students){
                    System.out.println(s.toString());
                }
            }
            else if(choice ==0){
                break;
            }
        }
    }


    public static void writeStudent(ArrayList <Student> students){
        try{
            ObjectOutputStream outputStream =
                    new ObjectOutputStream(new FileOutputStream("students.txt"));
            outputStream.writeObject(students);
            outputStream.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }


    public static ArrayList<Student> readStudents(){
        ArrayList<Student> students = new ArrayList<>();
        try{
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("students.txt"));
            students = (ArrayList<Student>) inputStream.readObject();
        }catch(Exception e){
            e.printStackTrace();
        }
        return students;
    }
}
