package in.mindcraft;

public class WageEmployee extends Employee{
	private int hours;
	private int rate;
	
	public WageEmployee() {
		hours=0;
		rate=0;
	}
	
	public WageEmployee(int id, String n, int d, int m, int y, int h, int r) {
		super(id,n,d,m,y);//super becoz it can't be accessed directly
		hours=h;
		rate=r;
	}
	
	public int CalculateSalary() {
		return hours*rate;
	}
	
	public  void show() {
		super.show();//calls the super class
		System.out.println(hours);
		System.out.println(rate);
	}

}
