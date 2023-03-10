package package_ATM;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
	
	private int accountNumber;
	private int pinNumber;
	private double checkingBalance;
	private double savingBalance;
	
	Scanner sc=new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
	
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getPinNumber() {
		return pinNumber;
	}
	public void setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
	}
	public double getCheckingBalance() {
		return checkingBalance;
	}
	public void setCheckingBalance(double checkingBalance) {
		this.checkingBalance = checkingBalance;
	}
	public double getSavingBalance() {
		return savingBalance;
	}
	public void setSavingBalance(double savingBalance) {
		this.savingBalance = savingBalance;
	}
	
	
	
	public double calcCheckingWithdraw(double amount) {
		checkingBalance=(checkingBalance-amount);
		return checkingBalance;
	}
	
	public double calcSavingWithdraw(double amount) {
		savingBalance=(savingBalance-amount);
		return savingBalance;	
	}
	
	public double calcCheckingDeposit(double amount) {
		checkingBalance=(checkingBalance+amount);
		return checkingBalance;
	}
	
	public double calcSavingDeposit(double amount) {
		savingBalance=(savingBalance+amount);
		return savingBalance;	
	}
	
	
	public void getCheckingWithdrawInput() {
		System.out.println("Checking Account Balance: "+moneyFormat.format(checkingBalance));
		System.out.println("Amount you want to withdraw from Checking Account: ");
		double amount=sc.nextDouble();
		
		if ((checkingBalance-amount) >= 0) {
			calcCheckingWithdraw(amount);
			System.out.println("New Checking Account Balance: "+moneyFormat.format(checkingBalance));
		}
		else {
			System.out.println("Balance cannot be Negative.");
		}
	}
	
	public void getSavingWithdrawInput() {
		System.out.println("Saving Account Balance: "+moneyFormat.format(savingBalance));
		System.out.println("Amount you want to withdraw from Saving Account: ");
		double amount=sc.nextDouble();
		
		if ((savingBalance-amount) >= 0) {
			calcSavingWithdraw(amount);
			System.out.println("New saving Account Balance: "+moneyFormat.format(savingBalance));
		}
		else {
			System.out.println("Balance cannot be Negative.");
		}
	}
	
	public void getCheckingDepositInput() {
		System.out.println("Checking Account Balance: "+moneyFormat.format(checkingBalance));
		System.out.println("Amount you want to deposit to Checking Account: ");
		double amount=sc.nextDouble();

	if ((checkingBalance+amount) >= 0) {
		calcCheckingDeposit(amount);
		System.out.println("New Checking Account Balance: "+moneyFormat.format(checkingBalance));
	}
	else {
		System.out.println("Balance cannot be Negative.");
	}
	}
	
	public void getSavingDepositInput() {
		System.out.println("Saving Account Balance: "+moneyFormat.format(savingBalance));
		System.out.println("Amount you want to deposit to Saving Account: ");
		double amount=sc.nextDouble();
		
		if ((savingBalance+amount) >= 0) {
			calcSavingWithdraw(amount);
			System.out.println("New saving Account Balance: "+moneyFormat.format(savingBalance));
		}
		else {
			System.out.println("Balance cannot be Negative.");
		}
	}
	}


