package Project_Java;

import java.util.Scanner;

public class Main_5 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        /*
        String word = in.next();
        boolean b = false;
        for (int i=0; i<word.length(); i++){
            if (word.charAt(i)!= word.charAt(word.length()-1-i)){
                b=false;
                break;
            }
            else b=true;
        }
        if (b){
            System.out.println("YES");
        } else{
            System.out.println("NO");
        }

        //Zadanie 2
        String word=in.next();
        int count=0;
        for (int i=0; i<word.length(); i++){
            if (word.charAt(i)=='a' ||word.charAt(i)=='e' || word.charAt(i)=='i'|| word.charAt(i)=='o'|| word.charAt(i)=='u'){
                count++;
            }
        }
        System.out.println(count);

        //Zadanie 3
        String s1=in.next();
        String s2=in.next();
        int index=s1.indexOf(s2);
        if (index!=-1){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

         */
        //Zadanie 4
        String s1=in.next();
        String s2=in.next();
        boolean b=false;
        if (s1.length()==s2.length()){
            for (int i=0; i<s1.length(); i++){
                if (s1.charAt(i)!=s2.charAt(s2.length()-1-i)){
                    b=false;
                    break;
                }
                else b=true;
            }
        }
        else{
            b=false;
        }
        if (b){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    }
}
