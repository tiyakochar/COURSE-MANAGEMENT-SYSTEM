package com.student.controller;
import java.util.List;

import com.student.entities.*;
import com.student.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@Autowired
	private StudentService student1;
	
	
	@GetMapping("/home")
	public String home() {
		return "Welcome to Student Details Portal";
	}
	
	@GetMapping("/details")
	public List<Student> getStudentDetails(){
		return this.student1.getStudentdetails();
	
		
	}

}
