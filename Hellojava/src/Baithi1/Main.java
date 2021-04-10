package Baithi1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        List<Customer> customerList = new ArrayList<>();
        Controller controller = new Controller();
        int choose;
        Scanner scanner = new Scanner(System.in);
        do {
            choose();
            choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    controller.add(customerList);
                    break;
                case 2:
                    controller.edit(customerList);
                    break;
                case 3:
                    controller.show(customerList);
                    break;
                case 4:
                    System.out.println("thoat thanh cong");
                    break;
                default:
                    System.out.println(" error!!!");
                    break;
            }


        } while (choose != 4);
    }

    private static void choose() {
        System.out.println("1.add");
        System.out.println("2.edit");
        System.out.println("3.list");
        System.out.println("4.exit");
        System.out.print("Choose: ");
    }
}
