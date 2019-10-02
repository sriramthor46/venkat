package com.icic.loans.carloans.houseloans;

public class SecondClass { 
	
	
	int a=10, b=20,c;
	public void add()
	{
		c=a+b;
		System.out.println("addition of a and b is: "+c);
	}
	
	public void sub()
	{
		c=a-b;
		System.out.println("addition of a and b is:"+c);
	}
	public static void main(String[] args) {
		  
		
		SecondClass obj=new SecondClass();
		obj.add();
		obj.sub();
		
	}

}
