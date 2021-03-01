package Assignment3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product c1 = new Product("01", "san pham 1", 10, 1000);
//        c1.id = "01";
//        c1.name = "San pham so 1";
//        c1.qty = 10;
//        c1.price = 1000;
        Product c2 = new Product();
        c2.id = "02";
        c2.name = "San pham so 2";
        c2.qty = 0;
        c2.price = 2000;
        Product c3 = new Product();
        c3.id = "03";
        c3.name = "San pham so 3";
        c3.qty = 10;
        c3.price = 3000;

        List<Product> productList = new ArrayList<>();
        productList.add(c1);
        productList.add(c2);
        productList.add(c3);

        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).qty > 0) {
                System.out.println("Còn hàng");
            } else {
                System.out.println("Hết hàng");
            }
        }
//        for (Product pro: productList) {
//            if (pro.qty > 0) {
//                System.out.println("Còn hàng");
//            } else {
//                System.out.println("Hết hàng");
//            }
//        }

        Cart cart = new Cart();
        cart.addToCart();
        cart.reomoveProduct();
    }
}
