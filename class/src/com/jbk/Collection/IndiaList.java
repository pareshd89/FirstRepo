package com.jbk.Collection;
import java.util.HashMap;
import java.util.Set;
import java.util.ArrayList;

public class IndiaList {

	public static void main(String[] args) {
		
		HashMap<String,ArrayList<India>> hm= new HashMap<String,ArrayList<India>>();
		ArrayList<India> mahastlist= new ArrayList<>();
		India i1=new India(1,"Aurangabad");
		India i2=new India(2,"Akola");
		India i3=new India(3,"Nagpur");
		India i4=new India(4,"Amravati");
		India i5=new India(5,"Pune");
		India i6=new India(6,"Mumbai");
		India i7=new India(7,"Chandrapur");
		India i8=new India(8,"Dhule");
		India i9=new India(9,"Nanded");
		India i10=new India(10,"Nashik");
		India i11=new India(11,"Raigad");
		India i12=new India(12,"Thane");
		
		mahastlist.add(i1);
		mahastlist.add(i2);
		mahastlist.add(i3);
		mahastlist.add(i4);
		mahastlist.add(i5);
		mahastlist.add(i6);
		mahastlist.add(i7);
		mahastlist.add(i8);
		mahastlist.add(i9);
		mahastlist.add(i10);
		mahastlist.add(i11);
		mahastlist.add(i12);
		
		hm.put("Maharashtra", mahastlist);
		Set<String> getst=hm.keySet();
		for(String key:getst)
		{
			System.out.println("State is "+key);
			System.out.println("_______________________");
			System.out.println("Districts are:-");
			
			ArrayList<India> IN=hm.get(key);
			for(India Ind: IN)
			{	
				System.out.println(+Ind.sr+")"+Ind.State);
				//System.out.println("State= "+Ind.State);
			}
			System.out.println("_____________________________________________");
		}
				
	}

}
