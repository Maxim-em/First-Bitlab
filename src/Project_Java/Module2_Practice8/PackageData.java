package Project_Java.Module2_Practice8;

import java.io.Serializable;
import java.util.ArrayList;

public class PackageData implements Serializable {

    private String operationType;
    private ArrayList<Book> books;

    public PackageData(String operationType, ArrayList<Book> books) {
        this.operationType = operationType;
        this.books = books;
    }

    @Override
    public String toString() {
        return
                "books=" + books +
                '}';
    }
    public void addBook(Book book){
        books.add(book);
    }
}
