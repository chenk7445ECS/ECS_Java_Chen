import java.util.Scanner;
import java.util.Random;

public class HiLow 
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		Random r = new Random();
		
		int randomNum = 1 + r.nextInt(99);
		String response = "";
		
		System.out.println("I'm thinking of a number between 1-100. Try to guess it");
		int choice = keyboard.nextInt();
		
		if (randomNum == choice )
		{
			System.out.println(" You guessed it! What are the odds");
			
		}
		else if (randomNum > choice)
		{
			System.out.println("Sorry, you are too low. I was thinking of " + randomNum);
			
		}
		else if (randomNum < choice)
		{
			System.out.println("Sorry, you are too high. I was thinking of " + randomNum);
		}
		
		keyboard.close();
				
		
		
		
		
		
	}

}
