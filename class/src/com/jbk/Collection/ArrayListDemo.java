package com.jbk.Collection;
import java.util.ArrayList;
public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] str= {"Java","PHP","Testing"};
		ArrayList<String>al=new ArrayList<String>();
		
			for(String n:str)
			{
				al.add(n);
			}
		System.out.println(al);
		
		

	}

}
