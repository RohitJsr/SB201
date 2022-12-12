package com.masai;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		HashSet<String> hs= new HashSet<String>();
		
		hs.add("ajay");
		hs.add("vijay");
		hs.add("ajay");
		hs.add("vijay");
		Iterator<String> itr= hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
 	}
}
