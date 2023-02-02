package com.jbk.Thread;

public class MultiThreadingDemo extends Thread {
	
	public void run()
	{
		try
		{
			System.out.println("Thread "+Thread.currentThread().getId()+" is Running ");
			
		}
		catch(Exception e)
		{
			System.out.println("Exception is Caught");
		}
	}
	
}
