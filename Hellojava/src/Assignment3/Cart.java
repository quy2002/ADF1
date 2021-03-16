package Assignment3;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cart {
    int id;
    String customer;
    double grandTotal;
    String city;
    List<Product> productList;

    Scanner scanner = new Scanner(System.in);

    public Cart() {
    }

    public void addToCart() {
        productList = new ArrayList<>();
        Product product = new Product();
        System.out.print("nhap id: ");
        product.id = scanner.nextLine();
        System.out.println("nhap name");
        product.name = scanner.nextLine();
        System.out.print("nhap qly: ");
//        product.qty = scanner.nextInt();
        product.qty =Integer.parseInt(scanner.nextLine());
        System.out.print("nhap price: ");
        product.price = Float.parseFloat(scanner.nextLine());

        System.out.println("them thanh cong");

        productList.add(product);
    }

    public void reomoveProduct() {

        System.out.print("nhap id: ");
        String id = scanner.nextLine();

        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).id.equals(id)){
                productList.remove(productList.get(i));
                System.out.println("xoa thanh cong");
            }else {
                System.out.println("id ko ton tai");
            }
        }
    }

}
