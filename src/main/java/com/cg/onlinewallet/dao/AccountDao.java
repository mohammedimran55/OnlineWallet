package com.cg.onlinewallet.dao;


import com.cg.exception.AccountException;
import com.cg.onlinewallet.bean.WalletAccount;

public interface AccountDao {
	
	public int createWalletAccount(WalletAccount account) throws AccountException;

}
