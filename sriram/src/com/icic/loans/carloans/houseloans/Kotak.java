package com.icic.loans.carloans.houseloans;

public class Kotak implements Rbi {
	public void withdrawl()
	{
		System.out.println("withdrawl money");
	}

	@Override
	public void deposit() {
		System.out.println("depositing money");
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		Kotak obj=new Kotak();
		obj.withdrawl();
		obj.deposit();
		
		
	}

}
