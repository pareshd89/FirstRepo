//SORTING OF ARRAY TRADITIONAL WAY

package Arrays;
import java.util.Arrays;

public class Array_Sort {

	public static void main(String[] args) {
		int a[]= {11,2,1,3,65,7};
		int temp;
		
			for(int i=0;i<a.length;i++)
			{
				for (int j=i+1;j<a.length;j++)
				{
					if (a[i]>a[j])
					{
						temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
				}
				//System.out.println(a[i]);
			}
			
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
	}

}
