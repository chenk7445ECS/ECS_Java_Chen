
public class EvenessMethod
{
	public static void main( String[] args )
	{
		for ( int n = 1 ; n <= 100 ; n++ )
		
			if(n%3 == 0 && n%2 == 0)
			{
				System.out.println(n + "<=");
			}
			
			else if(n%2 == 0)
			{
				System.out.println(n + "<");
			}
			
			else if(n%3 == 0)
			{
				System.out.println(n + "=");
			}
			
			else
			{
				System.out.println( n );
			}
			
			
		
	}



	}
