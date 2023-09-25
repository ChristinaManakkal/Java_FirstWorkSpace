
import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		System.out.println("Enter a number:");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		
		int sum=0;
		int temp=a;
		for(int i=1;a>0;i++) {
			int x=a%10;
			a=a/10;
			sum=sum+x*x*x;
			
}
		System.out.println(+sum);
		
		if(sum==temp) {
			System.out.println("The entered number is Armstrong");}
		else {
			System.out.println("The entered number is not Armstrong");}
		}
}