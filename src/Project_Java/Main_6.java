package Project_Java;

import java.util.Scanner;

public class Main_6 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        /*
        //Zadanie 3
        int n=in.nextInt();
        int m=in.nextInt();
        int mass[][]=new int[n][m];
        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                mass[i][j] = in.nextInt();
            }
        }
        int count=0;
        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                if (mass[i][j]<0){
                    count++;
                }
            }
            System.out.println(count);
            count=0;
        }

        //Zadanie 4
        int n=in.nextInt();
        int mass[][]=new int [n][n];
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                mass[i][j]=in.nextInt();
            }
        }
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                if (i==j){
                    System.out.print("x ");
                }
                else{
                    System.out.print(mass[i][j]+" ");
                }
            }
            System.out.println();
        }

         */
        //Zadanie 5
        int n=in.nextInt();
        int mass[][]= new int[n][n];
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                mass[i][j]=in.nextInt();
            }
        }
        boolean b=false;
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                if (mass[i][j]==mass[j][i]){
                    b=true;
                }
                else{
                    b=false;
                    break;
                }
            }
        }
        if (b){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

    }
}
