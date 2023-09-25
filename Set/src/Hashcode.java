import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

class Laptop implements Comparable<Laptop> {

	
		@Override
	public int hashCode() {
		return Objects.hash(cost, lid, make);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Laptop other = (Laptop) obj;
		return Double.doubleToLongBits(cost) == Double.doubleToLongBits(other.cost) && lid == other.lid
				&& Objects.equals(make, other.make);
	}

		private int lid;
		public int getLid() {
			return lid;
		}

		private String make;
		@Override
		public String toString() {
			return "Laptop [lid=" + lid + ", make=" + make + ", cost=" + cost + "]\n";
		}

		private double cost;
		
		public Laptop() { //constructor
			lid=101; //instance variables
			make="apple";
			cost=75000;
		}
		
		public Laptop(int lid,String make,double cost) {//parameterised constructor
			this.lid=lid;
			this.make=make;
			this.cost=cost;
		}
		
		
		public void show() {
			System.out.println(lid+" "+make+" "+cost);
		}

		@Override
		public int compareTo(Laptop o) { //o is object
			if(this.cost<o.cost)
				return -1;
			else if(this.cost>o.cost)
				return 1;
			return 0;
		}
		
		
}	

class LaptopCompare implements Comparator<Laptop>{
	public int compare(Laptop o1, Laptop o2) {
		if(o1.getLid()<o2.getLid())
			return -1;
		else if(o1.getLid()>o2.getLid())
			return 1;
		else
		return 0;
	}
}
public class Hashcode {

	public static void main(String[] args) {
		Set<Laptop> set=new TreeSet<>();
		set.add(new Laptop(101,"Dell",50000));
		set.add(new Laptop(102,"HP",45000));
		set.add(new Laptop(103,"Lenovo",35000));
		//set.add(new Laptop(103,"Lenovo",60000));
		System.out.println(set);
		
		System.out.println();
		
		List<Laptop> list=new ArrayList<>();
		list.add(new Laptop(105,"Dell",50000));
		list.add(new Laptop(102,"HP",45000));
		list.add(new Laptop(103,"Lenovo",35000));
		Collections.sort(list,new LaptopCompare());
		System.out.println(list);
		

	}

}
