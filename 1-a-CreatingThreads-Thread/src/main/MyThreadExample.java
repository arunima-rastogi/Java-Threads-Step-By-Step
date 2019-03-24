package main;

public class MyThreadExample {

	public static void main(String[] args) {

		Thread thread = new MyThread();
		thread.start(); // Run the thread Asynchronously
		
		System.out.println("Main Thread : " + Thread.currentThread().getName());
	}
}

/** 
 * Using Anonymous Inner Class
 * 
 * new Thread(){
    public void run() {
        // Perform Asynchronous Long Running Task
		System.out.println("Response from Database");
    }
   }.start();
   
   System.out.println("Main Thread");
 */
