package kodlamaIOApp.dataAccess;

import kodlamaIOApp.entities.Course;

public class JdbcCourseDao implements CourseDao {

	@Override
	public void add(Course course) {
		
		System.out.println("Added to database with Jdbc : "+ course.getCourseName());
		
	}

}
