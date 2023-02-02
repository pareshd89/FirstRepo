package com.jbk.Thread;

public class Multthreading {

	public static void main(String[] args) {
	
		int n=8;
		for(int i=0;i<n;i++)
		{
			MultiThreadingDemo obj=new MultiThreadingDemo();
			obj.start();
			obj.setName("Paresh");
			obj.getPriority();
		//	System.out.println(obj.getName());
			}
	
	}

}
