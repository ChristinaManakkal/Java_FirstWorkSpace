package in.mindcraft.HibernateInheritanceDemo;

import javax.persistence.Entity;

@Entity
public class CurrentAccount extends Account{
	
	private double overlimit;

	//getter setter
	public double getOverlimit() {
		return overlimit;
	}

	public void setOverlimit(double overlimit) {
		this.overlimit = overlimit;
	}
	
	

}
