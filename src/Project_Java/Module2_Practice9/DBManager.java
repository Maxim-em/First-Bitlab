package Project_Java.Module2_Practice9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DBManager {
    private Connection connection;

    public void connect(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/first_bd?useUnicode=true&serverTimezone=UTC","root", "");
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void addItem(Item item){
        try{
            PreparedStatement statement = connection.prepareStatement("" +
                    "INSERT INTO items (name, price)" +
                    "VALUES (?, ?)");
            statement.setString(1, item.getName());
            statement.setDouble(2, item.getPrice());
            statement.executeUpdate();
            statement.close();

        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public ArrayList<Item> getAllItems(){
        ArrayList<Item> itemList = new ArrayList<>();
        try{
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM items");
            ResultSet resultSet = statement.executeQuery();

            while(resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                double price = resultSet.getDouble("price");
                itemList.add(new Item(id, name, price));
            }
            statement.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        return itemList;
    }

    public void deleteItem(int id){
        try{
            PreparedStatement statement = connection.prepareStatement("" +
                    "DELETE FROM items WHERE id =?");
            statement.setInt(1, id);
            statement.executeUpdate();
            statement.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
