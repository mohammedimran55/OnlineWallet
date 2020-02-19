 package com.cg.onlinewallet.bean;

import java.util.List;

public class WalletAccount {

	private int accountId;
	private double balance;
	
	public WalletAccount(int accountId, double balance) {
		super();
		this.accountId = accountId;
		this.balance = balance;
	}
	public WalletAccount() {
		super();
		
	}
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
}