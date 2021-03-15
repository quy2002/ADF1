package Laps8;

public class KhachHangNN extends KhachHang{
    String country;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public double tinhTien() {
        return getSoLuong()*2000;
    }
}
