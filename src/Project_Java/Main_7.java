package Project_Java;

import java.util.Scanner;

public class Main_7 {
    /*
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);

        //Zadanie 1
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        System.out.println(max(a, b, c));
    }
    public static int max(int a, int b, int c){
        int max=0;
        if (a>b){
            if (a>c){
                max=a;
            }
            else {
                max=c;
            }
        }
        else{
            if (b>c){
                max=b;
            }
            else{
                max=c;
            }
        }
        return max;
    }

    //Zadanie 2
    public static void main(String [] args){
        Scanner in=new Scanner(System.in);
        String s=in.next();
        System.out.println(word(s));
    }
    public static int word(String s){
        int count=0;
        for (int i=0; i<s.length(); i++){
            if (s.charAt(i)=='a' ||s.charAt(i)=='e' || s.charAt(i)=='i'|| s.charAt(i)=='o' || s.charAt(i)=='u' ||s.charAt(i)=='y'){
                count++;
            }
        }
        return count;
    }

    //Zadanie 3
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        int n=in.nextInt();
        int mass[]= new int[n];
        for (int i=0; i<n; i++){
            mass[i]=in.nextInt();
        }
        System.out.println(counter(mass));
    }
    public static int counter(int mass[]){
        int count=0;
        for (int i=0; i<mass.length; i++){
            if (mass[i]!=0){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        int mass[][]= new int[n][m];
        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                mass[i][j]=in.nextInt();
            }
        }
        System.out.println(zero(mass, n, m));
    }
    public static int zero(int mass[][], int n, int m){
        int count=0;
        int countold=10;
        int str=count;
        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                if (mass[i][j]==0){
                    count++;
                }
            }
            if (count<=countold){
                str=i+1;
                countold=count;
            }
            count=0;
        }
        return str;
    }

     */
    //Zadanie 5
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        int [][] mass= new int[n][m];
        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                mass[i][j]=in.nextInt();
            }
        }
        int [][]result = swap(mass, n, m);
        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] swap(int mass[][], int n, int m){
        int bubblefirst[]=new int[m];
        int bubblelast[]=new int[m];
        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                if (i==0){
                    bubblefirst[j]=mass[i][j];
                }
                else if(i==mass.length-1){
                    bubblelast[j]=mass[i][j];
                }
            }
        }
        for (int j=0; j<m; j++){
            mass[0][j]=bubblelast[j];
            mass[mass.length-1][j]=bubblefirst[j];
        }
        return mass;
    }
}
