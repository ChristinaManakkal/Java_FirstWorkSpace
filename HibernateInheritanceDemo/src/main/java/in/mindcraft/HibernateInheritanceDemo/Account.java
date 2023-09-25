package in.mindcraft.HibernateInheritanceDemo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
//@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS) //creates seperate tables for diff classes
@Inheritance(strategy=InheritanceType.JOINED)  //only displayed the filled columns
@Table(name = "Accounts_table")  //to change the name of the table(drop all the created tables first)



public class Account { //account will be the table name
	@Id
	@GeneratedValue   //auto-generate accid i.e 1,2,3,4....
	@Column(name = "account_id")   //change column name
	
	private int accid;
	private String name;
	private double balance;
	
	//getters setters
	public int getAccid() {
		return accid;
	}
	public void setAccid(int accid) {
		this.accid = accid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	

}
