package com.jbk.Collection;
import java.util.HashSet;
// Output will be random but will be displayed same as before inless we add any elements

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs=new HashSet<>();
		hs.add("B");
		hs.add("C");
		hs.add("Java");
		hs.add("M");
		hs.add("MKL");
	//	hs.clear();
		System.out.println("First HashSet= "+hs);
	}

}
