package day3Homework2;

public class Instructor extends User {
	private String firstName;
	private String lastName;
	private String[] lessons;
	private String[] certificates;
	
	
	public Instructor() {
		
	}

	public Instructor(int id,String email,String firstName,String lastName,String[] lessons, String[] certificates) {
		super(id,email);
		this.firstName=firstName;
		this.lastName=lastName;
		this.lessons=lessons;
		this.certificates=certificates;
		
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

	public String[] getLessons() {
		return lessons;
	}

	public void setLessons(String[] lessons) {
		this.lessons = lessons;
	}

	public String[] getCertificates() {
		return certificates;
	}

	public void setCertificates(String[] certificates) {
		this.certificates = certificates;
	}

	
	

}
