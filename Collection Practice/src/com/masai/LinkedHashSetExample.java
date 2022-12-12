package com.masai;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		LinkedHashSet<String> ls= new LinkedHashSet<>();
		ls.add("ajay");
		ls.add("vijay");
		ls.add("ajay");
		ls.add("vijay");
		Iterator<String> itr= ls.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
