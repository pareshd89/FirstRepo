package callprograms;

public class MethodDemo 
{
	 float no, no1,no3;
	 
	  void add()
	  {
		   no=10;
		   no1=20;
		   no3=40;
		   System.out.println("sum=" +((no+no1+no3)/3));
	  }
	  
	  void subt()
	  {
		  no=10;
		  System.out.println(no);
		  
	  }
	  public static void main(String[]args)
	  {
		  MethodDemo obj= new MethodDemo();
		  obj.add();
		  obj.subt();
		  
	  }
	  
	  

}
