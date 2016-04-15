package OOP;

public class School {
	
	public Professor professor;

	public Student[] catalog = new Student[10];
	
	public  void addToCatalog(Student ... students){
		for (int i=0; i<students.length;i++){
			catalog[i] = students[i];
		}
		
	}
	
}
