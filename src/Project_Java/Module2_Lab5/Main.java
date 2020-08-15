package Project_Java.Module2_Lab5;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] agrs){
        Scanner in = new Scanner(System.in);
        Game game= new Game();
        File file = new File("settings.data");
        if (file.exists()){
            game = readGame();
        }
        while(true){
            System.out.println("PRESS 1 TO CREATE GAME"+"\n"+
                    "PRESS 2 TO ADD PLAYER TO GAME"+"\n"+
                    "PRESS 3 TO PLAY GAME\n" +
                    "PRESS 0 TO EXIT");
            int choice =in.nextInt();
            if (choice ==1){
                System.out.println("Input game name");
                String gameName = in.next();
                System.out.println("Input IP adress");
                String ip = in.next();
                System.out.println("Input PORT");
                int port = in.nextInt();
                game = new Game(gameName, ip, port);
                saveGame(game);
            }
            else if(choice ==2){
                System.out.println("Input nickname");
                String nick = in.next();
                System.out.println("Input rating");
                double rating = in.nextDouble();
                game.addPlayer(new Players(nick, rating));
            }
            else if(choice ==3){
                System.out.println(game.toString());
            }
            else if(choice ==0){
                break;
            }
        }
    }

    public static void saveGame(Game game){
        try{
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("settings.data"));
            out.writeObject(game);
            out.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static Game readGame(){
        Game game = new Game();
        try{
            ObjectInputStream input = new ObjectInputStream(new FileInputStream("settings.data"));
            game = (Game) input.readObject();
        }catch(Exception e){
            e.printStackTrace();
        }
        return game;
    }
}
