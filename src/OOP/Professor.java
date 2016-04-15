package OOP;

public class Professor {
	
	String name;
	String password;
	
	public Professor(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}
	
	public void gradeStudent(Student s, int grade){
		s.grade = grade;
	}
	

}
