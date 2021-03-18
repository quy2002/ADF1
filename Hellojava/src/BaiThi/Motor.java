package BaiThi;

public class Motor implements Vehicle{
    String ten;
    float velocity=150;

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public float getVelocity() {
        return velocity;
    }



    @Override
    public float moveMax() {
        return velocity;
    }

    @Override
    public String getName() {
        return ten;
    }
}
