package Placements_Questions;
import java.util.Scanner;

public class StringReverse {

	void strrev(String s)
	{
		StringBuffer s1=new StringBuffer(s);
		System.out.println(s1.reverse().equals(s));
		
		System.out.println("Now the String is ="+s1);
		
		}
				
	
	
	public static void main(String[] args) {
		
		StringReverse obj=new StringReverse();		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=sc.next();
		obj.strrev(s);
		

	}

}
