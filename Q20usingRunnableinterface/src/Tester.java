//implementing threads using runnable interfaces

import java.util.Scanner;

class MyThreads implements Runnable{
	private int num;
	private Thread t1,t2;
	
	public MyThreads(int num) {
		this.num=num;
		t1=new Thread(this,"incr");
		t2=new Thread(this,"table");
		t1.start();
		t2.start();
	}
	
	public void run() {
		for(int i=0;i<10;i++) {
			if(Thread.currentThread()==t1)
				System.out.println("incrememted value="+(num+i));
			else if(Thread.currentThread()==t2)
				System.out.println("Table value="+(num*i));
		}
	}
}
public class Tester {

	public static void main(String[] args) {
		int num;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number:");
		num=s.nextInt();
		MyThreads m=new MyThreads(num);

	}

	

}
