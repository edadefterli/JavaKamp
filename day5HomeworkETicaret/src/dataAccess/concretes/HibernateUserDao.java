package day5HomeworkETicaret.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import day5HomeworkETicaret.dataAccess.abstracts.UserDao;
import day5HomeworkETicaret.entities.concretes.User;

public class HibernateUserDao implements UserDao{
	
	List<User> users = new ArrayList<User>();

	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		System.out.println("Kullanýcý baþarýyla eklendi: "+user.getMail());
		users.add(user);	
		
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return users;
	}

	@Override
	public User getByMail(String mail) {
		// TODO Auto-generated method stub
		for(User user: users) {
			if(user.getMail().equals(mail)) {
				return user;
			}
		}
		return null;
	}

}
