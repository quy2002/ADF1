package Assignment1;

public class Tamgiac {
    double canh1;
    double canh2;
    double canh3;

    public Tamgiac() {
    }

    public double getCanh1() {
        return canh1;
    }

    public void setcanh1(double canh1) {
        this.canh1 = canh1;
    }

    public double getCanh2() {
        return canh2;
    }

    public void setcanh2(double canh2) {
        this.canh2 = canh2;
    }

    public double getCanh3() {
        return canh3;
    }

    public void setcanh3(double canh3) {
        this.canh3 = canh3;
    }

    public boolean kiemTra(){
        if(canh1>0&&canh2>0&&canh3>0&&canh1+canh2>canh3&&canh1+canh3>canh2&&canh3+canh2>canh1)
            return true;
        return false;
    }


    public double chuVi(){
        return canh1+canh2+canh3;
    }

    public double dienTich(){
        double p = chuVi()/2;
        return Math.sqrt(p*(p-canh1)*(p-canh2)*(p-canh3));
    }
}
