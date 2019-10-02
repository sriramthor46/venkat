package com.icic.loans.carloans.houseloans;

public class Employee {
	int empno;
	String empname;
	Employee(int no, String name){
		
		this.empno=no;
		this.empname=name;
		
	}
	void info()
	{
		System.out.println("no  "+ empno  +  "  name  "  +  empname);
	}

	public static void main(String[] args) {
		
		Employee obj=new Employee(102,"krishna");
		Employee obj2=new Employee(107,"kittu");
		obj.info();
		obj2.info();

	}

}
