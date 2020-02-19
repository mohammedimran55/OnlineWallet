package com.cg.onlinewallet.dao;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import com.cg.exception.AccountException;
import com.cg.onlinewallet.bean.WalletAccount;
import com.cg.onlinewallet.bean.WalletTransaction;

public class AccountDaoMapImpl implements AccountDao{

private Map<Integer,WalletAccount> accountMap;
	
	public AccountDaoMapImpl()
	{
		accountMap= new HashMap<Integer,WalletAccount>();
		
	}

	@Override
	public int createWalletAccount(WalletAccount account) throws AccountException {
		WalletAccount walletAccount = null;
		
		if(accountMap.containsKey(walletAccount.getAccountId())) {
			
			throw new AccountException(" ID Exists");
		}
		else
			accountMap.put(walletAccount.getAccountId(), walletAccount);
		
		
		return walletAccount.getAccountId();
		
		
		
	}
	
	
	
	}
	
	
	
	


