package Laps7;

public class Main {
    public static void main(String[] args){
    News n = new News();
        n.setTitle("Tin tuc nhanh sang 11/3");
        n.setId(1);
        n.setAuthor("Khong ro ten");
        n.setContent("Noi dung bai bao");
        n.setPublishDate("11/3/2021");
        n.rateList.add(3);
        n.rateList.add(4);
        n.rateList.add(4);
        n.calculate();
        n.Display();
}
}
