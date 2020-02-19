package com.cts.training.hibernatemapping.dao;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;
//import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.cts.training.hibernatemapping.HibernateMappingApplication;
import com.cts.training.hibernatemapping.entity.Course;
import com.cts.training.hibernatemapping.entity.Review;

@RunWith(SpringRunner.class) // Test Runner
@SpringBootTest(classes =  HibernateMappingApplication.class )
public class ReviewDaoTest {
	@Autowired
	private CourseDao courseDao;
	@Autowired
	private ReviewDao reviewDao;
@Test
public void testAddReviewAndCourse() {
	Course course = new Course();
	course.setName("course1 added");
	Review review = new Review();
	review.setReview("review1 added");
	Review add = this.reviewDao.addReviewAndCourse(review, course);
	assertEquals("review1 added",add.getReview());
}
@Test
public void testAddExistingCourse() {
	Course course = this.courseDao.findById(2);
	Review review = new Review();
	review.setReview("Excellent");
	Review add = this.reviewDao.addReviewtoExistingCourse(review, course);
	assertEquals("Excellent",add.getReview());
}
}
