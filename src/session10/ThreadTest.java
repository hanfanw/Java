package session10;

class SumEven extends Thread {
    private int start, end;

    public SumEven(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void run() {
        long sum = 0;
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) sum += i;
        }
        System.out.println(sum);
    }
}

class PrintEven extends Thread {
    private int start, end;

    public PrintEven(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void run() {
//        long sum = 0;
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
//                sum += i;
                System.out.println(i);
            }
        }
    }
}

public class ThreadTest {
    public static void main(String[] args) {
//        Thread t1 = new SumEven(3, 9);
        Thread t1 = new PrintEven(3, 90000);
        t1.start();
//        Thread t2 = new SumEven(10, 15);
        Thread t2 = new SumEven(100000, 150000);
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
        }
    }
}
