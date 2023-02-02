package com.jbk.Collection;



public class Employee {
	
	private int empid;
	protected String empnm;
	private int empsal;
	
	Employee(String empnm,int empid,int empsal)
	{
		this.empid=empid;
		this.empnm=empnm;
		this.empsal=empsal;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpnm() {
		return empnm;
	}

	public void setEmpnm(String empnm) {
		this.empnm = empnm;
	}

	public int getEmpsal() {
		return empsal;
	}

	public void setEmpsal(int empsal) {
		this.empsal = empsal;
	}
		public String toString()
	{
		return empnm+"  " +empid+ "  " +empsal;
	}
	}


