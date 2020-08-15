package Project_Java;

import java.util.Scanner;

public class DZ1_Zadacha3 {
    public static void main(String[] args) {
        //Dz_1_Zadacha_3
        Scanner in = new Scanner(System.in);
        System.out.println("Введите университет");
        String u=in.next();
        System.out.println("Введите факультет");
        String f=in.next();
        System.out.println("Введите предмет");
        String s = in.next();
        System.out.println("University: "+u);
        System.out.println("Faculty: "+f);
        System.out.println("Subject: "+s);

    }
}
