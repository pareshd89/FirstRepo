package com.jbk.Thread;

class c1 extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("I = "+i);
		}
	}
}

class c2 extends Thread
{
	public void run()
	{
		for(int j=0;j<10;j++)
		{
			System.out.println("J = "+j);
		}
	}
}

class c3 extends Thread
{
	public void run()
	{
		for(int k=0;k<10;k++)
		{
			System.out.println("k = "+k);
		}
	}
}


class Thread_Seqn {
	
	public static void main(String[] args)
	{
		c1 obj1=new c1();
		c2 obj2=new c2();
		c3 obj3=new c3();
	//	obj2.setPriority(Thread.MAX_PRIORITY);
		obj1.start();
		obj2.start();
		obj3.start();
		
		
	}
	
	
}

