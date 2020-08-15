package Project_Java.Lab_11;

public class KFC implements Restaurant{
    private int basketPrices[] = new int[100];
    private int basketSize = 0;

    public void addBasket(int basketPrice){
        basketPrices[basketSize]=basketPrice;
        basketSize++;
    }
    public double getTotalIncome(){
        double sum=0;
        for (int i=0; i<basketSize; i++){
            sum+=basketPrices[i];
        }
        return sum;
    }
    public double getTotalOutcome(){
        return 0;
    }
}
