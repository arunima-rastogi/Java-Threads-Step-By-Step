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
   
   new Thread(){
    public void run() {
	System.out.println("Response from Database");
    }
   }.start();
   
   System.out.println("Main Thread");
   
 */

/**
 *Using  Lambda Runnable
  
    Runnable runnable = () -> { System.out.println("Response from Database"); };
    new Thread(runnable).start();

*/

 Output : 
  
  Main Thread Start  : main
  Main Thread Finish : main
  Response from Database from seperate thread : Thread-0
