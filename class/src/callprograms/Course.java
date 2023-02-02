package callprograms;

public class Course {
    
	String Str3;
	float fee;
	
	void Coursedetails()
	{
		Str3="Course name is Engineering";
		fee=96000f;
		
	}
void display1()
{
	System.out.println(Str3+" and Course fees is="+fee);
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
college obj=new college();
obj.clgdetails();
obj.display();
Course obj1=new Course();
obj1.Coursedetails();
obj1.display1();
	}

}
