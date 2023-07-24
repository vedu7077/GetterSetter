package com.array;



import java.util.Scanner;


class Student {
	
	
     int id;
     String name;
     double marks;

    public Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

   
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Marks: " + marks;
    }
    
    
    
    
    
    
    
}

public class StudentArrayExample {
	
	
	
    public static void main(String[] args) {
    	
    	
        Student[] students = new Student[3]; //array of student obj

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter details for Student " );

            System.out.print("ID: ");  //get id
            int id = sc.nextInt();

            sc.nextLine();

            System.out.print("Name: ");  //get name
            String name = sc.nextLine();

            System.out.print("Marks: ");  // get marks
            double marks = sc.nextDouble();

            students[i] = new Student(id, name, marks);//Create a Student obj and store the infor
        }

        System.out.println("Student Details:");  //print all details 
        
        
        for (Student student : students) {
        	
            System.out.println(student);
        }
    }
}

 