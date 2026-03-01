public class Main2 {
    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);

        t3.start();
        t3.join();  // Wait for t3 to finish before starting t2
        t2.start();
        t2.join();  // Wait for t2 to finish before starting t1
        t1.start();
    }
}
