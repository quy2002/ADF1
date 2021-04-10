package Ex6;

public class Main {
    public static void main(String[] args) {
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println("Run 1:" + i);
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {}
                }
            }
        };
        Thread t1 = new Thread(r1);
        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Run 2:" + i);
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                    }
                }
            }
        };
        Thread t2 = new Thread(r2);
        Runnable r3 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Run 3:" + i);
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                    }
                }
            }
        };
        Thread t3 = new Thread(r3);
        Runnable r4 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Run 4:" + i);
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                    }
                }
            }
        };
        Thread t4 = new Thread(r4);
        t1.setDaemon(true);
        t1.start();
        try {
            t1.join();
        }catch (Exception e){}
        t2.start();
        t3.start();
        t4.start();
    }
}
