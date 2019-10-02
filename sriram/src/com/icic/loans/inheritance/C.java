package com.icic.loans.inheritance;

public class C extends B
{
	public void m3()
	{
		System.out.println("m3 method");
	}
	

	public static void main(String[] args) {
		A a=new A();
		a.m1();
		B b=new B();
		b.m2();
		
		
		C c=new C();
		c.m3();
		c.m1();
		c.m2();
		

	}

}
