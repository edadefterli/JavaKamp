package day5HomeworkETicaret.business.concretes;

import day5HomeworkETicaret.business.abstracts.AuthService;
import day5HomeworkETicaret.core.abstracts.RegisterService;
import day5HomeworkETicaret.dataAccess.abstracts.UserDao;
import day5HomeworkETicaret.entities.concretes.User;

public class AuthManager implements AuthService {
	
	private RegisterService registerService;
	private UserDao userDao;
	
	

	public AuthManager(RegisterService registerService, UserDao userDao) {
		this.registerService = registerService;
		this.userDao = userDao;
	}

	@Override
	public void register(User user) {
		try {
			registerService.register(user);
			userDao.add(user);
		}
		catch(Exception e){
			System.out.println(e);
		}
		
	}

	@Override
	public void login(String mail, String password) {
		User user= userDao.getByMail(mail);
		if(user==null) {
			System.out.println("Eposta yanl��.");
			return;
		}
		if(user.getPassword().equals(password)) {
			System.out.println(user.getFirstName()+" "+user.getLastName()+" adl� kullan�c� ba�ar�yla giri� yapt�.");
			return;
		}
		System.out.println("Giri� hatal�.");
		
		
		
	}

}
