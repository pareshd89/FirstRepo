package com.jbk.conditionals;
import java.util.Scanner;
public class SumofDigits 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int no, digit, sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a nunmber: ");
		no=sc.nextInt();			//while loop Initialization
	
			while(no>0)				//Condition
			{
				digit=no%10;
				sum=sum+digit;
				no=no/10;				//>Increment/Decrement
				
			}
			System.out.print("The sum of all digit is=  "+sum);
		
	}

}
