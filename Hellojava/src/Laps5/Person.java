package Laps5;

import java.util.Scanner;

public class Person {
    public String name;
    public String gender;
    public String birthday;
    public String address;

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void inputInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten:");
        setName(sc.nextLine());
        System.out.println("Gioi tinh:");
        setGender(sc.nextLine());
        System.out.println("Ngay sinh:");
        setBirthday(sc.nextLine());
        System.out.println("Dia chi:");
        setAddress(sc.nextLine());
    }

    public void showInfo(){
        System.out.println("Ten:"+this.getName());
        System.out.println("Gioi tinh:"+this.getGender());
        System.out.println("Ngay sinh:"+this.getBirthday());
        System.out.println("Dia chi:"+this.getAddress());
    }
}
