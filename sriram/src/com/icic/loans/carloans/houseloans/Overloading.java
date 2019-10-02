package com.icic.loans.carloans.houseloans;

public class Overloading {

	
	public  int m1 (int i, float f)
	{
		System.out.println("iam oveloading now");
		return 10;
	}
	
	
	public void m1(float i, float f) 
	{
		System.out.println( "not over loading");
	}
		
	
	
	public static void main(String[] args) {
		
		Overloading o  = new Overloading();
		
		o.m1( 10, 20.54f);
		o.m1(20.4f,22.5f);
	

}
}