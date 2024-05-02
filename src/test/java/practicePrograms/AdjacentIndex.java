package practicePrograms;

public class AdjacentIndex {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		int a[]= {2,4,7,9,10};
		int diff=0;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i+1]-a[i]>diff)
				
			{
				diff=a[i+1]-a[i];
				
			}
		}
		System.out.print(diff);
	}
	
}
