package com.example.Inheritance.app.app1.app2.app3.app4.app5.app6.app7.boot;

import com.example.Inheritance.app.app1.app2.app3.Bank;
import com.example.Inheritance.app.app1.app2.app3.DemandDeposit;
import com.example.Inheritance.app.app1.app2.app3.FixedDeposit;
import com.example.Inheritance.app.app1.app2.app3.JointAccount;
import com.example.Inheritance.app.app1.app2.app3.RecurringDeposit;
import com.example.Inheritance.app.app1.app2.app3.SavingsAccount;

public class BankMain {
	
	public static void main(String[] args) {
		
		Bank bank=new Bank();
		bank.bankMethod();
		System.out.println("--------------------");
		
		SavingsAccount account=new SavingsAccount();
		Bank sacc=new SavingsAccount();
		account.bankMethod();
		account.savingsAccMethod();
		System.out.println("--------------------");
		
		FixedDeposit deposit=new FixedDeposit();
		Bank deposit1=new FixedDeposit();
		deposit.fixedAccMethod();
		deposit.bankMethod();
		System.out.println("--------------------");
		
		JointAccount account2=new JointAccount();
		Bank jacc=new JointAccount();
		account2.bankMethod();
		account2.jointAccMethod();
		System.out.println("--------------------");
		
		RecurringDeposit deposit2=new RecurringDeposit();
		Bank rbank=new RecurringDeposit();
		deposit2.bankMethod();
		deposit2.recurAccMethod();
		System.out.println("--------------------");
		
		DemandDeposit demandDeposit=new DemandDeposit();
		Bank demandDeposit1=new DemandDeposit();
		demandDeposit.bankMethod();
		demandDeposit.demandAccMethod();
		
	
	}

}
