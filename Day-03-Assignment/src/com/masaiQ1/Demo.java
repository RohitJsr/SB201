package com.masaiQ1;

import java.awt.event.MouseEvent;

public class Demo implements Method
{
	
	//Interface methods are by definition public and abstract , so you cannot have non- abstract methods in your interface.

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("Method of mouseClicked");
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("Method of mouseEntered");
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
	System.out.println("Method of mouseExited");
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println(" Method of MousePressed");
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("Method of mouseRelesed");
		
	}
	public static void main(String[] args) {
		Demo d1= new Demo();
		d1.mouseClicked(null);
	}

}
