package package_ATM;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class OptionMenu extends Account {
	Scanner menuInput=new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
	
	HashMap<Integer,Integer> data=new HashMap<Integer,Integer>();

	public void getLogin() throws IOException {
		// TODO Auto-generated method stub
		int x=1;
		
		do {
			try {
				data.put(994701,2255); //(AccountNumber,PinNumber)
				data.put(807586,3214);
				System.out.println("Welcome to the ATM Project!");
				System.out.println("Enter your Account Number: ");
				setAccountNumber(menuInput.nextInt());
				
				System.out.println("Enter your PIN Number: ");
				setPinNumber(menuInput.nextInt());
			}
			catch (Exception e) {
				System.out.println("Invalid Character(s). Only Numbers.");
				x=2;
			}
			
			/* 
			 * for(Map.Entry<Integer , Integer> it:data.entrySet()) {
			 * if(it.getKey()==getAccountNumber() && it.getValue()==getPinNumber) {
			 * getAccountType();
			 * }
			 * }
			 * 
			 */
			
			int an=getAccountNumber();
			int pn=getPinNumber();
			
			if (data.containsKey(an) && data.get(an) == pn) {
				getAccountType();
			}
			else {
				System.out.println("Wrong Customer Number or Pin Number");
			}
		}
		while (x==1);
		}

	private void getAccountType() {
		// TODO Auto-generated method stub
		System.out.println("Select the Account Type you want to access:");
		System.out.println("Type 1-Checking Account");
		System.out.println("Type 2-Saving Account");
		System.out.println("Type 3-Exit");
		
		int selection=menuInput.nextInt();
		
		switch(selection) {
		case 1:
			getChecking();
			break;
			
		case 2:
			getSaving();
			break;
			
		case 3:
			System.out.println("Thank you for using this ATM, Have a Nice Day.");
			break;
			
		default:
			System.out.println("Invalid Input");
		}
		
		
		
	}

	private void getSaving() {
		// TODO Auto-generated method stub
		
	}

	private void getChecking() {
		// TODO Auto-generated method stub
		
	}
		
	}


