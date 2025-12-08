package com.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.model.Student;

@Repository
public class StudentDao {

	private JdbcTemplate jdbcTemplate;

	public void insertStudent(Student student) {
		String sql = "INSERT INTO STUDENT (id,name,marks) values(?,?,?)";

		jdbcTemplate.update(sql, student.getId(), student.getName(), student.getMarks());
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
