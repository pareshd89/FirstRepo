package com.jbk.conditionals;
import java.util.Scanner;


public class Digit_In_Word {
	
	void Digit_Word(int no)
	{
		switch (no)
		{
		case 0:
			{
				System.out.println("Zero");
				break;
			}
		   case 1:
			{
			System.out.println("ONE");
			break;
			}
		   case 2:
		   {
			System.out.println("two");
			break;
		   }
			case 3:
			{
			System.out.println("Three");
			break;
			}
			case 4:
			{
			System.out.println("Four");
			break;
			}
			case 5:
			{
			System.out.println("Five");
			break;
			}
			case 6:
			{
			System.out.println("Six");
			break;
			}
			case 7:
			{
			System.out.println("Seven");
			break;
			}
				case 8:
				{
					System.out.println("Eight");
					break;
					}
			case 9:
				{
					System.out.println("Nine");
					break;
				}
			default:
			{
				System.out.println("Entry is INVALID");
			
			}
		
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Digit From 0 to 9");
		int no=sc.nextInt();
		Digit_In_Word dg=new Digit_In_Word();
		dg.Digit_Word(no);
				

	}

}
