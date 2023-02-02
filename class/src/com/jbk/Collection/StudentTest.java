package com.jbk.Collection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;


public class StudentTest {

	public static void main(String[] args) {
		HashMap<String,ArrayList<Student>> hm=new HashMap<String,ArrayList<Student>>();
		
		ArrayList<Student> cselist=new ArrayList<>();
		
		Student s1=new Student(1,"Paresh",27);
		Student s2=new Student(2,"Mona",29);
		Student s3=new Student(3,"Sunny",22);
		cselist.add(s1);
		cselist.add(s2);
		cselist.add(s3);
		
		hm.put("CSE",cselist);
		
		ArrayList<Student> mechlist=new ArrayList<>();
		
		Student m1=new Student(1,"Rutuja",27);
		Student m2=new Student(2,"Sataj",29);
		Student m3=new Student(3,"Bhavesh",22);
		mechlist.add(m1);
		mechlist.add(m2);
		mechlist.add(m3);
		
		hm.put("MECH", mechlist);
			
		Set<String> keys=hm.keySet();
				for(String key:keys)
				{
					
					System.out.println("Department is  "+key);
					
					ArrayList<Student> al=hm.get(key);
					
					for (Student stud: al)
					{
						System.out.println("ID is= "+stud.id);
						System.out.println("Name is= "+stud.name);
						System.out.println("Age is= "+stud.age);
						System.out.println("-----------");
					}
					System.out.println("______________________________");
				}
		}

}
