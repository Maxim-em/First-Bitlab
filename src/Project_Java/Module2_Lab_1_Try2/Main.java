package Project_Java.Module2_Lab_1_Try2;

public class Main {
    public static void main(String[] args){
        Database base = new Database("KazNU");
        MainFrame frame= new MainFrame(base);
        frame.setVisible(true);
    }
}
