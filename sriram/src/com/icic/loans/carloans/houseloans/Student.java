package com.icic.loans.carloans.houseloans;

public class Student {
	int eno;
	String ename;
	String addrs;
	public  Student()
	{
		
		System.out.println("constructors ");
		
	}
	public Student(String ename )
	{
		this();
		this.ename=ename;
	
	System.out.println(ename);
		
	}
	 public Student(int eno,String ename,String addrs)
	 { 
		 this();
		 this.ename=ename;
		 this.eno=eno;
		 this.addrs=addrs;

		System.out.println(ename);
		System.out.println(eno);
		System.out.println(addrs);
		 
		 
	 }

	public static void main(String[] args) {
		
		
		Student s1=new Student();
		Student s2=new Student("krishna");
		Student s3=new Student(20,"venakt ","hyd");
		
		
		
		
		
		
		

	}

}
