//Program Name: CheckingAccount
//Author: Joshua Decker
//Class: CSC110
//Date Written: 4/17/2022
//Brief Description: Derived class of BankAccount that has additional functionality
package ch12;

import java.text.NumberFormat;

class CheckingAccount extends BankAccount {

	private double transactionFee;
	
	public CheckingAccount() {
		super();
		transactionFee = 1.00;
	}

	public CheckingAccount(int acctNo, double initBalance, String owner,double transactionFee) {
		super(acctNo, initBalance, owner);
		this.transactionFee = transactionFee;
	}

	public double getTransactionFee() {
		return transactionFee;
	}

	public void setTransactionFee(double transactionFee) {
		this.transactionFee = transactionFee;
	}

	@Override
	public void deposit(double amount) {
		super.deposit(amount - transactionFee);
	}

	@Override
	public void withdraw(double amount) {
		super.withdraw(amount - transactionFee);
	}

	@Override
	public String toString() {
		NumberFormat fmt = NumberFormat.getCurrencyInstance();	
		return (super.toString() + " transaction fee = " + fmt.format(transactionFee));
	}

	
}
