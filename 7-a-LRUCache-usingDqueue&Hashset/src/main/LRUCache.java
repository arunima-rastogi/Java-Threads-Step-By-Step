package main;

/**
 * Source : https://www.geeksforgeeks.org/lru-cache-implementation/
 */
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class LRUCache {

	static Deque<Integer> dq;     // store keys of cache
	static HashSet<Integer> map;  // store references of key in cache
	static int csize;             // maximum capacity of cache

	LRUCache(int n) {
		dq = new LinkedList<>();
		map = new HashSet<>();
		csize = n;
	}

	/* Refers key x with in the LRU cache */
	public void refer(int x) {
		if (!map.contains(x)) {
			if (dq.size() == csize) {
				int last = dq.removeLast();
				map.remove(last);
			}
		} else {
			dq.remove(x);
		}
		dq.push(x);
		map.add(x);
	}

	// display contents of cache
	public void display() {
		Iterator<Integer> itr = dq.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
	}
}
