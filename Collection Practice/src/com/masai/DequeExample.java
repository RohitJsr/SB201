package com.masai;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class DequeExample {

	
	public static void main(String[] args) {
		Deque<String> dq= new ArrayDeque<>();
		dq.add("sleep");
		dq.add("Shutdown");
		dq.add("Power");
		dq.add("Lock");
		
		Iterator <String> itr= dq.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
