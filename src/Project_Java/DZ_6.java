package Project_Java;

import java.util.Scanner;

public class DZ_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
        //Zadanie 1
        int n=in.nextInt();
        int m=in.nextInt();
        int mass[][]=new int[n][m];
        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                mass[i][j]=in.nextInt();
            }
        }
        int max=mass[0][0];
        for (int i=0; i<n; i++){
            max=mass[i][0];
            for (int j=0; j<m; j++){
                if (mass[i][j]>max){
                    max=mass[i][j];
                }
            }
            System.out.println(max);
        }

        //Zadanie 2
        int n=in.nextInt();
        int mass[][]= new int[n][n];
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                mass[i][j]=in.nextInt();
            }
        }
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                if (j==mass.length-1-i || i==j){
                    System.out.print("x ");
                }
                else{
                    System.out.print(mass[i][j]+" ");
                }
            }
            System.out.println();
        }

        //Zadanie 3
        int n=in.nextInt();
        int mass[][]=new int[n][n];
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                mass[i][j]=in.nextInt();
            }
        }
        int bubble=0;
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                if (i<mass.length/2){
                    bubble=mass[i][j];
                    mass[i][j]=mass[mass.length/2+1+i][j];
                    mass[mass.length/2+1+i][j]=bubble;
                }
                System.out.print(mass[i][j]+" ");
            }
            System.out.println();
        }
        //Zadanie 4
        int n=in.nextInt();
        int m=in.nextInt();
        int mass[][]= new int[n][m];
        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                mass[i][j]=in.nextInt();
            }
        }
        int max=mass[0][0];
        int min=mass[0][0];
        int bubble=0;
        int maxIndex=0;
        int minIndex=0;
        for (int j=0; j<m; j++){
            for (int i=0; i<n; i++){
                if (mass[i][j]>max){
                    max=mass[i][j];
                    maxIndex=i;
                }
                if (mass[i][j]<min){
                    min=mass[i][j];
                    minIndex=i;
                }
            }
            max=bubble;
            mass[maxIndex][j]=mass[minIndex][j];
            mass[minIndex][j]=bubble;
        }
        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                System.out.print(mass[i][j]+" ");
            }
            System.out.println();
        }

         */
        //Zadanie 5
        int n=in.nextInt();
        int m=in.nextInt();
        int mass[][]= new int[n][m];
        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                mass[i][j]=in.nextInt();
            }
        }
        int k=in.nextInt();
        int p=k;
        for (int j=0; j<m; j++){
            for (int i=0; i<n; i++){
                if (k!=0){
                    if (mass[i][j]<0){
                        k--;
                        System.out.print(mass[i][j]+" ");
                    }
                    else if (mass[i][j]>0 && i==n-1){
                        System.out.print("x ");
                    }
                }
            }
            k=p;
        }
    }
}
