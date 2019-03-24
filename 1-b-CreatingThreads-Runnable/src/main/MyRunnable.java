package main;

public class MyRunnable implements Runnable {
	@Override
	public void run() {
		
		// Perform Long Running Task
		try {
			Thread.sleep(2000L);
			System.out.println("Response from Database : " + Thread.currentThread().getName());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}


