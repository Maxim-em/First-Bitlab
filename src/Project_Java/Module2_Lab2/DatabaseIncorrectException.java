package Project_Java.Module2_Lab2;

public class DatabaseIncorrectException extends Exception{
    @Override
    public String getMessage() {
        return "Java Connection Exception at DatabaseDriver caused by incorrect data…";
    }
}
