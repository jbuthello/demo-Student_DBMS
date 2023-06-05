package com.jsp.controller;


import com.jsp.dto.Student;
import com.jsp.service.StudentService;

public class GetById {
	public static void main(String[] args) {

		StudentService productService=new StudentService();
		
		Student student=productService.getStudentById(3);
		if(student!=null) {
			System.out.println(student.getStudentname());
			System.out.println(student.getStudentemail());
		}else {
			System.out.println("Incorrect Id.");	}
	}

}
