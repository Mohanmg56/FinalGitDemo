package Programs;

public class Primenumbers {
	// To check if given number is prime or not
	
	public static void main(String[] args) 
	{
		boolean flag=false;
		int val=25;
		
		for( int i=2;i<=val/2;i++)
		{
			if(val%i==0)
			{
				flag=true;
				break;
			}
		}
		if(flag)
			System.out.println("it is not a prime");
			
			else
				System.out.println("it is a prime");
		{
			
		}

}
}