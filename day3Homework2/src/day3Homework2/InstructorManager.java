package day3Homework2;

public class InstructorManager extends UserManager {
	
	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		System.out.println(user.getEmail()+"mail adresli e�itmen ba�ar�yla eklendi.");
	}

	@Override
	public void deleteUser(User user) {
		// TODO Auto-generated method stub
		System.out.println(user.getEmail() +"mail adresli e�itmen ba�ar�yla silindi.");
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		System.out.println(user.getEmail() +"mail adresli e�itmen ba�ar�yla g�ncellendi.");
	}

	@Override
	public void showUsers(User[] users) {
		// TODO Auto-generated method stub
		System.out.println("******************E�itmen Listesi******************");
		for(User user: users) {
			System.out.println("E�itmen Id: "+user.getId());
			System.out.println("E�itmen Email: "+user.getEmail());
			System.out.println("-----------------");
		}
	}

	public void addLesson(String lessonName) {
		System.out.println(lessonName+" isimli kurs basariyla eklendi.");
	}
	
	public void updateLesson(String lessonName) {
		System.out.println(lessonName+" isimli kurs basariyla g�ncellendi.");
	}
	
	public void deleteLesson(String lessonName) {
		System.out.println(lessonName+" isimli kurs basariyla silindi.");
	}
	
	public void showLessons(Instructor instructor) {
		System.out.println("**********"+instructor.getFirstName()+" "+instructor.getLastName()+" Adl� E�itmenin Verdi�i Derslerin Listesi**********");
		for(String lesson:instructor.getLessons()) {
			System.out.println("- "+lesson);
		}
	}
	

}
