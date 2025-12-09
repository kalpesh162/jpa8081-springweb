package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.StudentDao;
import com.model.Student;

@Service
public class StudentService {

	private StudentDao studentDao;

	public void addStudent(Student student) {
		studentDao.insertStudent(student);
	}

	public void deleteStudent(int id) {
		studentDao.removeStudent(id);
	}

	public void modifyStudent(Student student) {
		studentDao.updateStudent(student);
	}
	
	public List<Student> findAllStudets(){
		return studentDao.getAllStudets();
	}

	public Student findStudentById(int id) {
		return studentDao.getStudentById(id);
	}
	public StudentDao getStudentDao() {
		return studentDao;
	}

	@Autowired
	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

}
