package kodlamaIOApp;

import kodlamaIOApp.business.CategoryManager;
import kodlamaIOApp.business.CourseManager;
import kodlamaIOApp.business.InstructorManager;
import kodlamaIOApp.core.logging.DatabaseLogger;
import kodlamaIOApp.core.logging.EmailLogger;
import kodlamaIOApp.core.logging.FileLogger;
import kodlamaIOApp.core.logging.Logger;
import kodlamaIOApp.dataAccess.HibernateCourseDao;
import kodlamaIOApp.dataAccess.HibernateInstructorDao;
import kodlamaIOApp.dataAccess.JdbcCategoryDao;
import kodlamaIOApp.dataAccess.JdbcCourseDao;
import kodlamaIOApp.entities.Category;
import kodlamaIOApp.entities.Course;
import kodlamaIOApp.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Instructor instructor1 = new Instructor(1, "Engin", "Demirog");
		
		Course course1 = new Course(1,"JavaCamp",200,"Java OOP",instructor1);
		
		Course[] courses = {};
		
		Category category1 = new Category(1,"Software");
		Category [] categories = {};
		
		Logger [] loggers = {new DatabaseLogger(), new EmailLogger(), new FileLogger()};
		
		
		
		
		
		InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(), loggers);
		instructorManager.add(instructor1);
		
		CourseManager courseManager = new CourseManager(new HibernateCourseDao(), courses, loggers);
		courseManager.add(course1);
		
		CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(), categories,loggers);
		
		categoryManager.add(category1);
		
		
		
		
		

	}

}
