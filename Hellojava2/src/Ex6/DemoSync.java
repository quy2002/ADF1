package Ex6;

public class DemoSync {
    public static void main(String[] args) {
        NumberCount n = new NumberCount();

        Runnable r = new Runnable() {
            @Override
            public void run() {
                for (int i=0; i<20; i++) {
                    n.changeXY();
                    System.out.println("Thread 1 ---");
                    n.showXY();
                    try {
                        Thread.sleep(1000);
                    }catch (Exception e){}
                }
            }
        };
        Thread t = new Thread(r);
        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                for (int i=0; i<20; i++) {
                n.changeXY();
                System.out.println("Thread 2 ---");
                n.showXY();
                try {
                    Thread.sleep(1000);
                }catch (Exception e){}
                }
            }
        };
        Thread t2 = new Thread(r2);
        t.start();
        t2.start();
    }
}
