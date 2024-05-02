package Programs;

public class StringReverse {
	// Reverse the string /Palindrom with out using predefined user methode
	
	public static void main(String[] args) 
	{
		String s="Mohan";
		String t= "";
		for(int i=s.length()-1;i>=0;i--)
		{
			t= t+s.charAt(i);
		}
		System.out.println(t);

		 if(s==t)
		 {
			 System.out.println("It is a Palendrom");
		 }
	}

}
