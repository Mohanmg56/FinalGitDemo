package practicePrograms;

import java.util.ArrayList;

public class CompareArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {3,4,5,6,7};
		int b[]= {3,4,4,6,7};
		
	ArrayList<Integer> al= new ArrayList<Integer>();
	
	for(int i=0;i<a.length;i++)
	{
		if(a[i]==b[i])
		{
			al.add(a[i]);
		}
	}
	Object c=al.toArray();
	
	for(Object obj:c)
	{
		System.out.print(obj);
	}
	
}
}
