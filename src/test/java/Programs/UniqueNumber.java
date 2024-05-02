package Programs;

import java.util.ArrayList;

public class UniqueNumber {
	// Print Uniqe number in Array
	public static void main(String[] args)
	{
		int a []= {1,1,4,2,3,3,5,5,6,7};//output 1-1time,4=1time,2=1time,3=2time,5=2time,6=1time and 7=1time
		//ArrayList<Integer> al=new ArrayList();
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i+1]==a[i-0])
			{
				System.out.print(a[i]);
			}
		}

	}

}
