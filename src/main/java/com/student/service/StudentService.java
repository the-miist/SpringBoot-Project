package com.student.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.student.models.Student;

import jakarta.annotation.PostConstruct;

@Service
public class StudentService {

	List<Student> students;

	@PostConstruct
	void init() {
		students = new ArrayList<Student>();
		students.add(new Student(1, "Divyesh", "Pithadiya", List.of("History", "English")));
		students.add(new Student(2, "Hardik", "Pandya", List.of("Java", "Python")));
	}

	public List<Student> getStudents() {
		return students;
	}

	public List<Student> saveStudent(Student student) {
		students.add(student);
		return students;
	}

	public List<Student> deleteStudent(int id) {

		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getId() == id) {
				students.remove(students.get(i));
			}
		}

		return students;

	}

	public List<Student> updateStudent(Student student, int id) {
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getId() == id) {
				students.get(i).setId(id);;
				students.get(i).setName(student.getName());
				students.get(i).setSurname(student.getSurname());
				students.get(i).setSubjects(student.getSubjects());
				return students;
			}
		}
		return null;
	}

}

