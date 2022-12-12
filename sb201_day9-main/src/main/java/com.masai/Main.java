package com.masai;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Collage c = ctx.getBean(Collage.class,"c1");
		System.out.println(c.getCollage_name());
		System.out.println(c.getCollage_address());
		System.out.println(c.getStudent());
	}

}
