package day5HomeworkETicaret;

import day5HomeworkETicaret.business.concretes.AuthManager;
import day5HomeworkETicaret.business.concretes.EMailVerificationManager;
import day5HomeworkETicaret.business.concretes.UserManager;
import day5HomeworkETicaret.business.concretes.UserValidationManager;
import day5HomeworkETicaret.core.concretes.EmailManager;
import day5HomeworkETicaret.core.concretes.GoogleManagerAdapter;
import day5HomeworkETicaret.dataAccess.concretes.HibernateUserDao;
import day5HomeworkETicaret.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		User user1 = new User(1,"Edanur","Defterli","edadefterlii@gmail.com","123456");
		User user2 = new User(2,"XXX","YYY","xxx@gim.com","00000");
		AuthManager authManager1 = new AuthManager(new UserManager(new UserValidationManager(),new HibernateUserDao(),new EMailVerificationManager(),new EmailManager()),new HibernateUserDao());
		authManager1.register(user1);
		authManager1.login("edadefterlii@gmail.com", "123456");
		
		
		authManager1.register(user2);
		authManager1.login("xxx@gim.com", "123456");
		
		User user3 = new User(1,"Berfin","Okuducu","berfinokuducu@gmail.com","999999");
		AuthManager authManager2=new AuthManager(new GoogleManagerAdapter(),new HibernateUserDao());
		authManager2.register(user3);
		authManager2.login("berfinokuducu@gmail.com", "999999");
		
	}

}
