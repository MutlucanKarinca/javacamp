package core;

import business.abstracts.AuthService;
import entities.concretes.User;
import googleAuth.GoogleAuthManager;

public class GoogleAuthAdapter implements AuthService{
	
	GoogleAuthManager googleAuthManager=new GoogleAuthManager();
	
	@Override
	public boolean validate(User user) {
		boolean result = false;

		result = googleAuthManager.register(user.getId(), user.getFirstName(), user.getLastName(), user.geteMail(),
				user.getPassword());
		if (result != true) {
			return false;
		}
		System.out.println("Google ile kayýt olundu!");
		return true;
	}

	@Override
	public boolean login(User user) {
		boolean result=BusinessRules.Run(isFirstAndLastNameEmpty(user));
		return result;
	}
	
	private boolean isFirstAndLastNameEmpty(User user) {
		if (user.geteMail()==null || user.getPassword()==null) {
			System.out.println("Kullanýcý adý veya parola eksik!");
			return false;
		}
		System.out.println("Sisteme giriþ yapýldý!");
		return true;
	}
}
