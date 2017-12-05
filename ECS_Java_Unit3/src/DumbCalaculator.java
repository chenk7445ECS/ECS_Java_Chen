import java.util.Scanner;

public class DumbCalaculator 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		double firstnumber, secondnumber, thirdnumber;
		
		System.out.println("Let's find the average of a few numbers...");
		
		System.out.println("What is the first number?");
		firstnumber = keyboard.nextDouble();
		
		System.out.println(" What is the second number?");
		secondnumber = keyboard.nextDouble();
		
		System.out.println("What is the third number?");
		thirdnumber = keyboard.nextDouble();
		
		System.out.println("The average of the three numbers is " + (firstnumber + secondnumber + thirdnumber) / 3 ) ;
		
		keyboard.close();
		
		
		
	}
	

}
