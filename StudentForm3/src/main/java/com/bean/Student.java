package com.bean;

import java.io.Serializable;
import java.util.Arrays;

public class Student implements Serializable {
	private String firstName;
	private String lastName;
	private String gender;
	private String[] courses;
	private int yearOfPassing;

	public Student() {
	}

	public Student(String firstName, String lastName, String gender, String[] courses, int yearOfPassing) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.courses = courses;
		this.yearOfPassing = yearOfPassing;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String[] getCourses() {
		return courses;
	}

	public void setCourses(String[] courses) {
		this.courses = courses;
	}

	public int getYearOfPassing() {
		return yearOfPassing;
	}

	public void setYearOfPassing(int yearOfPassing) {
		this.yearOfPassing = yearOfPassing;
	}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender + ", courses="
				+ Arrays.toString(courses) + ", yearOfPassing=" + yearOfPassing + "]";
	}

}
