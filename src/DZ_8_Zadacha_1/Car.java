package DZ_8_Zadacha_1;

public class Car {
    String name;
    String model;
    int speed;
    int weight;
    Engine engine;

    public Car(String name, String model, int speed, int weight, Engine engine){
        this.name=name;
        this.model=model;
        this.speed=speed;
        this.weight=weight;
        this.engine=engine;
    }
    public String toString(){
        return "Name: "+name+" "+"Model: "+model+" "+"Speed: "+speed+" "+"Weight: "+weight+" "+"Engine: "+engine;
    }
    public void run(){
        System.out.println("Name: "+name+" "+"Model: "+model+" "+"Speed: "+speed+" "+"Weight: "+weight+" "+"Engine: "+engine+" "+"running");
    }
    public int totalWeight(){
        return weight+engine.weight;
    }
}
