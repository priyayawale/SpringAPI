package com.College.StudentManagementSystem.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.College.StudentManagementSystem.Repository.StudentRepository;
import com.College.StudentManagementSystem.model.Student;

@Service
public class StudentService {

	@Autowired
	StudentRepository studentRepository;
	
	//Get Student Record
	public  List<Student> getAllStuRecord(){
		return studentRepository.findAll();
		
	}
	
	//Insert Record 
	public Student registerStudent(Student student) {
		return studentRepository.save(student);
	}
	
	//Update Record
	public Student UpdateStudentRecord(Student student) {
		return studentRepository.save(student);
	}
	
	//Delete Record
	public void removeStudentRecord(Long stuId) {
		studentRepository.deleteById(stuId);
	}
	
	
}
