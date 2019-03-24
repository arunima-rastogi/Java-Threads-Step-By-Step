package main;

/**
 * PROBLEM : 
 * Race Condition   : special condition may occur in Critical Section.
 * 
 * Critical Section : Critical section contains code i.e executed by multuiple threads.
 *                    Problem arises when multiple threads tries to WRITE on the same resource(variable,Object,file etc) 
 * 
 * 
 * SOLUTION : 
 *  i)using using Synchronized Method 
 *  ii)using using Synchronized Block/Statement
 *  iii)using Reentrant Lock  
 *        
 */
public class MyMain {
	public static void main(String[] args) throws InterruptedException {

		Runnable r = new MyRunnable();

		Thread thread1 = new Thread(r, "Thread1");
		Thread thread2 = new Thread(r, "Thread2");

		thread1.start();
		thread2.start();

	}
}


