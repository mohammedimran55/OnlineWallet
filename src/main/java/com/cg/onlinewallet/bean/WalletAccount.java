 package com.cg.onlinewallet.bean;

import java.util.List;

public class WalletAccount {

	private int accountId;
	private double balance;
	private String Status;
	private List<WalletTransaction>  list;
	public WalletAccount(int accountId, double balance, String status, List<WalletTransaction> list) {
		super();
		this.accountId = accountId;
		this.balance = balance;
		Status = status;
		this.list = list;
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
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public List<WalletTransaction> getList() {
		return list;
	}
	public void setList(List<WalletTransaction> list) {
		this.list = list;
	}
	
	
	
}
