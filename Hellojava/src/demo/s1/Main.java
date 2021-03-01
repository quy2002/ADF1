package demo.s1;

public class Main {
    public static void main(String[] args){
//        Car c = new Car(); tạo đối tượng từ lớp car

        Car c; //khai báo biến c có kiểu dữ liệu Car --> chưa có ổ nhớ
        c = new Car(); //tạo 1 ổ nhớ có kích thước bẳng lớp car cho c -->tạo đối tượng
        c.brand = "Toyata";
        c.run();
        //tạo 1 đối tượng car khác
        Car c2 = new Car();
        c2.brand = "Honda";
    }
}
