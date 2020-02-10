package com.cts.training.maven.dao;


import java.util.List;
import com.cts.training.maven.entity.*;


public interface IStudentDao {

		List<Student> findAll();
	    Student	findById(Integer Id);
	    boolean add(Student student);
	    boolean update(Student student);
	    boolean delete(Integer Id);
}
