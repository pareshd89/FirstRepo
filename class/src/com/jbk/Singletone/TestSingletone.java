package com.jbk.Singletone;

public class TestSingletone {

	public static void main(String[] args) {
		Object o=Singletone.getInstance();
		System.out.println(o);
	//Object o1=Singletone.getInstance();
//	System.out.println(o1);
		
	}

}


//onlly one ref is crwated...even if we create manty refrnces then also the address is same
