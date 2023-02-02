//MEnu Driven program to acceptb the inout from the user and display the output


package com.jbk.conditionals;
import java.util.Scanner;

public class Menu_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter a choice number  1/2/3/4");
		System.out.println("1. table of a given number");
		System.out.println("2. factorial of a number");
		System.out.println("3.check if the number is even or odd");
		System.out.println("4.Exit ");
		
		
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		
		if(choice==1)
		  {
			System.out.println("Enter a number");
			int no=sc.nextInt();
			Table obj=new Table();
			obj.table_no(no);
		  }
		else if (choice==2)
		  {
			System.out.println("Enter a number");
			int no=sc.nextInt();
			Factorial obj=new Factorial();
			System.out.println("factorial is : "+obj.fact(no));
		  }
		else if (choice==3)
		  {
			System.out.println("Enter a number");
			int no=sc.nextInt();
			Odd_Even obj=new Odd_Even();
			obj.evenodd(no);
		  }
		else if(choice==4)
		  {
			System.exit(0);
		  }  
		else 
			System.out.println("invalid No");
	}

}
