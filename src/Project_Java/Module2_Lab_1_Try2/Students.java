package Project_Java.Module2_Lab_1_Try2;

public class Students {
    private String name;
    private String surname;
    private String faculty;   //// Information Technologies, Economics, Mathematics
    private String group;

    public Students() {
    }

    public Students(int id, String name, String surname, String faculty, String group) {
        this.name = name;
        this.surname = surname;
        this.faculty = faculty;
        this.group = group;
    }


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getGroup() {
        return group;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setGroup(String group) {
        this.group = group;
    }
    public String StudentInfo(){
        return "Name: " +getName()+", "+"Surname: " +getSurname()+", "+
                "Faculty: " +getFaculty()+", "+"Group: " +getGroup();
    }
}
