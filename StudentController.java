package com.College.StudentManagementSystem.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.College.StudentManagementSystem.Service.StudentService;
import com.College.StudentManagementSystem.model.Student;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/StudentLists")
	public List<Student> getAllStuRecord(){
		return studentService.getAllStuRecord();
	}
    
	@PostMapping("/registerStu")
	public Student registerStudent(@RequestBody Student student) {
		return studentService.registerStudent(student);
	}
	
	@PutMapping("/updateRecord")
	public Student UpdateStudentRecord(@RequestBody Student student) {
		Student temp=studentService.UpdateStudentRecord(student);
		return temp;
	}
	
	@DeleteMapping("/deleteRecord/{stuId}")
	public void removeStudentRecord(@PathVariable("stuId") Long stuId) {
		studentService.removeStudentRecord(stuId);
	}
	
	
}
