package Placements_Questions;

import java.util.Scanner;

public class Reverse_No {

	public static void main(String[] args) {

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
