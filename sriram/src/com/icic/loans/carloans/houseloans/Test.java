package com.icic.loans.carloans.houseloans;

public class Test
{
	public void m1(int i)
	{
		System.out.println("int arg method");
	}
	
	int m1(float f)
	{
		System.out.println("float arg method");
		return 10;
	}
	public  void m1(String s)
	{
		System.out.println("string arg method");
	}
	
public static  void main(String[] args)
{
	Test  t=new Test();
	t.m1(10);
	t.m1(10.5f);
	
	
	//passing object directly OR
	
	 

    t.m1('a');
}
}
