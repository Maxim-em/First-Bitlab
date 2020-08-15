package Project_Java.Module2_Practice2_Part2;

import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        Library library = new Library("National Library", "Almaty");
        try{
            for (int i=0; i<4; i++){
                System.out.println("Введите id, название и автора книги");
                library.addBook(new Book(in.nextInt(), in.nextLine(), in.nextLine()));
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("the library is full");
        }
        try{
            library.printBooks();
        }catch(NullPointerException e){
            System.out.println("The book is empty");
        }
    }
}
