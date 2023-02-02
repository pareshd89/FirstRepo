package com.jbk.conditionals;
import java.util.Scanner;

public class PerandGrade 
 {
	void grade()
	{
		Scanner sr=new Scanner(System.in);
		System.out.println("Enter the marks fore Three Subjects");
		int mks1=sr.nextInt();
		int mks2=sr.nextInt();
		int mks3=sr.nextInt();
		float per=(mks1+mks2+mks3)/3;
		System.out.println("percentage is "+per);
		
		
		  		if (per>=75 && per<=100)
		  			System.out.println("DISTINCTION");
		  		else if(per>=60 && per<=75)
		  			System.out.println("FIRST CLASS");
		  		else if(per>=40 && per<=60)
		  			System.out.println("THIRD CLASS");
		  		else
		  			System.out.println("F A I L");
		  		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PerandGrade obj=new PerandGrade();
		obj.grade();
	}

}
