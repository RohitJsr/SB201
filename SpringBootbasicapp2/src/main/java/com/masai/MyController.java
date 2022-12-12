package com.masai;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

	@RequestMapping("/emp")
	public Employee sendEmp() {
		Employee em= new Employee(1,"ram","ayodha",8000);
		
		return em;
		
	}
	
}
