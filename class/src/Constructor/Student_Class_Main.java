package Constructor;

import java.util.ArrayList;

public class Student_Class_Main {

	public static void main(String[] args) {
		ArrayList<Student_Class> al=new ArrayList<>();
		Student_Class s1=new Student_Class(1,"Paresh",26);
		Student_Class s2=new Student_Class(2,"akshay",27);
		Student_Class s3=new Student_Class(3,"mona",24);
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		for(Student_Class s: al)
		{
			System.out.println(s.id);
			System.out.println(s.nm);
			System.out.println(s.age);
		}

	}

}
