package com.cg.onlinewallet.pl;

import java.util.Scanner;

import com.cg.exception.AccountException;
import com.cg.onlinewallet.bean.WalletAccount;
import com.cg.onlinewallet.sevice.AccountService;
import com.cg.onlinewallet.sevice.AccountServiceImpl;

public class Client {
	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		AccountService accountService=new AccountServiceImpl();
		int choice=0;
		WalletAccount walletAccount=null;
		
		while(choice!=1)
		{
			System.out.println("create wallet account ");
			
	        choice = scanner.nextInt();
	        
	        switch(choice)
	        {
	        case 1:
	        	
	        	System.out.println("enter balance");
	        	double balance = scanner.nextDouble();
	        	
	        	
	        	
	        	walletAccount = new WalletAccount();
	        	
	        	walletAccount.setBalance(balance);
	        	
	        	try {
	        		int id = accountService.createWalletAccount(walletAccount);
	        		System.out.println("Account id is "+id);
	        		
	        	}
	        	catch(AccountException  e)
	        	{
	        		System.err.println(e.getMessage());
	        	}
	        	break;
	        	
		}
}
}
}