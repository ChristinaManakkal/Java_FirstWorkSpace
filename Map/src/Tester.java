import java.util.Set;
import java.util.TreeMap;
import java.util.Map;
import java.util.*;

public class Tester {

	public static void main(String[] args) {
		Map<Integer,String> map=new TreeMap<>();
		
		map.put(365,"Christy");
		map.put(505,"Aditi");
		map.put(100,"Anu");
		
		System.out.println(map);
		
		Set<Integer> keys=map.keySet();
		System.out.println(keys);
		
		for(Integer key:keys) {
			System.out.println(map.get(key));
		}

	}

}
