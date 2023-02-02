package callprograms;
import java.util.Scanner;

public class Even_Odd 
 {
   void even_odd(int a)
   {
	   if(a%2==0)
		   System.out.println("the number is even");
	   else
		   System.out.println("the number is odd");
	   
   }
   
	public static void main(String[] args) {
		 // TODO Auto-generated method stub
		Scanner sr=new Scanner(System.in);
		System.out.println("Enter a number");
		int a=sr.nextInt();
		
		Even_Odd obj=new Even_Odd();
		obj.even_odd(a);
		sr.close();
				
	}

}
