package main;

public class MyMain {
	public static void main(String[] args) throws java.lang.Exception {
		LRUCache ca = new LRUCache(4);
		ca.refer(1);
		ca.refer(2);
		ca.refer(3);
		ca.refer(1);
		ca.refer(1);
		ca.refer(5);
		ca.refer(1);
		ca.display();
	}
}
