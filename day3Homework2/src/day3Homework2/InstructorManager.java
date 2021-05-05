package day3Homework2;

public class InstructorManager extends UserManager {
	
	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		System.out.println(user.getEmail()+"mail adresli eðitmen baþarýyla eklendi.");
	}

	@Override
	public void deleteUser(User user) {
		// TODO Auto-generated method stub
		System.out.println(user.getEmail() +"mail adresli eðitmen baþarýyla silindi.");
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		System.out.println(user.getEmail() +"mail adresli eðitmen baþarýyla güncellendi.");
	}

	@Override
	public void showUsers(User[] users) {
		// TODO Auto-generated method stub
		System.out.println("******************Eðitmen Listesi******************");
		for(User user: users) {
			System.out.println("Eðitmen Id: "+user.getId());
			System.out.println("Eðitmen Email: "+user.getEmail());
			System.out.println("-----------------");
		}
	}

	public void addLesson(String lessonName) {
		System.out.println(lessonName+" isimli kurs basariyla eklendi.");
	}
	
	public void updateLesson(String lessonName) {
		System.out.println(lessonName+" isimli kurs basariyla güncellendi.");
	}
	
	public void deleteLesson(String lessonName) {
		System.out.println(lessonName+" isimli kurs basariyla silindi.");
	}
	
	public void showLessons(Instructor instructor) {
		System.out.println("**********"+instructor.getFirstName()+" "+instructor.getLastName()+" Adlý Eðitmenin Verdiði Derslerin Listesi**********");
		for(String lesson:instructor.getLessons()) {
			System.out.println("- "+lesson);
		}
	}
	

}
