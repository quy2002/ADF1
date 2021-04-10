package s9;

import java.util.Locale;
import java.util.ResourceBundle;

public class Main {
    public static void main(String[] args) {
//        ResourceBundle en = ResourceBundle.getBundle("s9.Messages", Locale.US);
//        System.out.println(en.getString("hello"));
//        ResourceBundle vi = ResourceBundle.getBundle("s9.Messages", new Locale("vi","VN"));
//        System.out.println(vi.getString("hello"));
//        cách làm thực tế
        Locale vi_vn = new Locale("vi","VN");
        Locale.setDefault(vi_vn);
        ResourceBundle rb = ResourceBundle.getBundle("s9.Mesages");
        System.out.println(rb.getString("hello"));
        System.out.println(rb.getString("fullname"));
        System.out.println(rb.getString("FullName"));
    }
}
