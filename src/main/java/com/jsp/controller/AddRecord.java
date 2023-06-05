package com.jsp.controller;

import com.jsp.dto.Student;
import com.jsp.service.StudentService;

public class AddRecord {
	public static void main(String[] args)
	{
		StudentService studentService=new StudentService();
		Student student=new Student();
		
		student.setStudentname("Student_name");
		student.setStudentemail("student.email@gmail.com");
		
		Student p2= studentService.saveStudent(student);
		
		if(p2==null){
			System.out.println("Student Record Saved.");
			}
	}

}
