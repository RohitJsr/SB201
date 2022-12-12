package com.masai;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueqeExample {

	public static void main(String[] args) {
		PriorityQueue<String> pq= new PriorityQueue<String>();
		
		pq.add("The ganesh");
		pq.add("The Laxmi");
		pq.add("The Vishnu");
		pq.add("The mahesh");
		Iterator<String > itr= pq.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
			
		}
		pq.remove();
		pq.poll();
		Iterator <String> itr2= pq.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		
	}
}
