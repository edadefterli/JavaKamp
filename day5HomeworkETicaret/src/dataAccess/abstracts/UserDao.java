package day5HomeworkETicaret.dataAccess.abstracts;

import java.util.List;

import day5HomeworkETicaret.entities.concretes.User;

public interface UserDao {
	
	void add(User user);
	List<User> getAll();
	User getByMail(String mail);
	

}
