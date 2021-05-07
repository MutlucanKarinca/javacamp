import java.util.Scanner;

import business.abstracts.UserService;
import business.concretes.AuthManager;
import business.concretes.EmailManager;
import business.concretes.UserManager;
import dataAccess.concretes.InMemoryUserDao;
import entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		User user=new User(1,"Mutlucan","Karýnca","mutlucankarinca@gmail.com","123456");
		
		UserService userService=new UserManager(new InMemoryUserDao(),new AuthManager(),new EmailManager());
		userService.add(user);
		
		int verificationCode=scan.nextInt();
		userService.userVerify(user, verificationCode);
	}

}
