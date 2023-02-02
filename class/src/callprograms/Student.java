package callprograms;
import java.util.Scanner;

public class Student 
  {
    int studid;
    String studnm;
    String studcrs;
    
    void Set_Data()
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter Student ID:-");
    	studid=sc.nextInt();
    	System.out.println("Enter the Name of Student:-");
    	studnm=sc.next();
    	System.out.println("Enter the course name of Student:-");
    	studcrs=sc.next();
    	
    	
    }
    
    void Get_Data()
    {
    	System.out.println("Student ID is:-"+studid);
        System.out.println("Student name is:-"+studnm);
        System.out.println("Student is Enrolled in :-"+studcrs);
        
    }
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
			Student s1=new Student();
			Student s2=new Student();
			System.out.println("Enter the Details of first person");
			 s1.Set_Data();
			System.out.println("Enter the Details of second person");
			 s2.Set_Data();
			  s1.Get_Data();
			  s2.Get_Data();
			
			
	}

}
