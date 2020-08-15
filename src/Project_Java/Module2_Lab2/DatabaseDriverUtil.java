package Project_Java.Module2_Lab2;

public class DatabaseDriverUtil {
    static Connection connection;
    public static Connection getConnection(String url, String dbName, String userName, String password) throws DatabaseIncorrectException{
        if (!url.equals("https://bitlab.kz:3306/ ") || !dbName.equals("maindatabase")
        || !userName.equals("root") || !password.equals("bitlab2017")){
            throw new DatabaseIncorrectException();
        }
        return new Connection();
    }
}
