import java.util.Random;

public class DoubleDice 
{
	public static void main(String[] args )
	{
		Random  r = new Random();
		int randomNum = 1 + r.nextInt(6);
		int randomNum2 = 1 + r.nextInt(6);
		
		System.out.println("HERE COMES THE DICE");
		
		 System.out.print("Roll#1:" + randomNum);
		 System.out.print("Roll#2:" + randomNum2);
		
		 
		 while ( randomNum != randomNum2)
		 {
			 randomNum = 1 + r.nextInt(6);
			 randomNum2 = 1 + r.nextInt(6);
			 
			 System.out.println("The total is" + (randomNum + randomNum2));
			 
			
			 
			 
			
		 }
		 
		
		
	}

}
