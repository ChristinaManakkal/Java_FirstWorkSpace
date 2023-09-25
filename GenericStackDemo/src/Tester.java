class Stack<G>{
	private int size;
	private int top;
	private G []arr;
	
	public Stack() {
		size=5;
		top=-1;
		arr=(G[]) new Object [size]; //arr=new int [size];
	}
	
	public Stack(int s) {
		size=s;
		top=-1;
		arr=(G[]) new Object [size];
	}
	
	public void push(G val) throws Exception {
		if (!isFull())
			 arr[++top]=val;
		else
			throw new Exception("Overflow...!");
	}
	
	public G pop() throws Exception {
		if(!isEmpty())
			return arr[top--];
		else
			throw new Exception("Underflow...!");
	}
	
	public void display() {
		for(int i=0;i<=top;i++)
			System.out.println(arr[i]+" ");
	}
	public boolean isFull() {
		return top==size-1;
	}
	
	public boolean isEmpty() {
		return top==-1;
	}
}
public class Tester {

	public static void main(String[] args) {
		Stack <Integer> s1=new Stack<>();
		try {
		s1.push(12);
		s1.push(24);
		s1.push(36);
		s1.display();
		//s1.push(123);
		//s1.push(56);
		//System.out.println(s1.pop());
		//System.out.println(s1.pop());
		//System.out.println(s1.pop());
		//System.out.println(s1.pop());
		//System.out.println(s1.pop());
		//System.out.println(s1.pop());
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		System.out.println();
		Stack <String> s2=new Stack<>();
		try {
		s2.push("Mindcraft");
		s2.push("TCS");
		s2.push("LTI");
		s2.display();
		//s2.push(123);
		//s2.push(56);
		
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
