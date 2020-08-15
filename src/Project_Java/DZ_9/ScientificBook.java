package Project_Java.DZ_9;

public class ScientificBook extends Book{
    private int price;
    private String publisher;


    public ScientificBook(){
    }
    public ScientificBook(String name, String code, int pages, int price, String publisher){
        super(name,code,pages);
        this.price=price;
        this.publisher=publisher;
    }
    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price=price;
    }
    public String getPublisher(){
        return publisher;
    }
    public void setPublisher(String publisher){
        this.publisher=publisher;
    }
    public String getBookData(){
        return "Name: "+getName()+", "+"Code: "+getCode()+", "+"pages: "+getPages()+", "+
                "price: "+getPrice()+", "+"publisher: "+getPublisher();
    }

}
