package �dev;

public class UserManager {
	public void addUser(User user) {
		System.out.println(user.getFirstName()+" "+
				user.getLastName()+" kodlama.io'ya �ye oldunuz.");
	}
	
	public void login(User user) {
		System.out.println(user.getFirstName()+" "+
				user.getLastName()+" kodlama.io'ya ho�geldiniz.");
	}
	
	public void logout(User user) {
		System.out.println(user.getFirstName()+" "+
				user.getLastName()+" hesab�n�zdan ��k�� yap�ld�.");
	}
}
