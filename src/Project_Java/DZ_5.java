package Project_Java;

import java.util.Scanner;

public class DZ_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
        //Zadanie 1 ???
        String s=in.nextLine();
        String res=" ";
        String s1[] = s.split(" ");
        String s2[]=s1;
        for (int i=0; i<s1.length; i++){
            s2[i]=s1[i].toUpperCase();
        }
        for (int i=0; i<s1.length; i++){
            if (s1[i].charAt(0)==s2[i].charAt(0)){
                System.out.print(s1[i]+" ");
            }
        }

        //Zadanie 2 ???
        String s=in.nextLine();
        String s1[]=s.split(" ");
        String s2[]=s1;
        for (int i=0; i<s1.length; i++){
            for (int j=0; j<s1[i].length(); j++){
                s1[i].charAt(j)=s2[i].charAt(s1[i].length()-1-j);
            }
            System.out.print(s1[i]+" ");
        }

        //Zadanie 3 ???
        String s=in.nextLine();
        String s1[]=s.split(" ");
        String su[]=s1;
        String sd[]=s1;
        String res[]=s1;
        for (int i=0; i<s1.length; i++){
            su[i]=s1[i].toUpperCase();
            sd[i]=s1[i].toLowerCase();
        }
        for (int i=0; i<s1.length; i++){
            for (int j=0; j<s1[i].length(); j++){
                if (s1[i].charAt(j)==su[i].charAt(j)){
                    res[i].charAt(j)=sd[i].charAt(j);
                }
                if (s1[i].charAt(j)==sd[i].charAt(j)){
                    res[i].charAt(j)=sd[i].charAt(j);
                }
            }
        }
        for (int i=0; i<s1.length; i++){
            System.out.print(s1[i]+" ");
        }

        //Zadanie 4
        String s=in.next();
        for (int i=0; i<s.length(); i++){
            System.out.print(""+s.charAt(i)+s.charAt(i));
        }


         */
        //Zadanie 5
        String s=in.nextLine();
        String s1[]=s.split(" ");
        String word = "almaty";
        int count = 0;
        for (int i=0; i<s1.length; i++){
            if (word.equalsIgnoreCase(s1[i])){
                count++;
            }
        }
        System.out.println(count);

    }
}
