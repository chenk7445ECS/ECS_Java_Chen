import java.util.Scanner;

public class UserInputofData 
{
	public static void main( String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		String name, lastname, login;
		int grade;
		double gpa, studentid;
		
		System.out.println("First name:");
		name = keyboard.next();
		
		System.out.println("Last name:");
		lastname = keyboard.next();
		
		System.out.println("Grade(9-12);") ;
		grade = keyboard.nextInt();
		
		System.out.println("Student ID:");
		studentid = keyboard.nextDouble();
		
		System.out.println("Login:");
		login = keyboard.next();
		
		System.out.println("GPA:");
		gpa = keyboard.nextDouble();
		
		System.out.println("Your Information:");
		System.out.println("Login: " + login);
		System.out.println("ID: " + studentid);
		System.out.println("Grade: " + grade);
		System.out.println("Name: " + lastname + ", "  + name );
		System.out.println("GPA: " + gpa);
		
		keyboard.close();
		
		
		
		
		
		
	}
	

	
}
