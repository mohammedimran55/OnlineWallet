package com.cg.onlinewallet.pl;

import java.util.List;
import java.util.Scanner;

import com.cg.exception.AccountException;
import com.cg.onlinewallet.bean.WalletAccount;
import com.cg.onlinewallet.bean.WalletTransaction;
import com.cg.onlinewallet.sevice.AccountService;
import com.cg.onlinewallet.sevice.AccountServiceImpl;

public class Client {
	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		AccountService accountService=new AccountServiceImpl();
		
		WalletAccount walletAccount = new WalletAccount();
		while(true)
		{
			System.out.println("create wallet account ");
			
		int choice = scanner.nextInt();
		
		switch(choice)
		{
		
		case  1:
			System.out.println("enter user name");
			 scanner.nextLine();
				
			String str1 = scanner.nextLine();
			
			System.out.println("enter balance");
			
			double balance = scanner.nextDouble();
			
			walletAccount = new WalletAccount();
			walletAccount.setBalance(balance);
			
			try {
				int id = accountService.createWalletAccount(walletAccount);
				System.out.println("Account id is "+ id);
				
			}catch(AccountException e)
			{
				System.out.println(e.getMessage());
				
			}
			break;
		}
}
}
}