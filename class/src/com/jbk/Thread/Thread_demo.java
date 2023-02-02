package com.jbk.Thread;

public class Thread_demo extends Thread  {
	
	public void run ()
	{
		System.out.println("Thread Executing");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread_demo d=new Thread_demo();
		d.run();
		System.out.println(d);

	}

}
