package kodlamaIO;

public class UserManager {
	public void addUser(User user) {
		System.out.println(user.getFirstName() + " Kiþisi eklendi");
	}
	public void multipleAddUser(User[] user) {
		for(User users : user) {
			addUser(users);
		}
	}
	
}
