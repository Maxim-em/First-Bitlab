package Project_Java.Module2_Lab_1_Try2;

public class Database {
    String name;
    Students [] students = new Students[10];
    int sizeOfStudents;
    public Database(){
    }

    public Database(String name) {
        this.name = name;
    }

    public void addStudent(Students s){
        students[sizeOfStudents]= s;
        sizeOfStudents++;
    }
    public String listStudents(){
        String res="";
        for (int i=0; i<sizeOfStudents; i++){
            res+= students[i].StudentInfo()+"\n";
        }
        return res;
    }
}
