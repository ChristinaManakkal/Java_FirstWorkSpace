package in.mindcraft;

public class SalesPerson extends WageEmployee{
	private int sales;
	private int com;
	
	public SalesPerson() {
		
	}
	
	public SalesPerson(int id, String n, int d, int m, int y, int h, int r, int s, int c) {
		super(id,n,d,m,y,h,r);//super becoz it can't be accessed directly
		sales=s;
		com=c;
	}
	
	public int CalculateSalary() {
		return super.CalculateSalary()+sales*com; //hours*rate is not accessible that is why super.CalculateSalary is writtern
	}
	
	public void show() {
		super.show();//calls the super class
		System.out.println(sales);
		System.out.println(com);
	}

}
