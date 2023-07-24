package com.getter;


 public class Student {
	  private String name;
	private  int roll_num;
	
	
	 public String getName() {
		return name;
	}

	 
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll_num() {
		return roll_num;
	}
	public void setRoll_num(int roll_num) {
		this.roll_num = roll_num;
	}
	public void display() {
		
		 System.out.println(name);
		 System.out.println(roll_num);
		 
		 
	 }
	 
	public static void main(String[] args) {
		
		Student sc=new Student();
		 sc.setName("vedant");
           sc.setRoll_num(22);
           sc.display();
          
	}
	
	
	
	
	
	
	
	
	
	




}
