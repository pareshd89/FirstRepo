package Placements_Questions;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub.
		int no=127,originalno,remainder,sum=0;
		originalno=no;
		while(originalno>0)
		{
			remainder=originalno%10;
			sum=sum+(int)Math.pow(remainder, 3);    //type casting is done here (int)
			originalno=originalno/10;
			
		}
			
		if(sum==no)
		{
			System.out.println("The No is Armstrong");
		}
		else
			System.out.println("The no is Not Armstrong");
	}

}
