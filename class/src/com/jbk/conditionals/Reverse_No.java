package com.jbk.conditionals;
import java.util.Scanner;
public class Reverse_No 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int no, digit, rev=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a nunmber: ");
		no=sc.nextInt();			//while loop Initialization
	
			while(no>0)				//Condition
			{
				digit=no%10;                              
				rev=rev*10+digit;
				no=no/10;				//>Increment/Decrement
				
			}
			System.out.print(+rev);
		
	}

}


//otherwise you can also dio
//while(n>0)
//{
// 	digit=no%10;
//	no=no/10;
//	syso("enter no. +digit);
//}