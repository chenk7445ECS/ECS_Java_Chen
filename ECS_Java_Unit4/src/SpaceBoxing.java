import java.util.Scanner;
public class SpaceBoxing 
{
	public static void main( String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		int planet;
		double weight;
		
		System.out.println("Please enter your current earth weight:");
		weight = keyboard.nextDouble();
		
		System.out.println("I have information for the following planets:");
		System.out.println("1. Venus    2. Mars    3. Jupiter");
		System.out.println("4. Saturn   5. Uranus  6. Neptune");
		{
		System.out.println("Which planet are you visiting?");
		planet = keyboard.nextInt();
		}
		if (planet == 1)
		{
			System.out.println(weight*(0.78));
		}
	    if (planet == 2)
		{
			System.out.println(weight*(0.39));
		}
		if (planet == 3)
		{
			System.out.println(weight*(2.65));
		}
		if (planet == 4)
		{
			System.out.println(weight*(1.17));
		}
		if (planet == 5)
		{
			System.out.println(weight*(1.05));
		}
		if (planet == 6)
		{
			System.out.println(weight*(1.23));
		}
		
		keyboard.close();
		
		}
	
		
		
		
		
		
		
		
		
	}
	


