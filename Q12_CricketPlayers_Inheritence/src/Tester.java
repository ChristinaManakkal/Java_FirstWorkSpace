interface printable{
	//public  void printDetails() {
		//return 0;
	//}
}

class CktPlayer implements printable{
	private String name;
	private int runs;
	
	public CktPlayer() { //constructor
		name=name;
		runs=runs;
	}
	
	public CktPlayer(String name, int runs) { //parameterised constructor
		name=name;
		runs=runs;
	}
	
	public  void printDetails() {
		System.out.println(name);
		System.out.println(runs);	
	}
	
	
}

class FtPlayer implements printable{
	private String n;
	private int goals;
	
	public FtPlayer() {
		
	}
	
    public FtPlayer(String name, int goals) {
		this.n=n;
		this.goals=goals;
	}
	
    public  void printDetails() {
		System.out.println(n);
		System.out.println(goals);	
	}
	
}



public class Tester {

	public static void main(String[] args) {
		CktPlayer c=new CktPlayer("Abc",10);
		//System.out.println(c.printDetails());

	}

}
