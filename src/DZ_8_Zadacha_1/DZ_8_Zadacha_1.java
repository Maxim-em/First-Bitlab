package DZ_8_Zadacha_1;

public class DZ_8_Zadacha_1 {
    public static void main(String[] args){
        Engine engine[]= new Engine[2];
        engine[0]= new Engine("engine1", 35, 40, 20);
        engine[1]= new Engine("engine2", 45, 56, 12);
        Car[] cars = new Car[3];
        cars[0]= new Car("car1", "Toyota", 76, 80,engine[0] );
        cars[1]= new Car("car2", "Nissan", 60, 69, engine[1]);
        cars[2]= new Car("car3", "Kia", 80, 47, engine[0]);
        for (int i=0; i<cars.length; i++){
            System.out.println(cars[i].totalWeight());
        }
    }
}
