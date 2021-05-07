package business.concretes;

import java.util.List;

import business.abstracts.AuthService;
import business.abstracts.EmailService;
import business.abstracts.UserService;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class UserManager implements UserService{
	
	private UserDao userDao;
	private AuthService authService;
	private EmailService emailService;
	
	public UserManager(UserDao userDao, AuthService authService, EmailService emailService) {
		super();
		this.userDao = userDao;
		this.authService = authService;
		this.emailService = emailService;
	}
	
	@Override
	public void add(User user) {
		if (userCheck(user.geteMail()) &&authService.validate(user)) {
			userDao.add(user);
			System.out.println("Do�rulama Kodunuz Mail Olarak G�nderildi! Do�rulama Kodunuz: "+emailService.mailSend());
			System.out.print("Do�rulama Kodunu Giriniz: ");
			return;			
		}
		System.out.println("Kullan�c� Bilgilerini Kontrol Ediniz!");
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void userVerify(User user, int verificationCode) {
		int result=emailService.mailSend();
		if (result==verificationCode) {
			
			System.out.println("Kullan�c� do�ruland�. �yeli�iniz Tamamland�!!! "+user.getFirstName());
		}
		else {
			System.out.println("Do�rulama kodunuz yanl��!");
		}
		
	}
	public boolean userCheck(String mail) {
		if (userDao.getEmail(mail)!=null) {
			System.out.println("Kullan�c� mevcut!");
			return false;
		}
		return true;
	}
}
