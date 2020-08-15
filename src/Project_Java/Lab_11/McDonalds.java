package Project_Java.Lab_11;

public class McDonalds implements Restaurant {
    private double burgersPrices[] = new double[100];
    private double workersSalary[] = new double[20];
    private int burgersSize = 0;
    private int workersSize = 0;
    public void addBurger(double burgerPrice){
        burgersPrices[burgersSize]=burgerPrice;
        burgersSize++;
    }
    public void addWorker(double workerSalary){
        workersSalary[workersSize]=workerSalary;
        workersSize++;
    }
    public double getTotalIncome(){
        double sum=0;
        for (int i=0; i<burgersSize; i++){
            sum+=burgersPrices[i];
        }
        return sum;
    }
    public double getTotalOutcome(){
        double sum=0;
        for (int i=0; i<workersSize; i++){
            sum+=workersSalary[i];
        }
        return sum;
    }
}
