package com.bharat.main;

import java.util.List;

import com.bharat.model.Student;
import com.bharat.studentdao.StudentDao;

public class Main {
public static void main(String[] args) {
	StudentDao studentDao = new StudentDao();
	Student student = new Student("bharat", "kumar", "bharat@gmail.com");
	studentDao.saveStudent(student);
	
	studentDao.insertStudent();
	
	// update student
	Student student1 = new Student("amar", "kumar", "amar@gmail.com");
	studentDao.updateStudent(student1);
	
	// get students
	List<Student> students = studentDao.getStudents();
	students.forEach(s -> System.out.println(s.getFirstName()));
	
	// get single student
	Student student2 = studentDao.getStudent(1);
	System.out.println(student2.getFirstName());
	
	// delete student
	studentDao.deleteStudent(1);
}
}
