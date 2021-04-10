package Baithi1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Controller {
    Scanner scanner = new Scanner(System.in);

    public void add(List<Customer> list) {
        Customer customer = new Customer();
        System.out.println("nhap thon tin");
        System.out.println("id: ");
        customer.setReservationID(Integer.parseInt(scanner.nextLine()));
        System.out.println("name: ");
        customer.setPassengerName(scanner.nextLine());
        System.out.println("address: ");
        customer.setAddress(scanner.nextLine());
        System.out.println("number: ");
        customer.setNumber(scanner.nextLine());
        System.out.println("dateOfDeparture: ");
        customer.setDateOfDeparture(scanner.nextLine());
        System.out.println("dateOfReturn: ");
        customer.setDateOfReturn(scanner.nextLine());
        list.add(customer);
    }

    public void edit(List<Customer> list) {

//        Customer customer = new Customer();
        System.out.println("nhap thon tin can sua: ");
        System.out.print("id: ");
        int id = Integer.parseInt(scanner.nextLine());

        for (Customer cus : list) {
            if (cus.getReservationID() == id) {
                System.out.println("name: ");
                cus.setPassengerName(scanner.nextLine());
                System.out.println("address: ");
                cus.setAddress(scanner.nextLine());
                System.out.println("number: ");
                cus.setNumber(scanner.nextLine());
                System.out.println("dateOfDeparture: ");
                cus.setDateOfDeparture(scanner.nextLine());
                System.out.println("dateOfReturn: ");
                cus.setDateOfReturn(scanner.nextLine());

            } else {
                System.out.println("id khong ton tai ");
            }
        }
    }

    public void show(List<Customer> list) {
        int n = 0;
        for (Customer cus : list) {
            System.out.println(" khach hang thu :" + n++);
            System.out.println("name: " + cus.getPassengerName());
            System.out.println("address: " + cus.getAddress());
            System.out.println("number: " + cus.getNumber());
            System.out.println("dateOfDeparture: " + cus.getDateOfDeparture());
            System.out.println("dateOfReturn: " + cus.getDateOfReturn());

        }
    }
}
