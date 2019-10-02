package com.icic.loans.carloans.houseloans;

public class Calculations {
	
	int a, b,c;
	public Calculations(int a,int b)
	{
		super();
		this.a=a;
		this.b=b;
		
	}
public void add()

{
	c=a+b;
	System.out.println("addition of two numbers" +c);
	
}
	public static void main(String[] args) {
		
		
		Calculations c=new Calculations(20,30);
		c.add();

	}

}
