package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestController;

import com.student.models.Student;
import com.student.service.StudentService;

@RestController
//@Controller
//@ResponseBody -->also can be done at method level
public class StudentController {
	
	@Autowired
	StudentService service;
	
	@GetMapping("/student/fetch")
	public List<Student> getStudents() {
		return service.getStudents();
	}
	
	@PostMapping("/student/save")
	public List<Student> saveStudent(@RequestBody Student student) {
		return service.saveStudent(student);
	}
	
	@DeleteMapping("/student/delete/{id}")
	public List<Student> deleteStudent(@PathVariable int id) {
		return service.deleteStudent(id);
	}
	
	@PutMapping("/student/update/{id}")
	public List<Student> updateStudent(@PathVariable int id ,@RequestBody Student student){
		return service.updateStudent(student,id);
	}
}
