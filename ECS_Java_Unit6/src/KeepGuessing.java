import java.util.Scanner;
import java.util.Random;

public class KeepGuessing 
{
	public static void main( String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		Random r = new Random();
		int randomNum = 1 + r.nextInt(10);
		
		
		System.out.println("I have chosen a number between 1 and 10. try to guess it");
		int guess = keyboard.nextInt();
		
		while (guess != randomNum)
		{
			System.out.println("This is incorrect. Guess again");
			System.out.print("Your guess:");
			guess = keyboard.nextInt();
		}
		System.out.println("That's right, You're a good guesser.");
		
		keyboard.close();
		
	}
	
	

}
