package kodlamaIO;

public class InstructorManager extends UserManager{
	public void addInstructor(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " isimli e�itmen eklendi");
	}
	
	public void addCourse(Instructor instructor) {
		System.out.println(instructor.getCourseName() + " kursu eklendi");
	}
}
