package Laps8_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        boolean flag = true;
        ArrayList<SinhVien> ds =  new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (flag){
            System.out.println("Vui long chon chuc nang:");
            System.out.println("1. Them SV");
            System.out.println("2. Sua thong tin SV");
            System.out.println("3. Xoa thong tin SV");
            System.out.println("4. Sap xep SV theo GPA");
            System.out.println("5. Sap xep SV theo ten");
            System.out.println("6. In ra danh sach");
            System.out.println("0. Exit");
            int c = sc.nextInt();
            if(c==0){
                flag = false;
            }else if(c == 1){
                System.out.println("Nhap id sv:");
                int id = sc.nextInt();
                System.out.println("Nhap ten sv:");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.println("Nhap tuoi:");
                int age = sc.nextInt();
                System.out.println("Nhap dia chi:");
                sc.nextLine();
                String address = sc.nextLine();
                System.out.println("Nhap GPA:");
                float gpa = sc.nextFloat();
                ds.add(new SinhVien(id,name,age,address,gpa));
            }else if(c == 2){
                System.out.println("Nhap id sv muon sua thong tin:");
                int id = sc.nextInt();
                for(SinhVien s:ds){
                    if(s.getId()== id){
                        System.out.println("Nhap ten sv:");
                        String name = sc.nextLine();
                        s.setName(name);
                        System.out.println("Nhap tuoi:");
                        int age = sc.nextInt();
                        s.setAge(age);
                        System.out.println("Nhap dia chi:");
                        sc.nextLine();
                        s.setAddress(sc.nextLine());
                        System.out.println("Nhap GPA:");
                        s.setGpa(sc.nextFloat());
                        break;
                    }
                }
            }else if(c==3){
                System.out.println("Nhap id sv muon xoa thong tin:");
                int id = sc.nextInt();
                for(SinhVien s:ds){
                    if(s.getId() == id){
                        ds.remove(s);
                        break;
                    }
                }
            }else if(c==4){
                Collections.sort(ds, new Comparator<SinhVien>() {
                    @Override
                    public int compare(SinhVien o1, SinhVien o2) {
                        return o2.getGpa() - o1.getGpa()>0?1:-1;
                    }
                });
            }else if(c==5){
                Collections.sort(ds, new Comparator<SinhVien>() {
                    @Override
                    public int compare(SinhVien o1, SinhVien o2) {
                        return o1.getName().compareTo(o2.getName());
                    }
                });
            }else if(c==6){
                for(SinhVien s:ds){
                    System.out.println(s.getName()+"--"+s.getGpa());
                }
            }
        }
    }
}
