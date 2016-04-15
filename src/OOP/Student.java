package OOP;

public class Student {
	
	 public String name;
	 public String password;
	 public int grade;
	
	 public Student(String name, String password, int grade) {
		super();
		this.name = name;
		this.password = password;
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", grade=" + grade + "]";
	}

	
	 
	 

}
