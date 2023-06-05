package com.jsp.controller;

import java.util.List;

import com.jsp.dto.Student;
import com.jsp.service.StudentService;

public class GetAll {
	public static void main(String[] args) {
		StudentService studentService=new StudentService();
		List<Student> students=studentService.getAllStudent();
		System.out.println("ID | Name    | Email");
		for(Student s: students) {
			System.out.print(s.getStudentid()); System.out.print("  | ");
			System.out.print(s.getStudentname()); System.out.print("   | ");
			System.out.print(s.getStudentemail()); System.out.print("  ");
			System.out.println();
		}
	}

}
