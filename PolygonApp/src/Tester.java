



class Polygon{
	public double calcArea() {
		return 0;
	}
}

class circle extends Polygon{
	private int radius;
	
	public circle() { //constructor
		radius=1;
	}
	
	public circle(int r) { //parameterised constructor
		radius=r;
	}
	
	public double calcArea() {
		return 3.142*radius*radius;
	}
	
	public double calcPeri() {
		return 2*3.142*radius;
	}
}

class rect extends Polygon{
	
	private int len,brd;
	
	public rect() { //constructor
		len=1;
		brd=1;
	}
	
	public rect(int len, int b) { //parameterised constructor
		len=1;
		brd=b;
	}
	
	public double calcArea() { //method with same name and return type as circle
		return len*brd;
	}
	
	public double calcPeri() { //method with same name and return type as circle
		return 2*(len+brd);
	}
	
}

class square extends rect  {
	public square() {		
	}	
	public square(int s) {
		super(s,s);
	}
	public double calcArea() { //method with same name and return type as circle
		return super.calcArea();
	}
	
	public double calcPeri() { //method with same name and return type as circle
		return super.calcPeri();
	}
}

public class Tester {

	public static void main(String[] args) {
		circle c=new circle(10);
		System.out.println(c.calcArea());
		System.out.println(c.calcPeri());

	}

}
