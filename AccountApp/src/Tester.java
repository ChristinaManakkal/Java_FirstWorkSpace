class Account{
	private int balance;
	
	public Account(int b) {
		balance=b;
	}
	
	public void deposite(int amount) {
		balance=balance+amount;
	}
	
	public void withdraw(int amount) throws Exception {
		if (amount>balance)
			throw new Exception("Insufficient Balance");
		else if(amount>15000)
			throw new Exception("Overlimit- Can't withdraw more than 15000");
		
		balance=balance-amount;
	}
}
public class Tester {

	public static void main(String[] args) {
		Account acc=new Account(35000);
		try {
			acc.withdraw(20000);
		}
		
	catch(Exception e){
		System.out.println(e);
	}

	}

}
