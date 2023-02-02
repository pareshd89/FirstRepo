package com.jbk.conditionals;
import java.util.Scanner;

public class Or_Demo 
  {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sr=new Scanner(System.in);
		System.out.println("Are you a member Write 'yes' or 'no'");
		String s=sr.next();
		System.out.println("Emnter the bonus point");
		int bonuspt=sr.nextInt();
		if(s.equals("yes") || bonuspt>90)
			System.out.println("You are Eligible for Bonus");
		else
			System.out.println("you are not Eligible");
		
	}

}
