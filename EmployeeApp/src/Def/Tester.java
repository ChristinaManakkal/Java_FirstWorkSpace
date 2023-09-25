package Def;

import in.mindcraft.Employee;
import in.mindcraft.SalesPerson;
import in.mindcraft.WageEmployee;

public class Tester {

	public static void main(String[] args) {
		Employee e1=new Employee();
		WageEmployee w=new WageEmployee(123,"yuta",12,9,1999,10,10000);
		e1.show();
		
		SalesPerson s=new SalesPerson(887,"Adu",10,5,1990,10,500,100,100);
		s.show();
		System.out.println("");
		
		System.out.println();
		Employee e2=new Employee(222,"Chris",10,10,1995);
		e2.show();
		w.show();
	}

}
