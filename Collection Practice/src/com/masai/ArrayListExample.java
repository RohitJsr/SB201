package com.masai;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	
	public static void main(String[] args) {
		ArrayList<String> list= new ArrayList<String>();
		list.add("rohan");
		list.add("mohan");
		list.add("sohan");
		list.add("jadhav");
		
		Iterator itr= list.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
