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

	
	private JdbcTemplate JdbcTemplate;
	
	private final String SQL_FETCH_ALL="select * from student";
	private final String SQL_FETCH_BY_ID="select * from student where id=?";
	private final String SQL_INSERT="insert into student (name,email) values(?,?)";
	private final String SQL_UPDATE="update student set name=? , email=? where id=?";
	private final String SQL_DELETE ="delete from student where id=?";
	
	
	
	
	@Autowired
	public StudentDaoJdbcTemplateImpl(DataSource dataSource) {
		// TODO Auto-generated constructor stub
	this.JdbcTemplate=new JdbcTemplate(dataSource);
	}
	
	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
	//	this.JdbcTemplate.query(<raw query>, <mapper>);
		//the below line gives the result in the form of a list so we have used <Studet> before the student.class
		List<Student> students=	this.JdbcTemplate.query(this.SQL_FETCH_ALL, new BeanPropertyRowMapper<Student>(Student.class));
		return students;
	}

	@Override
	public Student findById(Integer Id) {
		this.JdbcTemplate.queryForObject(this.SQL_FETCH_BY_ID,
										new Object[] {Id},
										new BeanPropertyRowMapper<Student>(Student.class));
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(Student student) {
		// TODO Auto-generated method stub
		int n=this.JdbcTemplate.update(this.SQL_INSERT,
										new Object[] {student.getName(),student.getEmail()});
		if(n>0)
			return true;
		return false;
	}

	@Override
	public boolean update(Student student) {
		// TODO Auto-generated method stub
		int n=this.JdbcTemplate.update(this.SQL_INSERT,
				new Object[] {student.getName(),student.getEmail(),student.getId()});
		if(n>0)
			return true;
		
		return false;
	}

	@Override
	public boolean delete(Integer Id) {
		// TODO Auto-generated method stub
		int n = this.JdbcTemplate.update(this.SQL_DELETE,new Object[] {Id});
		
		if(n>0)
			return true;
		return false;
	}

}
