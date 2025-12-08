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

	public void removeStudent(int id) {
		String sql = "DELETE FROM STUDENT WHERE id=?";

		jdbcTemplate.update(sql, id);
	}

	public void updateStudent(Student student) {
		String sql = "UPDATE STUDENT set name=? , marks=? WHERE id=?)";

		jdbcTemplate.update(sql, student.getName(), student.getMarks(), student.getId());
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
