package kodlamaIOApp.business;

import kodlamaIOApp.core.logging.Logger;
import kodlamaIOApp.dataAccess.InstructorDao;
import kodlamaIOApp.entities.Instructor;

public class InstructorManager implements InstructorService {

	private InstructorDao instructorDao;
	private Logger [] loggers;

	
	public InstructorManager(InstructorDao instructorDao, Logger [] loggers) {

		this.instructorDao = instructorDao;
		this.loggers = loggers;
	}


	@Override
	public void add(Instructor instructor) {
		// TODO Auto-generated method stub
		instructorDao.add(instructor);
		
		for (Logger logger : loggers) {
			logger.log(instructor.getName() + " "+ instructor.getLastName());
		}
	}

	

}
