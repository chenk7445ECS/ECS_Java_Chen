import java.util.Random;

public class ShorterDoubleDice 
{
	public static void main(String[] args )
	{
		Random  r = new Random();
		int randomNum = 0; 
		int randomNum2 = 1;
		
		System.out.println("HERE COMES THE DICE");
		
		  
		do
		 {
			 randomNum = 1 + r.nextInt(6);
			 randomNum2 = 1 + r.nextInt(6);
			 
			 System.out.println("Roll#1:" + randomNum);
			 System.out.println("Roll#2:" + randomNum2);
			 
			 
			 System.out.println("The total is " + (randomNum + randomNum2));
			 
			
			 
			 
		}
		 while ( randomNum != randomNum2);
		 
		
		
	}

}


			 
				 
				 
			 


