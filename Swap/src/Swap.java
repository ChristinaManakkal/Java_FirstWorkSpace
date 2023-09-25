import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		//int a,b,c;
		//a=10;
		//b=20;
		//c=b;
		//b=a;
		//System.out.println(" "+c+" "+b);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c;
		c=b;
		b=a;
		System.out.println("The swapped numbers are"+" "+c+" "+b);

	}

}
