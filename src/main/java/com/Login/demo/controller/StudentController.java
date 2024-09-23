package com.Login.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Login.demo.entity.StudentDetails;
import com.Login.demo.service.StudentService;

@RestController
@CrossOrigin("http://localhost:4200")
public class StudentController {

	@Autowired
	private StudentService studentservice;
	
	@PostMapping("/save/student")
	public StudentDetails save(@RequestBody StudentDetails studentdetails) {
		return studentservice.saveStudent(studentdetails);
	}
	
	@GetMapping("get/student")
	public List<StudentDetails> getStudents() {
		return studentservice.getStudents();
	}
	
	@GetMapping("get/student/{studentid}")
	public StudentDetails getStudent(@PathVariable int studentid) {
		return studentservice.getStudent(studentid);
	}
	
	@DeleteMapping("delete/student")
	public void deleteStudents() {
		studentservice.deleteStudents();
	}
	
	@DeleteMapping("delete/student/{studentid}")
	public void deleteStudent(@PathVariable int studentid) {
		studentservice.deleteStudent(studentid);
	}
	
	@PutMapping("/update/student")
	public StudentDetails updateStudent(@RequestBody StudentDetails studentdetails) {
		return studentservice.updateStudent(studentdetails);
	}
}
