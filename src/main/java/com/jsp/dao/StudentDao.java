package com.jsp.dao;

import java.util.List;

//import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
//import javax.persistence.Query;
import javax.persistence.Query;

import com.jsp.dto.Student;

public class StudentDao {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("jb");
	EntityManager entityManager=entityManagerFactory.createEntityManager(); // entityManager comes form EMfactory &is used to perform all database manager
	EntityTransaction entityTransaction=entityManager.getTransaction(); //
	
	
//	Saving a product in database| DATA ACCESS OBJECT
	public Student saveStudent(Student student) {
	
		
		entityTransaction.begin();
		entityManager.persist(student);
		entityTransaction.commit();
		
		return student;
	}
	
//	Get student by id
	public Student getStudentById(int id) {
		return entityManager.find(Student.class, id);
	}
	
	
//	Deleting a record
	public boolean deleteRecordById(int studentid) {
	Student student = getStudentById(studentid);
	// or Product product = entitityManager.find(Product.class, id);
	entityTransaction.begin();
	entityManager.remove(student);
	entityTransaction.commit();
	return true;
	}
	

	
//	 to get all records
	@SuppressWarnings("unchecked")
	public List<Student> getAllStudent(){
		String jpql="SELECT s FROM Student s";
		Query query=entityManager.createQuery(jpql);
		List<Student> students=query.getResultList();
		return students;
	}


//	Update Student name
	public Student updateStudentName(int studentid, Student student) {
		if(student!=null) {
			entityTransaction.begin();
			entityManager.merge(student);
			entityTransaction.commit();
			return student;		
		}else {
			return null;
		}
	}
	
//	Update Student email
	public Student updateStudentEmail(int studentid, Student student) {
		if(student!=null) {
			entityTransaction.begin();
			entityManager.merge(student);
			entityTransaction.commit();
			return student;		
		}else {
			return null;
		}
	}
}
