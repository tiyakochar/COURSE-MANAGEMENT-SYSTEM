package com.student.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.student.entities.*;


@Service
public class StudentServiceImpl implements StudentService{
	
	

	@Override
	public List<Student> getStudentdetails() {
		Student s1=new Student("Tiya Kochar",11,"CSE");

		Student s2=new Student("Aditi Nagpure",13,"Electrical");

		Student s3=new Student("Ram verma",15,"Mechanical");

		Student s4=new Student("Shyam verma",10,"IT");
		
		List<Student> list1=new ArrayList<>();
		list1.add(s1);
		list1.add(s2);
		list1.add(s3);
		list1.add(s4);
		
		return list1;
	}
	
	
	

}
