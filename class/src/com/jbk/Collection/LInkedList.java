package com.jbk.Collection;
import java.util.*;

public class LInkedList {

	public static void main(String[] args) {
		 	 
		LinkedList<String> arr=new LinkedList<>();
		arr.add("Pune");
		arr.add("Mumbai");
		arr.add("Aurangabad");
		arr.add("Nagpur");
		//arr.remove(0);
		arr.add(0, "Nashik");
		arr.remove(2);
		
		
		Iterator <String> itr=arr.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
