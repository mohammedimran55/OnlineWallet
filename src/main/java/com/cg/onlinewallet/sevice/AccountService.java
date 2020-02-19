package com.cg.onlinewallet.sevice;

import com.cg.exception.AccountException;
import com.cg.onlinewallet.bean.WalletAccount;

public interface AccountService {
	
	public int createWalletAccount(WalletAccount account) throws AccountException;

}
