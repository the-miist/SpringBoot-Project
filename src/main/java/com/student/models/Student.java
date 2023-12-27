package com.student.models;

import java.util.List;

public class Student {

	private int id;

	private String name;

	private String surname;

	private List<String> subjects;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public List<String> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}

	public Student(int id, String name, String surname, List<String> subjects) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.subjects = subjects;
	}

	public Student() {
		super();
	}

}