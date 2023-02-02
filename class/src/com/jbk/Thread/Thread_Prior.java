package com.jbk.Thread;

public class Thread_Prior extends Thread{
	
public void run()
	{
	System.out.println("Thread Excuting");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread_Prior tp=new Thread_Prior();
		tp.start();
		tp.setName("Paresh");
		tp.setPriority(Thread.MIN_PRIORITY);
		System.out.println(tp);
		System.out.println(tp.getPriority());
		System.out.println(tp.getName());
		System.out.println(tp.getId());
	}

}
