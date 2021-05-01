package kodlamaIO;

public class Student extends User{
	String email;
	String password;
	
	public Student(int id, String firstName, String lastName, String email, String password) {
		super(id, firstName,lastName);
		this.email = email;
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
