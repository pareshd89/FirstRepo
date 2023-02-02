package Constructor;

public class Constructor_Demo {
	
	int no,no1;
	
	
	Constructor_Demo()		//Constructor is created
	{
		no=100;
		no1=200;
	}
	
	void disp()
	{
		System.out.println(no);
		System.out.println(no1);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor_Demo obj=new Constructor_Demo();//no need to ccall the const mehod as it gets implicitly called
		
		obj.disp();
	}

}
