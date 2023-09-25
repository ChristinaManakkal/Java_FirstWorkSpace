package in.mindcraft.HibernateInheritanceDemo;

import javax.persistence.Entity;

@Entity
public class SavingsAccount extends Account{
	
	private int interestRate;

	//getter setter
	public int getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(int interestRate) {
		this.interestRate = interestRate;
	}

}
