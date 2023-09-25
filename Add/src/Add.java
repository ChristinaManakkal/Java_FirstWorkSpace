//write a method "add" to add n number of integers.use VarArgs- variable argument list

import java.util.Scanner;

public class Add { //normal addition of fixed number of arguments

	public static int add(int a, int b, int c){
		return a+b+c;
	}
	
	public static int Add(int ...x){ //this is for variable arguments-here, x is treated as an array
		int sum=0;
		for(int i=0;i<x.length;i++) {
			sum=sum+x[i];
		}
		return sum;
	}
	
	
	
	public static void main(String[] args) {
		System.out.println(add(1,2,3));//this will error if we add more arguments
		System.out.println(Add(1,2)); //we can add any number of arguments
		System.out.println(Add(10,20,50,30));
		
	}

}
