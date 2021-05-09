package Concrete;


import Abstract.UserCheckService;
import Abstract.UserService;
import Entities.User;

public class UserManager implements UserService{
	
	private UserCheckService userCheckService;
	
	public UserManager(UserCheckService userCheckService) {
		super();
		this.userCheckService = userCheckService;
	}

	@Override
	public void add(User user) throws Exception{
		
		if(userCheckService.isRealPerson(user)) {
			System.out.println("Kullan�c� ba�ar�yla eklendi: "+user.getFirstName()+" "+user.getLastName());
		}
		else {
			throw new Exception("Kullan�c� bilgileri ge�erli de�il.");
		}
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Kullan�c� ba�ar�yla silindi: "+user.getFirstName()+" "+user.getLastName());
		
	}

	@Override
	public void update(User user) {
		System.out.println("Kullan�c� ba�ar�yla g�ncellendi: "+user.getFirstName()+" "+user.getLastName());
		
	}

}
