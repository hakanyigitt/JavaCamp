package kodlamaIO;

public class Main {

	public static void main(String[] args) {
	Student Hakan = new Student(1, "Hakan", "Yi�it", "hakanyigit028@hotmail.com", "abc123");
	Instructor Engin = new Instructor(1, "Engin", "Demiro�", 2,"Java & React");
	
	UserManager userManager = new UserManager();
	
	User[] users = {Hakan , Engin};
	userManager.multipleAddUser(users);
	
	StudentManager studentManager = new StudentManager();
	
	studentManager.changePassword(Hakan);

	}
}
