package Project_Java.Praktika_10;

public class Praktika_10 {
    public static void main(String[] args){
        FerrariEngine f1=new FerrariEngine(10.1, 4, 5.2);
        FerrariEngine f2= new FerrariEngine(9.2, 3, 4.5);
        RenaultEnigine r1= new RenaultEnigine(5.4, 2, 4.4, 10.2);
        RenaultEnigine r2 = new RenaultEnigine(11.7, 8, 7.9, 12.5);
        Engine engines[] = new Engine[4];
        engines[0]=f1;
        engines[1]=f2;
        engines[2]=r1;
        engines[3]=r2;
        for (int i=0; i<4; i++){
            System.out.println(engines[i].getMaxSpeed());
        }
    }
}
