package practicePrograms;

public class CountString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int count= countOccurances("MMohan",'M');
	}

	private static int countOccurances(String word, char c) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=0;i<word.length();i++)
		{
			if(word.charAt(i)==c)
			{
				count++;
			}
		}
		System.out.print(count);
		return 0;
	}

	

}
