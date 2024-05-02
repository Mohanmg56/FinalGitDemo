package Programs;

public class SortingArray {
	// TODO Auto-generated method stub
	public static void main(String[] args) 
	{
		int a[]= {2,1,4,9,3,8};    //1,2,4,9,3,8//1,2,3,4,9,8//1,2,3,4,8,9
		int temp;
		//output 1,2,3,4,8,9

		for(int i=0;i<6;i++)
		{
			for(int j=i+1;j<6;j++)
			{
				if(a[i]>a[j])
				{
					//swap
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
					
				}
				
			}
		}
		for(int i=0;i<6;i++)
		{
			System.out.print(a[i]);
		}
	}

}
