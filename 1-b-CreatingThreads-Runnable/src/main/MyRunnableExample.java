package main;

public class MyRunnableExample {

	public static void main(String[] args) throws InterruptedException {

		Runnable runnable = new MyRunnable();
		Thread thread1 = new Thread(runnable, "Thread 1");

		thread1.start(); // Run the thread Asynchronously
		
       //thread1.join();
        
		System.out.println("Main Function : " + Thread.currentThread().getName());

	}
}

