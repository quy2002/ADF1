import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        int x = 10;
        String y = "Hello";
        System.out.println(y+"___"+x);
        int n;
//        cần nhập n từ bàn phím
        Scanner sc = new Scanner(System.in);
        System.out.println("n=");
        n = sc.nextInt();
//        tính n giai thừa
        int gt = 1;
        for(int i=1;i<=n;i++){
            gt+=i;
        }
        System.out.println(n+"giai thua ="+gt);
    }
}
