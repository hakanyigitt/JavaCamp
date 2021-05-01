package kodlamaIO;

public class Instructor extends User {
	private int courseId;
	private String courseName;
	
	public Instructor(int id, String firstName, String lastName,int courseId, String courseName) {
		super(id, firstName,lastName);
		this.courseId = courseId;
		this.courseName = courseName;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
}
