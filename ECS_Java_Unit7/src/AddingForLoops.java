import java.util.Scanner;
 
public class AddingForLoops
 {
	public static void main (String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		
		System.out.println("Count to: ");
		int number = keyboard.nextInt();
		
	  for (int n = 1 ; n <= number ;  n++)
		{
			System.out.print( n +" ");
			
		}
	        System.out.println(" ");
	  		System.out.println("The sum is:");
			System.out.print(number * (number+1)/2 );
			
			keyboard.close();		
			
	}
		
		
				
		
	}
	 


