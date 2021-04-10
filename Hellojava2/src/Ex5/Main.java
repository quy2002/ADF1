package Ex5;

public class Main {
    public static void main(String[] args) {
        SubThread s = new SubThread();
        s.setName("Luong so 1");
        s.start();
        SubThread s2 = new SubThread();
        s.setName("Luong so 2");
        s2.start();

        for (int i=0; i<20; i++){
            System.out.println("Main:"+i);
            try {
                Thread.sleep(1000);
            }catch (Exception e) {

            }
        }
    }
}
