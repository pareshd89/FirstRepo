package callprograms;
import java.util.Scanner;

public class Scanner_subt
{

	public static void main(String[] args) 
	 {
		// TODO Auto-generated method stub
			Scanner scan=new Scanner(System.in);
			System.out.println("enter first numbers");
			 int num=scan.nextInt();
			System.out.println("enetr second number");
			 int num2=scan.nextInt();
			scan.close();
			 int z=num-num2;
			System.out.println("subtraction is "+z);

	 }

}
