package com.jsp.controller;

import com.jsp.service.StudentService;

public class DeleteRecord {
	public static void main(String[] args) {
		StudentService studentService=new StudentService();
	
	boolean flag=studentService.deleteRecordById(5);
	if(flag==true) {
		System.out.println("Record Deleted.");
	}else {
		System.out.println("record not deleted");
	}
	}
}
