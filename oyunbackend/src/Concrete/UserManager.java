package Concrete;

import Abstract.UserCheckService;
import Abstract.UserService;
import Entities.User;

public class UserManager implements UserService{
	

	private UserCheckService userCheckService;
	
	public UserManager(UserCheckService userCheckService) {
		this.userCheckService = userCheckService;
	}
	
	@Override
	public void add(User user) {
		boolean result=userCheckService.CheckIfRealPerson(user);
		if(!result) {
			System.out.println("Do�rulama ba�ar�s�z.");
			return;
		}
		System.out.println("Kullan�c� eklendi :" + user.getFirstName()+" "+user.getLastName());		
	}

	@Override
	public void update(User user) {
		boolean result=userCheckService.CheckIfRealPerson(user);
		if(!result) {
			System.out.println("Do�rulama ba�ar�s�z.");
			return;
		}
		System.out.println("Kullan�c� g�ncellendi :" + user.getFirstName()+" "+user.getLastName());		
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Kullan�c� silindi :" + user.getFirstName()+" "+user.getLastName());		
		
	}

}
