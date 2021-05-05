package day3Homework2;

public class StudentManager extends UserManager {

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		System.out.println(user.getEmail()+"mail adresli öðrenci baþarýyla eklendi.");
	}

	@Override
	public void deleteUser(User user) {
		// TODO Auto-generated method stub
		System.out.println(user.getEmail() +"mail adresli öðrenci baþarýyla silindi.");
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		System.out.println(user.getEmail() +"mail adresli öðrenci baþarýyla güncellendi.");
	}

	@Override
	public void showUsers(User[] users) {
		System.out.println("******************Öðrenci Listesi******************");
		for(User user: users) {
			System.out.println("Öðrenci Id: "+user.getId());
			System.out.println("Öðrenci Email: "+user.getEmail());
			System.out.println("-----------------");
		}
	}
	
	public void addCourse(String lessonName) {
		System.out.println(lessonName+" isimli kurs basariyla eklendi.");
	}
	
	public void deleteCourse(String lessonName) {
		System.out.println(lessonName+" isimli kurs basariyla silindi.");
	}
	
	public void showCourse(Student student) {
		System.out.println("**********"+student.getFirstName()+" "+student.getLastName()+" Adlý Öðrencinin Aldýðý Derslerin Listesi**********");
		for(String course:student.getCourses()) {
			System.out.println("- "+course);
		}
	}
	

}
