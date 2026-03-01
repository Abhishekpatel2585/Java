class MyThread extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " - Priority: " + Thread.currentThread().getPriority());
    }
}

public class thread_priority {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();

        t1.setPriority(Thread.MIN_PRIORITY); // Lowest priority (1)
        t2.setPriority(Thread.NORM_PRIORITY); // Default priority (5)
        t3.setPriority(Thread.MAX_PRIORITY); // Highest priority (10)

        t1.start();
        t2.start();
        t3.start();
    }
}