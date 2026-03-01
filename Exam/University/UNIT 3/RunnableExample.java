// // class MyRunnable implements Runnable {
// //     public void run() {
// //         System.out.println("Thread is running...");
// //     }
// // }

// // public class RunnableExample {
// //     public static void main(String[] args) {
// //         MyRunnable r = new MyRunnable();   // Create a Runnable object
// //         Thread t = new Thread(r);         // Pass it to a Thread object
// //         t.start();                        // Start the thread
// //     }
// // }


// class MyRunnable implements Runnable
// {
// 	public void run()
// 	{
// 		System.out.println("Thread is running");
// 	}
// }
// class RunnableExample
// {
// 	public static void main(String[] args)
// 	{
// 		MyRunnable m1=new MyRunnable();
// 		Thread t1=new Thread(m1);
// 		t1.start();
// 	}
// }
class MyRunnable implements Runnable
{
	public void run()
	{
		System.out.println("Thread is running");
	}
}
class RunnableExample
{
	public static void main(String[] args)
	{
		MyRunnable m1=new MyRunnable();
		Thread t1=new Thread(m1);
		t1.start();
	}
}