package in.mindcraft.HibernateSwitchCase;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MobPhone {
	@Id
	private int mid;
	private String make;
	private double cost;
	
	
	
	@Override
	public String toString() {
		return "MobPhone [mid=" + mid + ", make=" + make + ", cost=" + cost + "]";
	}
	
	
	public MobPhone() {
		
	}
	
	//parameterised constructor
	public MobPhone(int mid, String make, double cost) {
		super();
		this.mid = mid;
		this.make = make;
		this.cost = cost;
	}



	//getter setter
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}

}
