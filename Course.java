package com.masai;

import java.util.Scanner;

public class Course {

	int courseId;
	String courseName;
	int courseFee;
	
	void displayCourseDetails(int courseId, String courseName, int courseFee) {
		
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseFee = courseFee;
		
		System.out.println("Course ID is:-"+courseId);
		System.out.println("Course Name is:-"+courseName);
		System.out.println("Course Fee is:-"+courseFee);
	}
	
	static void authenticate(String username, String password ) {
		if(username=="Admin" && password=="1234")
		{
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Enter Course Name");
			String courseName = scanner.nextLine();
			
			
			
			System.out.println("Enter Course Id");
			int courseId = scanner.nextInt();
			
			System.out.println("Enter Course Fee");
			int courseFee = scanner.nextInt();
			
			scanner.close();
			
			Course c1 = new Course();
			c1.displayCourseDetails(courseId,courseName,courseFee);
		}
		else
		{
			System.out.println("Invalid Username or password");
		}
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		authenticate("Admi","124"); // wrong parameters passed
		authenticate("Admin","1234");
		
		
	}

}
