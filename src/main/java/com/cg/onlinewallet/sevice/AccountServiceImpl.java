package com.cg.onlinewallet.sevice;

import java.util.Random;

import com.cg.exception.AccountException;
import com.cg.onlinewallet.bean.WalletAccount;
import com.cg.onlinewallet.dao.AccountDao;
import com.cg.onlinewallet.dao.AccountDaoMapImpl;

public class AccountServiceImpl implements AccountService
{
	
	private AccountDao accountDao;
	
	public AccountServiceImpl() 
	{
		accountDao = new AccountDaoMapImpl();
		
	}

	@Override
	public int createWalletAccount(WalletAccount account) throws AccountException {
		
		
		Random random = new Random();
		int accountId = random.nextInt(100)+1000;
		account.setAccountId(accountId);
		
		
		
		return accountDao.createWalletAccount(account);
	}
	public static boolean isValid(String uname) {
	
		boolean flag = false;
		if(uname.length()!=0) {
			flag = true;
	
		}
		return flag;
		
	}
	

}
