import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		int [] a= new int[] {10,20,30,40,50};
		int [] b=  {1,2,3,4,5};
		float [] c= new float[5];
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter five floats");
		for(int i=0;i<c.length;i++)
			c[i]=sc.nextFloat();
		for(int i=0;i<c.length;i++)
			System.out.println(c[i]+" ");
		for(float val:c) //each element of c is assigned to val
		{
			System.out.println(val+" ");
		}

	}

}
