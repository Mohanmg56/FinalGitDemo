package practicePrograms;

public class Fibanocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1 2 3 5 8 13 21
		int a=0;
		int b=1;
		int sum=0;
		int i=0;
		
		while(i<7)
		{
			sum=a+b;
			a=b;
			b=sum;
			i++;
		}
				
		
		
	}
	}


