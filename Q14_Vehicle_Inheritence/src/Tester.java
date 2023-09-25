class Vehicle implements Cloneable{
	private String vehNumber;
	private String vehName;
	private double vehPrice;
	
	public Vehicle() {
		
	}
	
public Vehicle(String vehNumber, String vehName, double vehPrice) {
	this.vehNumber=vehNumber;
	this.vehName=vehName;
	this.vehPrice=vehPrice;	
	}

public Object clone() throws CloneNotSupportedException{
	return super.clone();
}

public void show() {
	System.out.println(vehNumber+" "+ vehName+" "+vehPrice);
}

}
public class Tester {

	public static void main(String[] args) throws CloneNotSupportedException {
		Vehicle vehicle=new Vehicle("MH04566768","Honda",97889);
		Vehicle v1=(Vehicle)vehicle.clone();
		vehicle.show();
		v1.show();

	}

}
