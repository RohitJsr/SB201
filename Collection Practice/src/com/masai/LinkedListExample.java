package com.masai;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {
	public static void main(String[] args) {
		LinkedList<String> list= new LinkedList<String>();
		list.add("kaju");
		list.add("badam");
		list.add("akhrot");
		list.add("kishmis");
		
		Iterator itr= list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
