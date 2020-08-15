package Project_Java.Module2_Practice9;

import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        DBManager db = new DBManager();
        db.connect();
        while(true){
            System.out.println("PRESS [1] TO ADD ITEMS\n" +
                    "PRESS [2] TO LIST ITEMS\n" +
                    "PRESS [3] TO DELETE ITEMS\n" +
                    "PRESS [0] TO EXIT");
            int choice =in.nextInt();
            if (choice ==1){
                System.out.println(" Insert name:");
                String name = in.next();
                System.out.println("Insert price:");
                double price = in.nextDouble();
                db.addItem(new Item(1, name, price));
            }
            else if(choice ==2){
                System.out.println(db.getAllItems().toString());
            }
            else if(choice ==3){
                System.out.println("Insert ID:");
                int id=in.nextInt();
                db.deleteItem(id);
            }
            else if(choice ==0){
                break;
            }
        }
    }
}
