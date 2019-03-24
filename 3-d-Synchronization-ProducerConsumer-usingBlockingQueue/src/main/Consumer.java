package main;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class Consumer implements Runnable {

	private BlockingQueue sharedQ;

	public Consumer(BlockingQueue sharedQ) {
		super();
		this.sharedQ = sharedQ;
	}

	@Override
	public void run() {
		while (true) {
			try {
				System.out.println("Consumed ->" + sharedQ.take());
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
