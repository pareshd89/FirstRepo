//WAP to check wheather a number is positive/negative or Zero.
package callprograms;
import java.util.Scanner;


public class ifdemo 
   {
	
	void check (int no)
	{
		
		if (no>0)
	 
			System.out.println("the no is positive");
		
		else if(no<0)
			System.out.println("the no is negative");
		else
			System.out.println("the number is zero");
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

			Scanner sr=new Scanner(System.in);
			System.out.println("Enter a Number");
			int no=sr.nextInt();
			ifdemo obj=new ifdemo();
			obj.check(no);

	}

}
