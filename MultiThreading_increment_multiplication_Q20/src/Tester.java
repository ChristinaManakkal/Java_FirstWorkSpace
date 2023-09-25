import java.util.Scanner;

//class t1 extends Thread{
//	public void run() {
//		
//		for(int i=0;i<100;i++)
//			System.out.println("Hi");
//		try {
//			Thread.sleep(1000);
//		} catch(Exception e) {
//			
//		}
//		Scanner s=new Scanner(System.in);
//		System.out.println("Enter number to increment:");
//		int x=s.nextInt();
//		while(x<=10)
//			System.out.println(x);
//		x++;
//		
//	}
//}

//class t2 extends Thread{
//	public void run() {
//		for(int i=0;i<100;i++)
//			System.out.println("Hello");
//		try {
//			Thread.sleep(1000);
//		} catch(Exception e) {
//			
//		}
//		
//		Scanner s=new Scanner(System.in);
//		System.out.println("Enter number:");
//		int n=s.nextInt();
//		for(int i=0;i<=10;i++)
//			System.out.println(n+"*"+i+"="+n*i);
//	}
//}

//public class Tester {
//
//	public static void main(String[] args) {
//		t1 ft=new t1();
//		t2 st=new t2();
//		ft.start();
//		st.start();
//		ft.stop();
//		st.stop();
//		
//
//	}
//
//}

class Increment extends Thread {
    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number for t1: ");
        int n = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= 10; i++) {
            System.out.println("Thread t1: " + (n + i));
        }
    }
}

class Multiplication extends Thread {
    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number for t2: ");
        int n = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= 10; i++) {
            System.out.println("Thread t2: " + n + " x " + i + " = " + (n*i));
        }
    }
}



public class Tester {
    public static void main(String[] args) {
        // Create thread t1 for printing next 10 incremented values
        Increment t1 = new Increment();
        t1.start();

        // Create thread t2 for printing multiplication table
        Multiplication t2 = new Multiplication();
        t2.start();
    }
}


