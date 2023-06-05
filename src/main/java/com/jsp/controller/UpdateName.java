package com.jsp.controller;

import com.jsp.dto.Student;
import com.jsp.service.StudentService;

public class UpdateName {
	public static void main(String[] args) {

		StudentService studentService=new StudentService();
		Student student=studentService.updateStudentName(2, "Vijay");
		System.out.print(student.getStudentname());
		System.out.println("  Updated Sucessfully...");
	}

}
