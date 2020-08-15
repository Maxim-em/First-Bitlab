package Project_Java.Module2_Practice3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        ArrayList<Players> list = new ArrayList<Players>();
        list.add(new Players("qwert", 20000, 25));
        list.add(new Players("qwerty", 30000, 26));
        list.add(new Players("qwertyu", 25000, 27));
        list.add(new Players("qwertyui", 24000, 28));
        list.add(new Players("qwertyuio", 23000, 22));
        list.add(new Players("qwerta", 21000, 23));
        list.add(new Players("qwertas", 22000, 24));
        list.add(new Players("qwertasd", 27000, 29));
        list.add(new Players("qwertasdf", 28000, 30));
        list.add(new Players("qwertasdfg", 29000, 31));
        int avAge=0;
        double avPrice=0;
        for (Players p:list){
            avAge+=p.getAge();
            avPrice+=p.getPrice();
        }
        System.out.println(avAge);
        System.out.println(avPrice/10);
    }
}
