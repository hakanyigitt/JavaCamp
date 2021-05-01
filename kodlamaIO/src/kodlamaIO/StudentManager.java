package kodlamaIO;

public class StudentManager extends UserManager{
	public void changePassword(Student student) {
		student.setPassword("123456");
		System.out.println("Þifreniz deðiþtirildi");
	}
	
}
