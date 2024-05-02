package Programs;

public class MultiDimentionalArray {
	// Print Min and Max number in Multidimentional Array
	// 2  4  5
	// 3  7  9
	// 5  1  6
	// Min Number
	/*public static void main(String[] args) 
	{
	
		int abc[][]= {{2,4,3},{1,5,3},{5,8,9}};
		int min = abc[0][0];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(min>abc[i][j])
				{
					min=abc[i][j];
				}
			}
		}
		System.out.print(min);
}*/
	
	// Max number
	public static void main(String[] args) 
	{
	
		int abc[][]= {{2,4,3},{1,5,3},{5,8,9}};
		int Max = abc[0][0]; //2
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(Max<abc[i][j])
				{
					Max=abc[i][j];
				}
			}
		}
		System.out.print(Max);
}
}