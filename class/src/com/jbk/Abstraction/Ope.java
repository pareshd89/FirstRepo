package com.jbk.Abstraction;

public class Ope implements Math_Ope,String_Ope {
	
		public void power(int a,int b)
		{
			System.out.println(Math.pow(a, b));
			System.out.println(no);
		}
		
		public void concat(String s,String s1)
		{
			System.out.println(s+s1);
		}

}
