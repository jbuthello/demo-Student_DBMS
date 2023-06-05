package com.jsp.controller;

import com.jsp.dto.Student;
import com.jsp.service.StudentService;

public class UpdateEmail {
	public static void main(String[] args) {

		StudentService studentService=new StudentService();
		Student student=studentService.updateStudentEmail(2, "v.baviskar@gmail.com");
		System.out.print(student.getStudentemail());
		System.out.println("  Updated Sucessfully...");
	}

}
