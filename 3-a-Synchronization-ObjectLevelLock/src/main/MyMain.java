package main;

/**
 * 
 *In Java, a synchronized block of code can only be executed by one thread at a time
 *
 * i)Object level lock in Java 
 *   when we want to synchronize a non-static method or non-static code block such that 
 *   only one thread will be able to execute the code block on given instance of the class.
 *   
 */
public class MyMain {
	public static void main(String[] args) throws InterruptedException {

		Runnable r = new MyRunnable();

		Thread thread1 = new Thread(r, "Thread1");
		Thread thread2 = new Thread(r, "Thread2");
		Thread thread3 = new Thread(r, "Thread3");

		thread1.start();
		thread2.start();
		thread3.start();

		System.out.println("Main Thread");
	}
}



