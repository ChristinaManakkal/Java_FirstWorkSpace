package in.mindcraft;//package statement should always be first if you wanna import scanner or anything else do it after package statement


public class Laptop {

	
		private int lid;
		private String make;
		private double cost;
		private static int cnt;
		
		public Laptop() { //constructor
			lid=101; //instance variables
			make="apple";
			cost=75000;
			cnt++;
		}
		
		public Laptop(int lid,String make,double cost) {//parameterised constructor
			this.lid=lid;
			this.make=make;
			this.cost=cost;
			cnt++;
		}
		
		//count number of objects
		public void showCnt() {
			System.out.println("Number of objects:"+cnt);
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
}