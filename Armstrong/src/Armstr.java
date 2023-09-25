import java.util.Scanner;

public class Armstr {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x,sum=0,num;
		System.out.println("Enter a number:");
		num=sc.nextInt();
		int temp=num;
		while(num>0) {
			x=num%10;
			num=num/10;
			sum=sum+x*x*x;
		}
			if (temp==sum) {
				System.out.println("Armstrong");
			}
			else {
				System.out.println("Not Armstrong");
			}

	}

}
