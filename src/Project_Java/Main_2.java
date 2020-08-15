package Project_Java;

import java.util.Scanner;

public class Main_2 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        /*
        int n=in.nextInt();
        if (n>=10 && n<=20)
        {
            System.out.println("YES");}
        else{
            System.out.println("NO");}

//Zadanie 2
        System.out.println("Введите сумму в тенге");
        double ammount = in.nextDouble();
        System.out.println("Выберите валюту: \n [1] USD \n [2] EUR \n [3] GBP");
        int choise = in.nextInt();


        if(choise==1){
            System.out.println(ammount/320 + " USD");
        }
        else if( choise ==2){
            System.out.println(ammount/360 + " EUR");
        }
        else if(choise ==3){
            System.out.println(ammount/420+" GBP");
        }

        //Zadanie 4
        System.out.println("Введите логин");
        String log = in.next();
        System.out.println("Введите пароль");
        String pas = in.next();
        if (log.equals("user") && pas.equals("qwerty"))
        {
            System.out.println("Authentication completed");

        }
        else{
            System.out.println("Invalid login or password");}


        // Zadanie 5

        System.out.println("Введите год");
        int y =in.nextInt();
        if (y%4==0 && y%100!=0){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }


        System.out.println("Choose your branch: \n [1] Science \n [2] Humanitarian Subject \n [3] Art \n [4] Sport");
        int choice =in.nextInt();
        if (choice ==1){
            System.out.println("Choose your subject: \n [1] Math \n [2] Physics");
            int choice1=in.nextInt();
            if(choice1==1){
                System.out.println("You are Financier"); }
            else if (choice1==2){
                System.out.println("You are Engineer"); }
        }
        else if(choice==2){
            System.out.println("Choose your subject: \n [1] History \n [2] Foreign Languages");
            int choice2=in.nextInt();
            if(choice2==1){
                System.out.println("You are Historic or Diplomat"); }
            else if(choice2==2){
                System.out.println("You are Translator"); }
        }
        else if(choice==3){
            System.out.println("Choose your subject: \n[1]Drawing \n[2]Singing");
            int choice3=in.nextInt();
            if(choice3==1){
                System.out.println("You are Painter of Architect"); }
            else if(choice3==2){
                System.out.println("You are Singer or Tamada"); }
        }
        else if(choice==4){
            System.out.println("Choose your subject: \n [1] Team \n [2] Individual ");
            int choice4=in.nextInt();
            if(choice4==1){
                System.out.println("You are Footballer or Basketball Player"); }
            else if(choice4==2){
                System.out.println("You are Boxer or Tennis Player"); }
        }


        // Zadanie 11
        System.out.println("Введите число а");
        int a=in.nextInt();
        System.out.println("Введите число b");
        int b=in.nextInt();
        if(a==b){
            a=b=0;
        }
        else{
            if(a>b){
                b=a;
            }
            else{ a=b;
            }
        }
        System.out.println(a+"\n"+b);

        //Zadanie 12

        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        if(a<b){
            if(a<c){
                System.out.println(a);
            }
            else{
                System.out.println(c);
            }
        }
        else {
            if (b < c) {
                System.out.println(b);
            } else {
                System.out.println(c);
            }

        }


        //Zadanie 13

        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        if(a<b){
            if(a>c){
                System.out.println(a);
            }
            else {
                if (b < c) {
                    System.out.println(b);
                }
                else{
                    System.out.println(c);
                }
            }
        }

        else{
            if(b>c){
                System.out.println(b);
            }
            else{ if(a<c){
                System.out.println(a);}
                else{
                System.out.println(c);
            }


            }
        }


         */

        //Zadanie 14


        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        if(a<b){
            if(a<c){
                if(b>c){
                    System.out.println(a+"\t" +b);
                }
                else{
                    System.out.println(a+"\t"+c);
                }

            }else{
                if(b>c){
                    System.out.println(c+"\t"+b);
                }
                else{
                    System.out.println(b+"\t"+c);
                }

            }
        }

    }
}

