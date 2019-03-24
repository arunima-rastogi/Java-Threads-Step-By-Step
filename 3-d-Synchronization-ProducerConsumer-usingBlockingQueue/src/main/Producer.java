package main;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class Producer implements Runnable {

	private BlockingQueue sharedQ;

	public Producer(BlockingQueue sharedQ) {
		super();
		this.sharedQ = sharedQ;
	}

	@Override
	public void run() {
		// while (true) {
		for (int i = 0; i < 5; i++) {
			try {
				sharedQ.put(i);
				TimeUnit.SECONDS.sleep(1);
				System.out.println("Produced -> " + i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
		// }
	}

}
