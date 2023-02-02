package com.jbk.conditionals;
import java.util.Scanner;
public class AndorDemo 
 {
	void Grade(int per)
	
	{
		if(per>=75 && per<=100)
			System.out.println("DISTINCTION");
		else if(per>=60 && per<=75)
			System.out.println("First class");
		else if(per>=40 && per<=60)
			System.out.println("Second Class");
		else
			System.out.println("F A I L");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AndorDemo obj=new AndorDemo();
		Scanner sr=new Scanner(System.in);
		System.out.println("Enter The Percentage");
		int per=sr.nextInt();
		obj.Grade(per);
	}

}
