package com.jbk.conditionals;
import java.util.Scanner;


public class Nested_if 
 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sr=new Scanner(System.in);
    System.out.println("Enter the 12th score");
    int score=sr.nextInt();
    
     if(score>=90)
     {
    	 System.out.println("Enter Jee Score ");
    	 int jeescore=sr.nextInt();
    	 if(jeescore>=90)
    	 {
    		 System.out.println("you are Eligible for Admission");
    		 
    	 }
    	 else
    	 {
    		 System.out.println("Wait for Second Round");
    		 
    	 }
     }
     else
    	 System.out.println("Not Eligible");
	}

}
