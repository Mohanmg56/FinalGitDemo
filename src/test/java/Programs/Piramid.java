package Programs;

public class Piramid {
	// Program for Printing Pyramid Pattern in java
	public static void main(String[] args)
	{
		for(int i=1;i<5;i++) //this will print 4 rows
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
				System.out.print("\t");
			}
			System.out.println();
		}

	}

}
