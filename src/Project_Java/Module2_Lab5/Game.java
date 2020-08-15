package Project_Java.Module2_Lab5;

import java.io.*;
import java.util.ArrayList;

public class Game implements Serializable {
    private String gameName;
    private String ipAddress;
    private int port;
    private ArrayList<Players> players = new ArrayList<Players>();

    public Game() {
    }

    public Game(String gameName, String ipAddress, int port) {
        this.gameName = gameName;
        this.ipAddress = ipAddress;
        this.port = port;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public ArrayList<Players> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Players> players) {
        this.players = players;
    }

    @Override
    public String toString() {
        return "Game{" +
                "gameName='" + gameName + '\'' +
                ", ipAddress='" + ipAddress + '\'' +
                ", port=" + port +
                ", players=" + players +
                '}';
    }
    public void addPlayer(Players player){
        players.add(player);
        try{
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("settings.data"));
            out.writeObject(this);
            out.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
