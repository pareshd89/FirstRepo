package callprograms;
import java.util.Scanner;


public class Employee 
    { 
	  int empid;
	  String empnm;
	  float empsal;
	  
	  void Set_Data()
	  {
		  Scanner sr= new Scanner(System.in);
		  System.out.println("Enter the employee ID:-");
		  empid=sr.nextInt();
		  System.out.println("Enter the employee name");
		  empnm=sr.next();
		  System.out.println("Enter the Employee Salary");
		  empsal=sr.nextFloat();
	  }
	  
	  void Get_Data()
	  {
		  System.out.println("Employee id is "+empid);
		  System.out.println("employee name is "+empnm);
		  System.out.println("employee salary is "+empsal);
	  }
	
	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Employee e1=new Employee();
		Employee e2=new Employee();
		Employee e3=new Employee();
		System.out.println("Enter the Details of First Employee ");
		e1.Set_Data();
		System.out.println("Enter the Details of Second Employee ");
		e2.Set_Data();
		System.out.println("Enter the Details of Third Employee ");
		e3.Set_Data();
		 e1.Get_Data();
		 e2.Get_Data();
		 e3.Get_Data();
		 float tot=e1.empsal+e2.empsal+e3.empsal;
		 System.out.println("Total salary of 3 employees is "+tot);
		 
	}

}
