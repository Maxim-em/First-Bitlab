package Project_Java.Module2_Lab6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Car cars[] = new Car[10];
        ThreadGroup group = new ThreadGroup("speedCars");
        cars[0] = new Car(group,"Ferrari 1", 50, 500);
        cars[1] = new Car(group, "Mercedes 1", 45, 500);
        cars[2] = new Car(group, "Renault 2", 38, 500);
        cars[3] = new Car(group, "BMW 1", 33, 500);
        cars[4] = new Car(group, "BMW 2", 29, 500);
        cars[5] = new Car(group, "BMW 3", 26, 500);
        cars[6] = new Car(group, "Renault 2", 23, 500);
        cars[7] = new Car(group, "Mercedes 2", 21, 500);
        cars[8] = new Car(group, "Mercedes 3", 20, 500);
        cars[9] = new Car(group, "Ferrari 2", 18, 500);
        for (int i=0; i<10; i++){
            cars[i].start();
        }
        while(group.activeCount()>0){

        }
        for (int i=0; i<10; i++){
            System.out.println("Place "+i+": "+cars[i].toString());
        }
    }
}
