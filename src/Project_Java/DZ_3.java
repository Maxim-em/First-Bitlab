package Project_Java;

import java.util.Scanner;

public class DZ_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Lab 1
        /*
        //Zadanie 1

        int n=in.nextInt();
        int m=1;
        for (int i=1; i<=n; i++){
            m=m*i;
        }
        System.out.println(m);

        //Zadanie 2

        double a=in.nextDouble();
        double m=a;
        while(a!=0){
            a=in.nextDouble();
            if (a!=0) {
                m = m * a;
            }
        }
        System.out.println(m);

      //Zadanie 3
        int a=1;
        int sum=0;
        while(a!=0){
            a=in.nextInt();
            if (a%2==1 || a%2==-1){
                sum=sum+a;
            }
        }
        System.out.println(sum);

        //Zadanie 4
        System.out.println("Введите число n");
        double n = in.nextInt();
        double sum=0;
        for(double i=1; i<=n; i++){
            sum+=1/i;
        }
        System.out.println(sum);

        //Zadanie 5
        double a=in.nextDouble();
        double a0=a;
        double b=in.nextDouble();
        for (int i=2; i<=b; i++ ){
            a=a0*a;
        }
        System.out.println(a);

        //Lab 2
        //Zadanie 1
        int x=in.nextInt();
        for (int i=1; i<=x; i++){
            if (x%i==0){
                System.out.println(i);
            }
        }

        //Zadanie 2
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        int d=in.nextInt();
        for (int i=a; i<=b; i++){
            if(i%d==c){
                System.out.println(i);
            }
        }

        //Zadanie 5
        int n=in.nextInt();
        int m=1;
        for (int i=1; i<=n; i++){
            m=2*m;
        }
        System.out.println(m);

        //Zadanie 6
        int n=in.nextInt();
        int sum=0;
        for (int i=1; i<=n; i++){
            sum+=i*i;
        }
        System.out.println(sum);

        //Zadanie 7
        int sum=0;
        for (int n=in.nextInt(); n!=0; n=n/10){
            sum+=(n%10);
        }
        System.out.println(sum);

        //Zadanie 9
        int b=0;
        for (int n=in.nextInt(); n!=0; n=n/10){
            if (n%10==4 || n%10==7){
                b++;
            }
        }
        if (b==4 || b==7){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

        //Zadanie 10
        int k=in.nextInt();
        int n=in.nextInt();
        int w=in.nextInt();
        int sum=0;
        for (int i=1; i<=w; i++){
            sum+=i*k;
        }
        System.out.println(sum-n);

        //Lab 3
        //Zadanie 1
        int n=in.nextInt();
        int f=1;
        for (int i=1; i<=n; i++){
            f=f*i;
        }
        System.out.println(f);

        //Zadanie 2
        int n=in.nextInt();
        double r=1;
        for (double i=1; i<=n; i++){
            r=r*(1+1/(i*i));
        }
        System.out.println(r);

        //Zadanie 3 ???
        int n = in.nextInt();
        double result = 0;
        for (double i = 1; i <= n; i++) {
           result=Math.sqrt(2+result);

        }
        System.out.println(result);

        //Zadanie 4
        double a=in.nextDouble();
        int n=in.nextInt();
        double sum=1;
        for (int i=1; i<=n; i++){
            sum*=(a+i-1);
        }
        System.out.println(sum);

        //Zadanie 5
        double a=in.nextDouble();
        int n=in.nextInt();
        double sum=0;
        double m=1;
        for (int i=0; i<=n; i++){
            m=m/(a+i);
            sum+=m;
        }
        System.out.println(sum);

         */

        //Zadanie 6
        double a=in.nextDouble();
        int n=in.nextInt();
        double sum=1/a;
        for (int i=1; i<=n; i++){
            sum+=1/Math.pow(a,2*i);
        }
        System.out.println(sum);



    }
}
