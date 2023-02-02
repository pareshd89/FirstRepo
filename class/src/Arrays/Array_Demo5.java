//ACCEPT THE MARKS OF 5 STUDENTS AND DISPLAY ITS AVERAGE OR ACCEPT THE MARKS OF A STUDENT AND DISPLAY ITS AVG.
package Arrays;
import java.util.Scanner;

public class Array_Demo5 {
	void average() {
		Scanner sc=new Scanner(System.in);
		int marks[]=new int[5];
		int sum=0;
		
		//ACCEPT THE ELEMENTS
		System.out.println("Enter the 5 Studnts marks");
			for(int i=0;i<5;i++)
			{
				marks[i]=sc.nextInt();
				sum=sum+marks[i];
			}
			double avg=sum/5;
			System.out.println("Average is:- "+avg);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array_Demo5 arr5= new Array_Demo5();
		arr5.average();
	}

}
