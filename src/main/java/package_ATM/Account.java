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
		System.out.println("Checking Account Balance");
	}
	
	

}
