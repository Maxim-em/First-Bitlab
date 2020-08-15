package Project_Java;

import java.util.Scanner;

public class DZ1_Zadacha5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число x");
        double x=in.nextDouble();
        System.out.println("Введите число y");
        double y=in.nextDouble();
        System.out.println("Введите число z");
        double z=in.nextDouble();
        double a=Math.pow(x,4);
        a=a+4*x*Math.pow(y,2);
        a=a-4*y*z;
        a=a+Math.pow(z,4);
        System.out.println(a);

    }
}
