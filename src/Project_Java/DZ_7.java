package Project_Java;

import java.util.Scanner;

public class DZ_7 {
    /*
    //Zadanie 1
    public static void main(String [] args){
        Scanner in= new Scanner(System.in);
        int n=in.nextInt();
        String []s = new String[n];
        for (int i=0; i<n; i++){
            s[i]=in.next();
        }
        words(s, n);


    }
    public static void words(String[] s, int n){
        int count =0;
        for (int i=0; i<n; i++){
            for (int j=0; j<s[i].length(); j++){
                if (s[i].charAt(j)=='a' ||s[i].charAt(j)=='e' || s[i].charAt(j)=='i' || s[i].charAt(j)=='o' || s[i].charAt(j)=='u' ||s[i].charAt(j)=='y'){
                    count++;
                }
            }
            if (count>4){
                System.out.println(s[i]);
            }
            count=0;
        }
    }

    //Zadanie 2
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        int n=in.nextInt();
        int mass[] = new int[n];
        for (int i=0; i<n; i++){
            mass[i]=in.nextInt();
        }
        int m=in.nextInt();
        method(mass, n, m);

    }
    public static void method(int mass[],int n, int m){
        for (int i=0; i<n; i++){
            if (mass[i]==i && mass[i]%m!=0){
                System.out.println(mass[i]);
            }
        }
    }

    //Zadanie 3
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        String text=in.next();
        String subtext= in.next();
        cont(text, subtext);
    }
    public static void cont(String text, String subtext){
        if (text.contains(subtext)){
            System.out.println("YES");
        }
        else
            System.out.println("NO");
    }

    //Zadanie 5
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        int mass[][]= new int[n][m];
        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                mass[i][j]=in.nextInt();
            }
        }
        System.out.println(sum(mass, n, m));
    }
    public static int sum(int mass[][], int n, int m){
        int sum=0;
        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                if (i%2!=0 && j%2!=0){
                    sum+=mass[i][j];
                }
            }
        }
        return sum;
    }


     */
}
