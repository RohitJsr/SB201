package com.masai;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet<String> tset= new TreeSet<String>();
		
		tset.add("vijay");
		tset.add("ravi");
		tset.add("vijay");
		tset.add("ajay");
		Iterator<String> itr= tset.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
