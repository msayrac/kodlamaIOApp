package kodlamaIOApp.business;

import kodlamaIOApp.core.logging.Logger;
import kodlamaIOApp.dataAccess.CourseDao;
import kodlamaIOApp.entities.Course;

public class CourseManager implements CourseService {
	
	private CourseDao courseDao;
	
	private Course[] courses;
	private Logger [] loggers;
	

	public CourseManager(CourseDao courseDao, Course[] courses, Logger[] loggers) {
		super();
		this.courseDao = courseDao;
		this.courses = courses;
		this.loggers = loggers;
	}



	@Override
	public void add(Course course) throws Exception {
		
		if(course.getCoursePrice() < 0) {
			throw new Exception("Course price must be higher than 0.");
		}
		
		for (Course course1 : courses) {
			
			if(course1.getCourseName() == course.getCourseName()) {
				throw new Exception("Course name should not repeat.");
			}
			
		}
		
		courseDao.add(course);
		
		for (Logger logger :loggers) {
			logger.log(course.getCourseName());
			
		}
		
		
		
		
		
	}

}
