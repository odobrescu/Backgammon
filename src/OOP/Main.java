package OOP;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Student s1 = new Student("Florin", "gigi", 8);
		Student s2 = new Student("Alex", "gigi", 7);
		Student s3 = new Student("Andrei", "gigi", 8);
		School school = new School();
		Professor prof = new Professor("Alexandru","@lex"); 
		
		school.addToCatalog(s1,s2,s3);
		school.professor= prof;
		
		int grade = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert your name: ");
		String name = sc.nextLine();
		System.out.println("Insert the password : ");
		String pass = sc.nextLine();
		if  (!name.equals(prof.name) || !pass.equals(prof.password)){
			System.out.println( " Wrong credentials! Try again ");
			System.exit(0);
		}
		System.out.println("Choose a student : ");
		for (int i= 0 ;i< school.catalog.length;i++){
			if( school.catalog[i]!= null)
			{
				System.out.println( i + "  -  "+ school.catalog[i].name);
				}
			}
		int studentIndex = sc.nextInt();
		
		do{
			System.out.println( " Insert valid Grade : ");
			grade = sc.nextInt();
		} while ((grade>10) || grade <1);
		
		
		prof.gradeStudent(school.catalog[studentIndex], grade);
		
		System.out.println( school.catalog[studentIndex]);
		
	}

}
