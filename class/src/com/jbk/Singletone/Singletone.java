package com.jbk.Singletone;

public class Singletone {
	static Singletone s1=new Singletone();
	private Singletone()
	{
		
	}
	
	static Singletone getInstance()
	{
		return s1;
	}

}
