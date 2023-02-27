class ThreadExample implements Runnable {

    private final int threadNum;

    public ThreadExample(int threadNum) {
        this.threadNum = threadNum;
    }

    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("thread #" + threadNum + ": " + i);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ThreadExample(1));
        Thread t2 = new Thread(new ThreadExample(2));
        Thread t3 = new Thread(new ThreadExample(3));
        t1.start();
        t2.start();
        t3.start();
    }
}