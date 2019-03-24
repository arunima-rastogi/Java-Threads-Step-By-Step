package main;

import java.util.ArrayList;
import java.util.List;

public class MyMain {

	public static void main(String[] args) {

		List<Integer> sharedQ = new ArrayList<>();

		Runnable pThread = new Producer(sharedQ);
		Runnable cThread = new Consumer(sharedQ);

		Thread producer = new Thread(pThread, "Producer");
		Thread consumer = new Thread(cThread, "Consumer");

		producer.start();
		consumer.start();

	}
}

// NOTE : while(true) in both Producer and Consumer class enables it to run forever

