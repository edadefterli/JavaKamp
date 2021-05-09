package day5HomeworkETicaret.business.abstracts;

import day5HomeworkETicaret.entities.concretes.User;

public interface AuthService {
	
	void register(User user);
	
	void login(String mail,String password);
	
	

}
