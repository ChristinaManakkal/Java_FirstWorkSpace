import in.mindcraft.*;
import in.mindcraftsubpack.*;
import static java.lang.System.out;


class A{
	static int a;
	int b;
	
	public A() { //constructor of class A
		
	}
	
	static class b{
		
		public b() { //constructor of class b
			
		}
		
		public void fn() {
			a=123;
			//b=909; //this is giving error because we can only access static fields
		}
	}
}




		public class Tester{
			public static void main(String[] args) {
				Laptop x1=new Laptop();//default constructor
				Laptop x=new Laptop(102,"Lenovo",45000);//parameterised constructor
				Laptop x2=new Laptop();
				Laptop x3=new Laptop();
				A x4=new A();
				
				//A.b obj=a.new b();
				//obj.fn();
				
				out.println("Static import");
				//System.out.println(x.getCost());
				x.setCost(55000);
				x1.show();
				x.show(); //can't print object x in sys.out.prtln(if printed it displays name@hashcode of the object
			    x.showCnt(); //shows the number of objects
			}

		}

