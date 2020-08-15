package Project_Java.Lab_11;

import java.util.Scanner;

public class Lab_11 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        McDonalds mac1= new McDonalds();
        McDonalds mac2= new McDonalds();
        KFC kfc=new KFC();
        mac1.addBurger(1000);
        mac1.addBurger(2000);
        mac2.addBurger(5000);
        mac2.addBurger(500);
        mac1.addWorker(1000);
        mac1.addWorker(1200);
        mac2.addWorker(700);
        mac2.addWorker(800);
        kfc.addBasket(6000);
        kfc.addBasket(7000);
        City almaty = new City("Almaty");
        almaty.addRestaurant(mac1);
        almaty.addRestaurant(mac2);
        almaty.addRestaurant(kfc);
        System.out.println(almaty.getTotalTax());
    }
}
