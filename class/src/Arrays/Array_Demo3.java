//TO ACCEPT AND DISPPLAY ARRAY ELEMENTS
package Arrays;
import java.util.Scanner;
//Accept and display array elements

public class Array_Demo3 {
	
	void display()
	{
		int a[]=new int[5];
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter 5 Elements");
			for(int i=0;i<5;i++)
			{
				a[i]=sc.nextInt();
					
			}
System.out.println("Array Elements= ");
			
			for(int i=0;i<5;i++)
			{
				System.out.println(a[i]);
			}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array_Demo3 arr3=new Array_Demo3();
		arr3.display();

	}

}
