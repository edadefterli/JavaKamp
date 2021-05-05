package day3Homework2;

public class Main {

	public static void main(String[] args) {

		Student student1 = new Student();
		student1.setId(0);
		student1.setFirstName("Eda");
		student1.setLastName("Defterli");
		student1.setEmail("edadefterlii@gmail.com");
		String[] courses = {"Java+React","C#+Angular"};
		student1.setCourses(courses);
		
		String[] lessons = {"Programlamaya Giriþ Ýçin Temel Kurs","Java+React","C#+Angular"};
		String[] certificates= {"MCT","PMP","ITIL"};
		Instructor instructor1 = new Instructor(0,"xxx@gmail.com","Engin","Demiroð",lessons,certificates);
		
		
		InstructorManager instructorManager=new InstructorManager();
		instructorManager.addLesson("Python");
		instructorManager.deleteLesson("Python");
		instructorManager.showLessons(instructor1);
		User[] users = {instructor1};
		instructorManager.showUsers(users);
		
		
		StudentManager studentManager = new StudentManager();
		Student[] students = {student1};
		studentManager.showUsers(students);
		studentManager.showCourse(student1);
	}

}
