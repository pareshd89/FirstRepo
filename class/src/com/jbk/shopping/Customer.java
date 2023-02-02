package com.jbk.shopping;

public class Customer implements Igst,Irate
{

public void total(int qty)
{
	
System.out.println("qty is ="+qty);
System.out.println("p cost is ="+pcost);
	
}
void disp(int qty,int pcost,double gstrt)
{
	System.out.println(+(qty*pcost)+gstrt);
}


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer cs=new Customer();
		cs.total(2);
		cs.disp(2, 599, 2.5);
		
	}

}
