package Programs;

public class CountString {
	// Count no of occurance of charecters in the string
	
	public static void main(String[] args) 
	{
		int count=countOccurances("MohanMG",'M');

	}

	private static int countOccurances(String word, char c) 
	{
		int count=0;
		for(int i=0;i<word.length();i++)
		{
			if(word.charAt(i)==c)
			{
				count++;
			}
		}
		System.out.print(count);
		return c;


	

}
}