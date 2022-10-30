package kodlamaIOApp.entities;

public class Course {
	private int id;
	private String courseName;
	private int coursePrice;
	private String description;
	private Instructor instructor;
	
	public Course() {
		super();
	}

	public Course(int id, String courseName, int coursePrice, String description, Instructor instructor) {
		super();
		this.id = id;
		this.courseName = courseName;
		this.coursePrice = coursePrice;
		this.description = description;
		this.instructor = instructor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getCoursePrice() {
		return coursePrice;
	}

	public void setCoursePrice(int coursePrice) {
		this.coursePrice = coursePrice;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Instructor getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}
	
	
	
	
	
	
	

}
