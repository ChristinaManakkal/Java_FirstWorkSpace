package in.mindcraft.HibernateDemo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity  //declare student as entity in db

public class Student { //pojo =plain old java object
	@Id   //primary key
	
	private int rollno;
	private String name;
	
	//@OneToOne //foreign key 
	//private laptop laptop;
	@OneToMany(mappedBy="student")
	private List<laptop> list=new ArrayList<laptop>();
	
	
	//getter setter
	public List<laptop> getList() {
		return list;
	}
	public void setList(List<laptop> list) {
		this.list = list;
	}
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
