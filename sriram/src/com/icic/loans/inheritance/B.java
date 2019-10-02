package com.icic.loans.inheritance;

public class B extends A  
{
	
	
public  void m2()
{
	System.out.println("m2 method ");
}
	public static void main(String[] args) {
		
		A a=new A();
		a.m1();
		B b=new B();
		b.m2();
		b.m1();
		// TODO Auto-generated method stub

	}

}
