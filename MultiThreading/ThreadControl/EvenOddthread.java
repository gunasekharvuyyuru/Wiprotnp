class EvenThread extends Thread {
    public void run() {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}

class OddThread extends Thread {
    public void run() {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}

public class EvenOddThread {
    public static void main(String[] args) throws InterruptedException {
        EvenThread t1 = new EvenThread();
        OddThread t2 = new OddThread();

        t1.start();
        t1.join();

        t2.start();
    }
}