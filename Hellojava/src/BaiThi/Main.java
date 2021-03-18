package BaiThi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Car car = new Car();
        Motor motor = new Motor();


        System.out.print("nhap ten car: ");
        car.setTen(scanner.nextLine());
        System.out.println("van toc toi da la: " + car.getVelocity());

        System.out.print("nhap ten motor: ");
        motor.setTen(scanner.nextLine());
        System.out.println("van toc toi da la: " + motor.getVelocity());
    }
}
