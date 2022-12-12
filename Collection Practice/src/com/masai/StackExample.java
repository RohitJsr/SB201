package com.masai;

import java.util.Iterator;
import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack <String> s= new Stack<String>();
		
		s.push("slack");
		s.push("zoom");
		s.push("oj");
		s.push("sts");
		s.push("lms");
		s.pop();
		Iterator itr= s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
