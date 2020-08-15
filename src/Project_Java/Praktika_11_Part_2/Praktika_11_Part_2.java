package Project_Java.Praktika_11_Part_2;

import java.util.Scanner;

public class Praktika_11_Part_2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Staff[] staff= new Staff[3];
        HRManagers[] managers= new HRManagers[3];
        Programmers[] programmers= new Programmers[3];
        staff[0]=new Staff(1234, "Max", "Em", 30000);
        staff[1]=new Staff(1235, "John", "Smith", 40000);
        staff[2]=new Staff(1236, "James", "Dinn", 35000);
        managers[0]= new HRManagers(1237, "Johnatan", 45000);
        managers[1]= new HRManagers(1437, "Owen", 55000);
        managers[2]= new HRManagers(1527, "Ellie", 29000);
        programmers[0]= new Programmers(2415, "prog", 35000, 5000, 0.5);
        programmers[1]= new Programmers(2424, "gr", 45000, 2000, 0.4);
        programmers[2]= new Programmers(2456, "java", 39000, 6000, 0.7);
        Workers[] workers ={staff[0], staff[1], staff[2], managers[0], managers[1],
        managers[2], programmers[0], programmers[1], programmers[2]};
        double max=0;
        int maxIndex=0;
        for (int i=0; i<9; i++){
            if (workers[i].getSalary()>max){
                max=workers[i].getSalary();
                maxIndex=i;
            }
        }
        System.out.println(workers[maxIndex].getWorkerData());
        Workers[] sortingWorkers= new Workers[9];
        sortingWorkers[0]=workers[maxIndex];
        for (int indexOfSortingWorkers=1; indexOfSortingWorkers<9; indexOfSortingWorkers++){
            max=0;
            maxIndex=0;
            for (int i=0; i<9; i++){
                if (workers[i].getSalary()>max&& workers[i].getSalary()<sortingWorkers[indexOfSortingWorkers-1].getSalary()){
                    max=workers[i].getSalary();
                    maxIndex=i;
                }
            }
            sortingWorkers[indexOfSortingWorkers]=workers[maxIndex];
        }
        for (int i=0; i<9; i++){
            System.out.println(sortingWorkers[i].getWorkerData());
        }
    }
}
