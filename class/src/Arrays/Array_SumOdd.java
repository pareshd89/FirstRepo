// WAP TO ACCEPT AN ARRAY OF 10 INTEGERS AND DISPLAY THE SUM OF ALL THE ODD NUMBERS

package Arrays;

public class Array_SumOdd {
	
	void Sum_Odd()
	{
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		System.out.println("The Elements are= ");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		// odd number sum
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				sum=sum+a[i];
			}
		}
		System.out.println("THe odd numbers sum is=  "+sum);
	
		// even number sum
		int sumeven=0;
		for (int i=0;i<a.length;i++)
	    {
			if(a[i]%2==0)
					{
					sumeven=sumeven+a[i];
					}
	    	}
		System.out.println("THe even numbers sum is= "+sumeven);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array_SumOdd asum=new Array_SumOdd();
		asum.Sum_Odd();

	}

}