package com.icic.loans.personalloans;

public interface Rbi {
	public void withdrawl();
	public void deposit();
	public static void main(String[] args) {
		Rbi i;
		i=new Kotak();
		i.deposit();
		i.withdrawl();
		
		
		
	}

}
