//scan 2D array and make use of nested for loops
import java.util.Scanner;

public class Transpose {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int [][]d=new int[3][3];
		int [][]b=new int[3][3];
		System.out.println("enter matrix elements:");
		for(int i=0;i<d.length;i++)
		{
			for(int j=0;j<d[i].length;j++)
			{
				d[i][j]=sc.nextInt();
			}
	}
		
		for(int i=0;i<d.length;i++)
		{
			for(int j=0;j<d[i].length;j++)
			{
				b[j][i]=d[i][j];
			}
	}
		
		
		for(int []temp:d) {
			for(int val:temp) {
				System.out.print(val+" ");
			}
			System.out.println();
		}
		
		for(int []temp:b) {
			for(int val:temp) {
				System.out.print(val+" ");
			}
			System.out.println();
		}

	}

}
