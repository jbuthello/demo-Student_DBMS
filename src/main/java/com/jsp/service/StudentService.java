package com.jsp.service;

import java.util.List;

//import java.util.List;

import com.jsp.dao.StudentDao;
import com.jsp.dto.Student;

public class StudentService {
StudentDao studentDao=new StudentDao();
	
	public Student saveStudent(Student studentobj)
	{
		return studentDao.saveStudent(studentobj);
	}
	
	public Student getStudentById(int studentid)
	{
		if(studentid>0) {
			return studentDao.getStudentById(studentid);
		}else {
			return null;
		}
	}

	public boolean deleteRecordById(int studentid)
	{
		if(studentid>0) {
			return studentDao.deleteRecordById(studentid);
		}else {
			return false;
		}
	}

	public List<Student> getAllStudent(){
		return studentDao.getAllStudent();
	}

	public Student updateStudentName(int studentid, String studentname) {
		Student student=studentDao.getStudentById(studentid);
		student.setStudentname(studentname);
		return studentDao.updateStudentName(studentid, student);
	}
	
	public Student updateStudentEmail(int studentid, String studentemail) {
		Student student=studentDao.getStudentById(studentid);
		student.setStudentemail(studentemail);
		return studentDao.updateStudentName(studentid, student);
	}
}