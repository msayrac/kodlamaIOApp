package kodlamaIOApp.dataAccess;

import kodlamaIOApp.entities.Instructor;

public class HibernateInstructorDao implements InstructorDao {

	@Override
	public void add(Instructor instructor) {
		
		System.out.println("Added to database with Hibernate : "+ instructor.getName() + " "+ instructor.getLastName());
		
		
	}

}
