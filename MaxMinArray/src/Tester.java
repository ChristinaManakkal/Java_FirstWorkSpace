//WAP to find out maximum and minimum value from an integer array without sorting array.
//multiply each element of the array by 5 and store it in another array and display it. 
import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		int [] a= new int[5];
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter five integers:");
		for(int i=0;i<a.length;i++)
			a[i]=sc.nextInt();
		
		int max=a[0];
		for(int i=1;i<a.length;i++) 
		{
			if(a[i]>max)
				max=a[i];
		}
		System.out.println("Maximum value="+max);
		
		int min=a[0];
		for(int i=1;i<a.length;i++) 
		{
			if(a[i]<min)
				min=a[i];
		}
		System.out.println("Minimum value="+min);

		
		
		}
	}


