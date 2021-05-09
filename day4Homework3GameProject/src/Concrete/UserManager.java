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
			System.out.println("Kullanýcý baþarýyla eklendi: "+user.getFirstName()+" "+user.getLastName());
		}
		else {
			throw new Exception("Kullanýcý bilgileri geçerli deðil.");
		}
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Kullanýcý baþarýyla silindi: "+user.getFirstName()+" "+user.getLastName());
		
	}

	@Override
	public void update(User user) {
		System.out.println("Kullanýcý baþarýyla güncellendi: "+user.getFirstName()+" "+user.getLastName());
		
	}

}
