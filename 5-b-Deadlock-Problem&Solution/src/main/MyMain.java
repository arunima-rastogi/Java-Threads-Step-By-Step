package main;

/**
 * PROBLEM : 
 * Deadlock : Deadlock occurs when you have two threads,Both of which are holding a variable/object/file the other thread wants.
 *           
 * SOLUTION : 
 * i)Lock Ordering
 * ii)Lock Timeout 
 * iii)Deadlock Detection           
 *           
 */
public class MyMain {

	/**
	 * Deadlocks can occur in Java when the synchronized keyword causes 
	 * the executing thread to block while waiting to get the lock, associated with the specified object. 
	 * Since the thread might already hold locks associated with other objects, 
	 * two threads could each be waiting for the other to release a lock
	 * 
	 * Ex.2)https://gist.github.com/jirkapinkas/ce1285df9a06d7ba094eb78997942563
	 */
	
	String resource1 = "Java";
	String resource2 = "UNIX";

	Thread trd1 = new Thread("My Thread 1") {
		public void run() {
			synchronized (resource1) {
				System.out.println("Thread 1 ->" + resource1);
				synchronized (resource2) {
					System.out.println("Thread 1 ->" + resource1 + resource2);
				}
			}
		}
	};

	Thread trd2 = new Thread() {
		public void run() {
			synchronized (resource2) {
				System.out.println("Thread 2 ->" + resource2);
				synchronized (resource1) {
					System.out.println("Thread 2 ->" + resource2 + resource1);
				}
			}
		}
	};

	public static void main(String a[]) {
		MyMain mdl = new MyMain();
		mdl.trd1.start();
		mdl.trd2.start();
	}

}
