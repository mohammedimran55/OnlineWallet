package com.cg.onlinewallet.dao;

import java.util.HashMap;
import java.util.Map;

import com.cg.exception.AccountException;
import com.cg.onlinewallet.bean.WalletAccount;

public class AccountDaoMapImpl implements AccountDao{

private Map<Integer,WalletAccount> accountMap;
	
	public AccountDaoMapImpl()
	{
		accountMap= new HashMap<Integer,WalletAccount>();
		
	}

	@Override
	public int createWalletAccount(WalletAccount walletAccount) throws AccountException
	{
		if(accountMap.containsKey(walletAccount.getAccountId())) {
		throw new AccountException("Id Exists");
		}
		else {	
			accountMap.put(walletAccount.getAccountId(), walletAccount);  
		}
		return walletAccount.getAccountId();
		
		  
	}

	
	
	
	}
	
	
	
	


