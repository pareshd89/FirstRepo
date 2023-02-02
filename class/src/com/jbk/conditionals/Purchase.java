package com.jbk.conditionals;
import java.util.Scanner;

public class Purchase 
 { 
	void bill()
	{
		
			
		int c;
		int p1cost=100;
		int	p2cost=200;
		Scanner sc=new Scanner(System.in);
		do {
		System.out.println("Enter a Product id 1 or 2");
		int id=sc.nextInt();
		
		
		switch(id)
		{
		case 1:
		 {   System.out.println("Enter product Quantity");
			 int qty=sc.nextInt();
			 int amt=p1cost*qty;
			 System.out.println("Amount is= "+amt);
			 break;
		 }
		case 2:
		 {
			 System.out.println("Enter product Quantity");
			 int qty=sc.nextInt();
			 int amt=p2cost*qty;
			 System.out.println("Amount is= "+amt);
			 break;
		 }
		 default:
			 System.out.println("Invalid No");
		}	    
			   
		        System.out.println("Do you want to Continue press 1");
				c=sc.nextInt();
				} while(c==1);
	
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Purchase p=new Purchase();
		p.bill();
	}

}
