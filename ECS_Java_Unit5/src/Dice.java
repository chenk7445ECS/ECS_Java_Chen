import java.util.Random;
public class Dice 
{
	public static void main( String[] args )
	{
		
		Random r = new Random();
		
		int randomNum = 1 + r.nextInt(6);
		int randomNum2 = 1 + r.nextInt(6);
		String response;
		
		
		System.out.println("HERE COMES THE DICE!");
		
		System.out.println("Roll#1: " + randomNum );
		System.out.println("Roll#2: " + randomNum2 );
		
		System.out.println("The total is " + (randomNum + randomNum2) + "!");
		
		
		
		
		
		
		
		
	}
}



