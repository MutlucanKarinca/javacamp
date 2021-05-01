package ödev;

public class UserManager {
	public void addUser(User user) {
		System.out.println(user.getFirstName()+" "+
				user.getLastName()+" kodlama.io'ya üye oldunuz.");
	}
	
	public void login(User user) {
		System.out.println(user.getFirstName()+" "+
				user.getLastName()+" kodlama.io'ya hoþgeldiniz.");
	}
	
	public void logout(User user) {
		System.out.println(user.getFirstName()+" "+
				user.getLastName()+" hesabýnýzdan çýkýþ yapýldý.");
	}
}
