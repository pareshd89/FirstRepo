package Arrays;
import java.util.Scanner;


public class Array_Demo4 {
	void Display()
	{
		Scanner sc=new Scanner(System .in);
		System.out.println("Enter the Size for an Array");
		int sz=sc.nextInt();
		int a[]=new int[sz];
		
		//ACCEPT THE ELEMENTS
		System.out.println("Enter the Elements");
			for(int i=0;i<sz;i++)
			{
				a[i]=sc.nextInt();
			}
		System.out.println("Array Elemensts are:- ");	
			for(int i=0;i<sz;i++)
			{
				System.out.println(a[i]);
			}
			
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array_Demo4 arr4=new Array_Demo4();
		arr4.Display();
		
	}

}
