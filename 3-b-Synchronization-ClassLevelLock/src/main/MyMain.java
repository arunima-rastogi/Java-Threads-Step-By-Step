package main;

/**
 * 
 *In Java, a synchronized block of code can only be executed by one thread at a time
 *
 * i)Class level lock in Java 
 *   prevents multiple threads to enter in synchronized block in any of all available instances of the class on runtime. 
 *   This means if in runtime there are 100 instances of MyRunnable class, then only one thread will be able to execute displayName() in any one of instance at a time, and 
 *   all other instances will be locked for other threads.
 *   
 */
public class MyMain {
	public static void main(String[] args) throws InterruptedException {

		Runnable r1 = new MyRunnable();
		Runnable r2 = new MyRunnable();
		Runnable r3 = new MyRunnable();

		Thread thread1 = new Thread(r1, "Thread1");
		Thread thread2 = new Thread(r2, "Thread2");
		Thread thread3 = new Thread(r3, "Thread3");

		thread1.start();
		thread2.start();
		thread3.start();

		System.out.println("Main Thread");
	}

}



