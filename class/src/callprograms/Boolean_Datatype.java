package callprograms;

public class Boolean_Datatype
{
	boolean a=true;
	
	void check()
	
	{
		if(a==true)
		{
			a=false;
			System.out.println("The Boolean value is="+a);
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boolean_Datatype obj=new Boolean_Datatype();
		obj.check();
		System.out.println(obj.a);
		
	}

}
