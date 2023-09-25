
package question5;

import java.util.Scanner;

 class Account_Holder {
	private int AccountNumber;
	private String AccountHolderName;
	private double AccountBalance;

	public Account_Holder() {   //constructor	
	}

	
public Account_Holder(int AccountNumber, String AccountHolderName, double AccountBalance ) {   //parameterised constructor
		this.AccountNumber=AccountNumber;
		this.AccountHolderName=AccountHolderName;
		this.AccountBalance=AccountBalance;	
	}
	
	public int getAccountNumber() {
		return AccountNumber;
	}
	public void setAccountNumber(int AccountNumber) {
		this.AccountNumber=AccountNumber;
	}
	
	public String getAccountHolderName() {
		return AccountHolderName;
	}	
	public void setAccountHolderName(String AccountHolderName) {
		this.AccountHolderName=AccountHolderName;
	}
	
	public double getAccountBalance() {
		return AccountBalance;
	}	
	public void setAccountBalance(int AccountBalance) {
		this.AccountBalance=AccountBalance;
	}
	
	public void deposite(double amount) {
		AccountBalance=AccountBalance+amount;
	}
	
	public void withdraw(double amount) {
		AccountBalance=AccountBalance-amount;
	}
	
	public void show() {
		System.out.println(AccountNumber+ " " +	 AccountHolderName+ " "+ AccountBalance);
	}
	
}
public class AccountHolder{	
	
	public static void main(String[] args) {
		int choice, cnt=0, acno;
		Account_Holder []arr=new Account_Holder[10];
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.println("1. Add record for account holder");
			System.out.println("2. Display details of all account holders");
			System.out.println( "3. Deposite an amount into perticular account");
			System.out.println( "4. Withdraw an amount from perticular account");
			System.out.println( "5. Exit");
			choice=sc.nextInt();
			switch(choice) {
			case 1: 
				System.out.println("Enter account number, name and balance:");
				arr[cnt++]=new Account_Holder(sc.nextInt(),sc.next(),sc.nextDouble());
				break;
				
			case 2:
				for(int i=0;i<cnt;i++) {
					arr[i].show();}
				break;
				
			case 3:
				System.out.println("Enter account number");
				acno=sc.nextInt();
				for(int i=0;i<cnt;i++) {
					if(arr[i].getAccountNumber()==acno) {
						System.out.println("Enter amount to be deposited:");
						arr[i].deposite(sc.nextDouble());
					}
				}
				break;
				
			case 4:
				System.out.println("Enter account number");
				acno=sc.nextInt();
				for(int i=0;i<cnt;i++) {
					if(arr[i].getAccountNumber()==acno) {
						System.out.println("Enter amount to be withdrawn:");
						arr[i].withdraw(sc.nextDouble());
					}
				}
				break;
			
			case 5:
				System.exit(0);

			}
			
		}
	}
}
