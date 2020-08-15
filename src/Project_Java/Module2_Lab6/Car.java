package Project_Java.Module2_Lab6;

public class Car extends Thread {
    private String name;
    private int speed;
    private double distance;
    private ThreadGroup group;

    public Car(){
    }
    public Car(ThreadGroup group, String name, int speed, double distance){
        this.name=name;
        this.speed=speed;
        this.distance=distance;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                '}'+" "+distance/speed+" seconds";
    }

    public int getSpeed() {
        return speed;
    }

    public double getDistance() {
        return distance;
    }

    public void run(){
        for (double t=0; t<=distance/speed; t++){
            System.out.println(name+" is in "+speed*t+" metres");
        }
    }
}
