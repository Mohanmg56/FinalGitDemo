package Programs;

public class StrungReverse1 {

	public static void main(String[] args) 
	{


		String s="Mohan";
		String t="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			t=t+s.charAt(i);
			
		}
		System.out.print(t);

}
}