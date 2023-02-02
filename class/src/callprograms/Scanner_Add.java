package callprograms;
import java.util.Scanner;


public class Scanner_Add {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the First number:");
         int no=sc.nextInt();
         System.out.println("Enter the second number:");
         int no1=sc.nextInt();
         sc.close();
         int c=no+no1;
         System.out.println("Addition is = "+c);
         
 
	}

}
