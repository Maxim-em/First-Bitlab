package Project_Java.Lab_11;

public class City {
    private Restaurant[] allRestaurants = new Restaurant[50];
    private int restaurantSize = 0;
    private String cityName;


    public City(){
    }
    public City(String cityName){
        this.cityName=cityName;
    }
    public String getCityName(){
        return cityName;
    }
    public void setCityName(String cityName){
        this.cityName=cityName;
    }
    public void addRestaurant(Restaurant restaurant){
        allRestaurants[restaurantSize]=restaurant;
        restaurantSize++;
    }
    public double getTotalTax(){
        double sum=0;
        for (int i=0; i<restaurantSize; i++){
            sum+=(allRestaurants[i].getTotalIncome()-allRestaurants[i].getTotalOutcome())*0.15;
        }
        return sum;
    }
}
