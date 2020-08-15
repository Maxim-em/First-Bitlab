package Project_Java.Module2_Practice2_Part2;

public class Library {
    private String name;
    private String city;
    private Book books[] = new Book[20];
    private int index = 0;
    public Library(){
    }

    public Library(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }
    public void addBook(Book book){
        books[index]=book;
        index++;
    }
    public void printBooks(){
        for (int i=0; i<index; i++){
            System.out.println(books[i].getData());
        }
    }
}
