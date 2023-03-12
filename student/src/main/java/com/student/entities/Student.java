package com.student.entities;

public class Student {
	
	private String name;
	private Integer rollno;
	private String branch;
	
	
	
	
	public Student(String name, Integer rollno, String branch) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.branch = branch;
	}
	
	
	
	
	public Student() {
		super();
	}




	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getRollno() {
		return rollno;
	}
	public void setRollno(Integer rollno) {
		this.rollno = rollno;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}

	

}
