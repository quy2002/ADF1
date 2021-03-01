package Assignment3;

public class Product {
    String id;
    String name;
    double price;
    int qty;

    public Product(String id, String name, double price, int qty) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    public Product() {
    }

    void printProduct(){
        System.out.println("ma: "+id);
        System.out.println("ten: "+name);
        System.out.println("gia: "+price);
        System.out.println("Sl: "+qty);

    }
}
