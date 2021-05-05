package day3Homework2;

public class Student extends User {
	private String firstName;
	private String lastName;
	private String[] courses;
	
	public Student() {
		
	}
	
	public Student(int id,String email,String firstName,String lastName,String[] courses) {
		super(id,email);
		this.firstName=firstName;
		this.lastName=lastName;
		this.courses=courses;
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String[] getCourses() {
		return courses;
	}

	public void setCourses(String[] courses) {
		this.courses = courses;
	}
	
	

}
