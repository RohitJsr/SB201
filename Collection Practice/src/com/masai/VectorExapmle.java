package com.masai;

import java.util.Iterator;
import java.util.Vector;

public class VectorExapmle {

	public static void main(String[] args) {
		Vector<String> v= new Vector<>();
		
		v.add("sohan");
		v.add("rohan");
		v.add("mohan");
		v.add("ashirvad");
		
		Iterator itr= v.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
