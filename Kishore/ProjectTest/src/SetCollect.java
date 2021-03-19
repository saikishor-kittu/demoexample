import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetCollect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> hset = new HashSet<String>(); 
		hset.add("one");
		hset.add("two");
		hset.add("four");
		hset.add("Six");
		System.out.println(hset);
		Set<String> tset= new LinkedHashSet(hset);
		System.out.println(tset);
	}

}

