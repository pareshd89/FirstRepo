package Placements_Questions;

public class Static_Demo {
	
	int n=10;
	static int n1=20;		//static variable
	final static int n3=90;
	static
	{
		System.out.println("Static Block");
	}
		
		static void sq()
		{
			System.out.println(n1*n1);
		}
		
			void cube()
			{
				int n2=20;
				System.out.println(n2*n2*n2);
			}
	public static void main(String[] args) {
	System.out.println("Main");
	Static_Demo sd=new Static_Demo();
	System.out.println(sd.n);
	System.out.println(Static_Demo.n1);
	Static_Demo.sq();
	System.out.println(Static_Demo.n3);
	sd.cube();

	}

}
