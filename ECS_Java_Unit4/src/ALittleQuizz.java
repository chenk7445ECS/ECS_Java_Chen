import java.util.Scanner;
public class ALittleQuizz 
{
	public static void main( String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		int answer1, answer2, answer3, score = 0;
		System.out.println("Q1) What is 2 + 2");
		System.out.println("1) 1");
		System.out.println("2) 4)");
		System.out.println("3) 60");
		
		answer1 = keyboard.nextInt();
		System.out.println();
		if (answer1 == 1) {
			System.out.println("Correct!");
			score++;
		}
		else 
		{
			System.out.println("Wrong, the answer is 4");
		}
		
		System.out.println("Q2) What is the capital of the US");
		System.out.println("1) Washington DC");
		System.out.println("2) California");
		System.out.println("3) Hawaii");
		
		answer2 = keyboard.nextInt();
		System.out.println();
		if (answer2 == 1){
			System.out.println("Correct!");
			score++;
		}
		else
		{
			System.out.println("Wrong, the answer is Washington DC");
			
		}
		 System.out.println("Q3) How many continents are there? ");
		 System.out.println("1) 2");
		 System.out.println("2) 7");
		 System.out.println("3) 11");
		 answer3 = keyboard.nextInt();
		 System.out.println();
		 if (answer3 == 2 ){
			 System.out.println("Correct!");
			 score++;
		 }
		 else
		 {
			 System.out.println("Wrong the answer is 7");
		 }
		 
		 System.out.println( "Overall, you got " + score + " out of 3 correct!");
		 System.out.println("Thanks for playing!");
		 
		 keyboard.close();
		 
		
	}
	

}
