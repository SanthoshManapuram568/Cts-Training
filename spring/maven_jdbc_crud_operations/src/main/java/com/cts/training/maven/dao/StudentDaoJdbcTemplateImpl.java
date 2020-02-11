package com.cts.training.maven.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.cts.training.maven.entity.Student;


@Component
public class StudentDaoJdbcTemplateImpl implements IStudentDao {

	// has the dependency on DataSource
	// works on raw sql queries (templated)
	private JdbcTemplate jdbcTemplate;
	
	// SQL templates
	private final String SQL_FETCH_ALL = "select * from student";
	private final String SQL_FETCH_BY_ID = "select * from student where id=?";
	private final String SQL_INSERT = "insert into student(name,email) values(?, ?)";
	private final String SQL_UPDATE = "update student set name=?, email=? where id=?";
	private final String SQL_DELETE = "delete from student where id=?";
	
	
	@Autowired
	public StudentDaoJdbcTemplateImpl(DataSource dataSource) {
		// TODO Auto-generated constructor stub
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public List<Student> findAll() {
		List<Student> students = this.jdbcTemplate.query(this.SQL_FETCH_ALL,new BeanPropertyRowMapper<Student>(Student.class));
		
		return students;
	}

	@Override
	public Student findById(Integer id) {
		// TODO Auto-generated method stub
		Student student =  this.jdbcTemplate.queryForObject(this.SQL_FETCH_BY_ID,
										 new Object[] {id}, 
										 new BeanPropertyRowMapper<Student>(Student.class));
		return student;
	}

	@Override
	public boolean add(Student student) {
		// TODO Auto-generated method stub
		int n = this.jdbcTemplate.update(this.SQL_INSERT, new Object[] {student.getName(), student.getEmail()});
		if(n>0)
			return true;
		return false;
	}

	@Override
	public boolean update(Student student) {
		// TODO Auto-generated method stub
		int n = this.jdbcTemplate.update(this.SQL_UPDATE, new Object[] {student.getName(), student.getEmail(), student.getId()});
		if(n>0)
			return true;
		return false;
	}

	@Override
	public boolean delete(Integer id) {
		// TODO Auto-generated method stub
		int n = this.jdbcTemplate.update(this.SQL_DELETE, new Object[] {id});
		if(n>0)
			return true;
		return false;
	}

}
