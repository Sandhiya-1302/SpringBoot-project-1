package com.Login.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Login.demo.dao.StudentDao;
import com.Login.demo.entity.StudentDetails;

@Service
public class StudentService {

	@Autowired
	private StudentDao studentdao;
	
	public StudentDetails saveStudent(StudentDetails studentdetails) {
		return studentdao.save(studentdetails);
	}
	
	public List<StudentDetails> getStudents() {
		List<StudentDetails> students = new ArrayList<>();
		studentdao.findAll().forEach(s -> students.add(s));
		return students;
	}
	
	public StudentDetails getStudent(int studentid) {
		return studentdao.findById(studentid).orElseThrow();
	}
	
	public void deleteStudents() {
		studentdao.deleteAll();
	}
	
	public void deleteStudent(int studentid) {
		studentdao.deleteById(studentid);
	}
	
	public StudentDetails updateStudent(StudentDetails studentdetails) {
		studentdao.findById(studentdetails.getStudentid()).orElseThrow();
		return studentdao.save(studentdetails);
	}
}
