package Laps8;

public class KhachHangVN extends KhachHang{
    String doiTuongKH;

    public String getDoiTuongKH() {
        return doiTuongKH;
    }

    public void setDoiTuongKH(String doiTuongKH) {
        this.doiTuongKH = doiTuongKH;
    }

    @Override
    public double tinhTien() {
        double tongtien = 0;
        if(getSoLuong()<=50){
            tongtien= getSoLuong()*1000;
        }else if(getSoLuong()>50 && getSoLuong()<=100){
            tongtien = (getSoLuong()-50) * 1200 +50 * 1000;
        }else if(getSoLuong() >100 && getSoLuong()<=200){
            tongtien =  (getSoLuong()-100)*1500 + 50 * 1000+ 50 * 1200;
        }else{
            tongtien = (getSoLuong()-200) * 2000+ 100*1500+50*1200+50*1000;
        }
        return tongtien;
    }
}
