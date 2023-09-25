import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Tester {

	public static void main(String[] args) {
		//Vector <Integer> v=new Vector<>();
		List<Integer> l=new ArrayList<>();
		//v.add(10);
		//v.add(20);
		//v.add(30);
		//v.add(40);
		//v.add(50);
		
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		
		System.out.println(l);  //using toString
		
		for(Integer val:l)
			System.out.println(val + " "); //using for-each
		
		System.out.println();
		
		Iterator<Integer> itr=l.iterator(); //using iterator
		while (itr.hasNext()) {
			System.out.println(itr.next()+" ");
		}
		
		//System.out.println("\n"+v.get(3));
		
		System.out.println("\n"+l.get(3));

	}

}
