package com.jbk.Collection;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeMain {
	
	public static void main(String[] args) {

		ArrayList<Employee> al=new ArrayList<>();
		
		Employee e1=new Employee("Paresh",101,8989);
		Employee e2=new Employee("Tanmay",102,5656);
		Employee e3=new Employee("Akshay",103,6494);
		
		al.add(e1);
		al.add(e2);
		al.add(e3);
		
		for(Employee x:al)
		{
			System.out.println("Employee name is= "+x.getEmpnm());
			System.out.println("Emp id is= "+x.getEmpid());
			System.out.println("Employee Sal is= "+x.getEmpsal());
			System.out.println();
		}
		al.remove(2);
		System.out.println("After Removing Record");
		System.out.println(al);
		
		Employee e4=new Employee("Pushpak",104,8972);
		al.add(e4);
		System.out.println("After adding Record");
		System.out.println(al);
	}

}
