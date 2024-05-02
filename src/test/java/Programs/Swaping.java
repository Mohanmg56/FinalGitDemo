package Programs;

public class Swaping {
	// Swaping the variables with and with outusing temp var
	public static void main(String[] args) {
		/* int a=4;
		 int b=5;
		 
		 int temp;
		 
		 temp=a;
		 a=b;
		 b=temp;
		 
		 System.out.println("a :"+a);
		 System.out.println("b :"+b);
		 */
		
		//Swap without using temp var
		int a=5;
		int b=7;
		
		a=a+b;// a=13
		b=a-b;// b=13-7=5
		a=a-b;// a=13-5=7

		System.out.println("a :"+a);
		 System.out.println("b :"+b);
	}

}
