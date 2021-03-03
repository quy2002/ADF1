package Laps4_2;

public class Main {
    public static void main(String[] args){
        SinhVien s1 = new SinhVien();
        s1.setId(1);
        s1.setFullName("Trần Đình Qúy");
        s1.setTel("099999999");
        s1.setAddress("my dinh 2");

        SinhVien s2= new SinhVien();
        s2.setId(2);
        s2.setFullName("Phí Văn long");
        s2.setTel("088888888");
        s2.setAddress("my dinh 2");

        LopHoc lh = new LopHoc();
        lh.setId(1);
        lh.setName("T2009M");
        lh.setRoom("A8");
        lh.addStudent(s1);
        lh.addStudent(s2);
        lh.printStudents();
    }
}
