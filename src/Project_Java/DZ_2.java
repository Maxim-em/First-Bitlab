package Project_Java;

import java.util.Scanner;

public class DZ_2 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        /*
        //Zadanie 1
        int a=in.nextInt();
        int b=in.nextInt();
        if (a>b){
            System.out.println(a);
        }
        else{
            System.out.println(b); }


        //Zadanie 2

        int a=100000;
        int b=200000;
        int c=500000;
        if(a>c){
            if (a>b){
                System.out.println(a);
            }
            else{
                System.out.println(b); }
        }
        else{
            if (c>b){
                System.out.println(c);
            }
            else{
                System.out.println(b);
            }
        }



        //Zadanie 3

        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        if (a+b>c && a+c>b && b+c>a){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }



        //Zadanie 4

        int s1=in.nextInt();
        int s2=in.nextInt();
        int s3=in.nextInt();

        if(s1>s2){
            if(s3>s1){
                System.out.println(s3-s2);
            }
            else{
                if(s2>s3){
                    System.out.println(s1-s3);
                }
                else{
                    System.out.println(s1-s2);
                }
            }
        }
        else{
            if(s3>s2){
                System.out.println(s3-s1);
            }
            else{
                if(s1>s3){
                    System.out.println(s2-s3);
                }
                else{
                    System.out.println(s2-s1);
                }
            }
        }


        //Zadanie 5

        int l1=in.nextInt();
        int l2=in.nextInt();
        int f1=in.nextInt();
        int f2=in.nextInt();
        if(l1==f1 || l2==f2)
        {
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

         */

        //Zadanie 6

        int s1=in.nextInt();
        int s2=in.nextInt();
        int f1=in.nextInt();
        int f2=in.nextInt();
        if(f1-s1==f2-s2){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

    }
}
