package kodlamaIOApp.dataAccess;

import kodlamaIOApp.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao {

	@Override
	public void add(Instructor instructor) {
		
		System.out.println("Added to database with Jdbc : "+ instructor.getName() + " "+ instructor.getLastName());
		
		
	}

}
