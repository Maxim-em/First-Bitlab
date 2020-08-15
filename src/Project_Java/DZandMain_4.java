package Project_Java;

import java.util.Scanner;

public class DZandMain_4 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        /*
        //Zadanie 1
        System.out.println("Введите размер массива");
        int n=in.nextInt();
        int mass[]=new int[n];
        System.out.println("Заполните массив");
        for (int i=0; i<mass.length; i++){
            mass[i]=in.nextInt();
        }
        for (int i=mass.length-1; i>=0; i--){
            System.out.print(mass[i]+" ");
        }

        //Zadanie 2
        System.out.println("Введите размер массива n");
        int n=in.nextInt();
        int mass[]=new int[n];
        for (int i=0; i<n; i++){
            mass[i]=in.nextInt();
        }
        int sum=0;
        for (int i=0; i<n; i++){
            sum+=mass[i];
        }
        System.out.println(sum+"\t"+sum/n);

        //Zadanie 3
        System.out.println("Введите размер массива n");
        int n=in.nextInt();
        int mass[]=new int[n];
        for (int i=0; i<mass.length; i++){
            mass[i]=in.nextInt();
        }
        int max=mass[0];
        int min=mass[0];
        for (int i=0; i<mass.length; i++){
            if(mass[i]>max){
                max=mass[i];
            }
            if (mass[i]<min){
                min=mass[i];
            }
        }
        System.out.println(max+"\t"+min);

        //Zadanie 4
        System.out.println("Введите размер массива n");
        int n=in.nextInt();
        int mass[]=new int[n];
        for (int i=0; i<n; i++){
            mass[i]=in.nextInt();
        }
        int max=mass[0];
        int min=mass[0];
        for (int i=0; i<n; i++){
            if(mass[i]>max){
                max=mass[i];
            }
            if (mass[i]<min){
                min=mass[i];
            }
        }
        double sum=0;
        for (int i=0; i<n; i++){
            sum+=mass[i];
        }
        System.out.println(sum-max-min+"\n"+(sum-max-min)/(n-2));

        //Zadanie 5
        System.out.println("Введите размер массива n");
        int n=in.nextInt();
        int mass[]=new int[n];
        System.out.println("Введите массив");
        for (int i=0; i<n; i++){
            mass[i]=in.nextInt();
        }
        System.out.println("Введите число m");
        int m=in.nextInt();
        int s=0;
        for (int i=0; i<n; i++){
            if (m==mass[i]){
                s=1;
                System.out.println("YES"+"\n"+"Index: "+i);
            }
        }
        if (s==0){
            System.out.println("NO");
        }

        //Zadanie 1
        System.out.println("Введите размер массива n");
        int n=in.nextInt();
        int mass[]=new int [n];
        for (int i=0; i<n; i++){
            mass[i]=in.nextInt();
        }
        for (int i=0; i<n; i++){
            if(mass[i]>0){
                System.out.println(mass[i]);
            }
        }

        //Zadanie 2
        System.out.println("Введите размер массива n");
        int n=in.nextInt();
        int mass[]=new int[n];
        for (int i=0; i<n; i++){
            mass[i]=in.nextInt();
        }
        int max=mass[0];
        int min=mass[0];
        int j=0;
        int k=0;
        for (int i=0; i<n; i++){
            if(mass[i]>max){
                max=mass[i];
                j=i;
            }
            if (mass[i]<min){
                min=mass[i];
                k=i;
            }
        }
        int p=mass[j];
        mass[j]=mass[k];
        mass[k]=p;
        for (int i=0; i<n; i++){
            System.out.print(mass[i]+"\t");
        }

        //Zadanie 3
        System.out.println("Введите размер массива n");
        int n=in.nextInt();
        int mass[]=new int[n];
        for (int i=0; i<n; i++){
            mass[i]=in.nextInt();
        }
        int mul=1;
        for (int i=0; i<n; i++){
            if (mass[i]!=0){
                mul*=mass[i];
            }
        }
        System.out.println(mul);

        //Zadanie 4
        System.out.println("Введите размер массива n");
        int n=in.nextInt();
        int mass[]=new int[n];
        for (int i=0; i<n; i++){
            mass[i]=in.nextInt();
        }
        for (int i=0; i<n; i++){
            if (mass[i]>0){
                System.out.print(mass[i]+" ");
            }
        }
        for (int i=0; i<n; i++){
            if (mass[i]==0){
                System.out.print(mass[i]+" ");
            }
        }
        for (int i=0; i<n; i++){
            if (mass[i]<0){
                System.out.print(mass[i]+" ");
            }
        }

        //Zadanie 5
        System.out.println("Введите размер массива n");
        int n=in.nextInt();
        int mass[]=new int[n];
        for (int i=0; i<n; i++){
            mass[i]=in.nextInt();
        }
        System.out.println("Введите число m");
        int m=in.nextInt();
        double sum=0;
        int count=0;
        for (int i=0; i<n; i++){
            if (mass[i]>m){
                sum+=mass[i];
                count++;
            }
        }
        System.out.println(sum/count);

         */
        //Zadanie 6
        System.out.println("Введите размер массива n");
        int n=in.nextInt();
        int mass[]=new int[n];
        for (int i=0; i<n; i++){
            mass[i]=in.nextInt();
        }
        int sum=0;
        for (int i=0; i<n; i++){
            if(mass[i]==0){
                for (int j=i+1; j<n; j++){
                    if (mass[j]==0){
                        System.out.println(sum);
                    }
                    else{
                        sum+=mass[j];
                    }
                }
            }
        }



    }
}
