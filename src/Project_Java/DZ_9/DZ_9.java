package Project_Java.DZ_9;

import java.util.Scanner;

public class DZ_9 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Library Biblioteka= new Library("School library", "Almaty", "Kazakhstan");
        ScientificBook science1=new ScientificBook("Math", "Code1", 200, 2000, "Skanavi");
        ScientificBook science2=new ScientificBook("Physics", "Code2", 150, 3000, "Soloviev");
        ScientificBook science3=new ScientificBook("Biology", "Code3", 220, 4000, "B");
        LiteratureBook literature1= new LiteratureBook("RusLit", "Code 4", 100, "Chehov", 1867);
        LiteratureBook literature2= new LiteratureBook("kazLit", "Code 5", 180, "Zhumabayev", 1967);
        LiteratureBook literature3= new LiteratureBook("USLit", "Code 6", 160, "Byron", 1767);
        Biblioteka.addBook(science1);
        Biblioteka.addBook(science2);
        Biblioteka.addBook(science3);
        Biblioteka.addBook(literature1);
        Biblioteka.addBook(literature2);
        Biblioteka.addBook(literature3);

        System.out.println("PRESS [1] TO SEARCH BOOK BY NAME");
        System.out.println("PRESS [2] TO SEARCH BOOK BY CODE");
        System.out.println("PRESS [3] TO SEARCH BOOK BY PAGES AMOUNT");
        int choice=in.nextInt();
        if (choice ==1){
            System.out.println("INSERT NAME OF THE BOOK:");
            String newName=in.next();
            for (int i=0; i<Biblioteka.getSizeOfBooks(); i++){
                if (newName.equals(Biblioteka.getnameofBooks(i))){
                    System.out.println("Your book on the "+(i+1)+"desk");
                }
            }
        }
        else if(choice ==2){
            System.out.println("INSERT CODE OF THE BOOK:");
            String newCode=in.next();
            for (int i=0; i<Biblioteka.getSizeOfBooks(); i++){
                if (newCode.equals(Biblioteka.getcodeofBooks(i))){
                    System.out.println("Your book on the "+(i+1)+"desk");
                }
            }
        }
        else if(choice ==3){
            System.out.println("INSERT MINIMUM AMOuNT OF PAGES:");
            int min=in.nextInt();
            System.out.println("INSERT MAXIMUM AMOUNT OF PAGES:");
            int max=in.nextInt();
            for (int i=0; i<Biblioteka.getSizeOfBooks(); i++){
                if (Biblioteka.getAmountOfPage(i)>min && Biblioteka.getAmountOfPage(i)<max){
                    System.out.print("Name: "+Biblioteka.getnameofBooks(i)+" ");
                    System.out.print("Pages: "+Biblioteka.getAmountOfPage(i)+" ");
                    System.out.print("Code: "+Biblioteka.getcodeofBooks(i)+" \n");
                }
            }
        }
    }
}
