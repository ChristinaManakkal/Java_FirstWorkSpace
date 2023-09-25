class Employee{
	private int id;
	private String name;
	private double salary; //write getter and setter
	
	public Employee() {
		
	}
	
	public Employee(int id, String name, double salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	public double getSalary() { //create getter coz salary is private and we need to acces it later
		return salary;
	}
	
	public void display() {
		System.out.println(id+" "+name+" "+salary);
	}
}

class Manager extends Employee{
	private double petrol;
	private double food;
	private double others;
	
	public Manager() {
		petrol=0.08*super.getSalary(); //super keyword can be used or can not be used upto you.
		food=0.12*super.getSalary();
		others=0.04*super.getSalary();
	}
	
	public Manager(int id, String name, double salary) {
		super(id,name,salary);
		petrol=0.08*super.getSalary();
		food=0.12*super.getSalary();
		others=0.04*super.getSalary();	
	}
	
	public void display() {
		super.display();
		System.out.println("petrol allowance-"+petrol);
		System.out.println("food allowance-"+food);
		System.out.println("other allowance-"+others);
	}
    
	public double calculateGrossSalary() {
    	return super.getSalary()+petrol+food+others;
    }
	
    public double calculateNetSalary() {
    	return calculateGrossSalary()-0.125*(super.getSalary());
    }
    
}


class MarketingExecutive extends Employee{
	private int kil;
	private int tour;
	private int tele;
	
public MarketingExecutive(int id,String name, double salary, int kil) {
	super(id,name,salary);	
	    kil=kil;
		tour=5*kil;
		tele=2000;
	}

public void display() {
	super.display();
	System.out.println("Tour allowance-"+tour);
	System.out.println("Telephone allowance-"+tele);
	
}
	
	
	
public double calculateGrossSalary() {
	return super.getSalary()+tele+tour;
}

public double calculateNetSalary() {
	return calculateGrossSalary()-0.125*(super.getSalary());
}
    
 
}

public class Tester {

	public static void main(String[] args) {
		//public void printObject(Employee e) {
			//e.display();
		//}
		Manager m=new Manager(101,"abc",10000);
		//printObject();
		m.display();
		System.out.println("Gross Salary="+m.calculateGrossSalary());
		System.out.println("Net Salary="+m.calculateNetSalary());

	}

}
