package Project_Java;

import java.util.Scanner;

public class Main_3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        //Zadanie 1

       /* int n=10;
        for( int i=1; i<=n; i++){
            System.out.println(i+"\t"+Math.pow(i,2));
        }



        //Zadanie 2

        int a=2;
        int a0=2;
        int b=3;
        for (int i=2; i<=b; i++){
            a=a+a0;
        }
        System.out.println(a);



        //Zadanie 3
        double res=0;

        int a=in.nextInt();
        int b=in.nextInt();
        for(int n=0; n<=b; n++){
            res=Math.pow(a,n);
            System.out.println(n+"\t"+res);
        }





        //Zadanie 4
        int a = 1;
        double b = 0;
        double c = 0;

        while (a != 0) {

            a = in.nextInt();
            if (a != 0) {
                b = b + 1;
                c = c + a;
            }
        }
        System.out.println(b + "\n" + c / b);
    }
}





//        int a=in.nextInt();
//        double b=0;
//        double c=0;
//        do {
//            b++;
//            c=c+a;
//            a=in.nextInt();
//
//        }
//        while(a!=0);
//        System.out.println(b+"\n"+c/b);


        //Zadanie 5

        int a=in.nextInt();
        int m=a;


        while(a!=0){

            a=in.nextInt();

            if(a>m){
                m=a;
            }



        }
        System.out.println(m);

*/
        //Zadanie 6

        int sum=0;
        int a=0;
        int n=in.nextInt();
        for(int i=1; i<2*n; i=i+2){
            a=i;
            sum+=a;
        }
        System.out.println(sum);
    }
}

