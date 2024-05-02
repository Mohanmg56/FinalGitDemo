package Programs;

public class Fibanocci {
	// Print fibanocci series by swapping variables 
	// 1 2 3 5 8 13 21
	public static void main(String[] args) 
	{
	
		 int a=0;
		 int b=1;
		 int sum=0;
		 
		 int i=0;
		while(i<8)
		 {
			 sum = a+b;
				System.out.print(sum);
				System.out.print("\t");
				a=b;
				b=sum;
				i++;
		 }
		
}
}