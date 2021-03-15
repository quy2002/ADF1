package Laps8;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList dsKH = new ArrayList();
        KhachHangVN k1 = new KhachHangVN();
        k1.setMaKH(1);
        k1.setTenKH("Nam");
        k1.setSoLuong(227);
        KhachHangNN k2 = new KhachHangNN();
        k2.setMaKH(2);
        k2.setTenKH("ABC");
        k2.setSoLuong(357);
        KhachHangNN k3 = new KhachHangNN();
        k3.setMaKH(3);
        k3.setTenKH("AAA");
        k3.setSoLuong(210);
        System.out.println("K1: "+k1.tinhTien());
        System.out.println("K2: "+k2.tinhTien());
        dsKH.add(k1);
        dsKH.add(k2);
        dsKH.add(k3);
        int tongVN = 0;
        int tongNN = 0;
        double tongtienNN = 0;
        int slNN = 0;
        for(int i=0;i<dsKH.size();i++){
            if(dsKH.get(i) instanceof KhachHangVN){
                tongVN += ((KhachHangVN) dsKH.get(i)).getSoLuong();
            }else if(dsKH.get(i) instanceof KhachHangNN){
                tongNN += ((KhachHangNN) dsKH.get(i)).getSoLuong();
                tongtienNN +=  ((KhachHangNN) dsKH.get(i)).tinhTien();
                slNN++;
            }
        }
        System.out.println("KHVN: "+tongVN);
        System.out.println("KHNN: "+tongNN);
        System.out.println("Trung binh tien NN: "+tongtienNN/slNN);
    }
}
