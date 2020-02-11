package com.cts.training.maven.services;

import java.util.List;

import com.cts.training.maven.entity.Student;

public interface IStudentService {
	List<Student> findAllStudents();
    Student	findStudentById(Integer Id);
    boolean addStudent(Student student);
    boolean updateStudent(Student student);
    boolean deleteStudent(Integer Id);
}
