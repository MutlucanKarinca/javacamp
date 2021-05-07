package business.concretes;

import java.util.regex.Pattern;

import business.abstracts.AuthService;
import core.BusinessRules;
import entities.concretes.User;

public class AuthManager implements AuthService{
	
	public static final Pattern VALID_EMAIL_ADDRESS_REGEX = 
		    Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
	
	
	@Override
	public boolean validate(User user) {
		boolean result=BusinessRules.Run(ifPasswordCheckLength(user),
				ifFirstNameCheckLength(user),
				ifLastNameCheckLength(user),
				ifEmailFormatCheckValid(user));
		return result;
	}

	@Override
	public boolean login(User user) {
		boolean result=BusinessRules.Run(isFirstAndLastNameEmpty(user));
		return result;
	}
	
	private boolean ifPasswordCheckLength(User user) {
		if (user.getPassword().length()<6) {
			System.out.println("Parolan�z en az 6 karakter olmal�d�r.");
			return false;
		}
		return true;
	}
	
	private boolean ifFirstNameCheckLength(User user) {
		if (user.getFirstName().length()<2) {
			System.out.println("�sminiz en az 2 karakter olmal�d�r.");
			return false;
		}
		return true;
	}
	
	private boolean ifLastNameCheckLength(User user) {
		if (user.getLastName().length()<2) {
			System.out.println("Soyad�n�z en az 2 karakter olmal�d�r.");
			return false;
		}
		return true;
	}
	
	private boolean ifEmailFormatCheckValid(User email) {
		return VALID_EMAIL_ADDRESS_REGEX.matcher(email.geteMail()).find();
	}
	
	private boolean isFirstAndLastNameEmpty(User user) {
		if (user.geteMail()==null || user.getPassword()==null) {
			System.out.println("Kullan�c� ad� veya parola eksik.");
			return false;
		}
		System.out.println("Sisteme giri� yap�ld�.");
		return true;
	}
}
