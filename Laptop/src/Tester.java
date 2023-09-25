
class Laptop {

	
		private int lid;
		private String make;
		private double cost;
		
		public Laptop() { //constructor
			lid=101; //instance variables
			make="apple";
			cost=75000;
		}
		
		public Laptop(int lid,String make,double cost) {//parameterised constructor
			this.lid=lid;
			this.make=make;
			this.cost=cost;
		}
		
		public int getLid() {
			return lid;
		}
		
		public void setLid(int lid) {
			this.lid=lid;
		}
		
		public String getMake() {
			return make;
		}
		
		public void setMake(String make) {
			this.make=make;
		}
		
		public double getCost() {
			return cost;
		}
		
		public void setCost(double cost) {
			this.cost=cost;
		}
		
		public void show() {
			System.out.println(lid+" "+make+" "+cost);
		}
		
		public class Tester{
			public static void main(String[] args) {
				Laptop x1=new Laptop();//default constructor
				Laptop x=new Laptop(102,"Lenovo",45000);//parameterised constructor
				System.out.println(x.getCost());
				x.setCost(55000);
				x1.show();
				x.show(); //can't print object x in sys.out.prtln(if printed it displays name@hashcode of the object
			}

		}
}