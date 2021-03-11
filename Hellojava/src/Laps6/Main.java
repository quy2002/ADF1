package Laps6;

public class Main {
    public static void main(String[] args){
        PhoneBook pb = new PhoneBook();
        pb.insertPhone("Quy","0987654321");
        pb.insertPhone("Long","0987654322");
        pb.insertPhone("Huan","0123456789");
        System.out.println("Danh sach ban dau:");
        pb.print();
        pb.sort();
        System.out.println("Danh sach da sap xep:");
        pb.print();
    }
}
