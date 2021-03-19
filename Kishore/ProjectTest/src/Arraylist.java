import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Arraylist {
	
	public static void main(String[] args) {
		ArrayList<String> alist= new ArrayList<String>();
		
		alist.add("One");
		alist.add("Two");
		alist.add("Three");
		alist.add("Four");
		System.out.println(alist);
		alist.set(2, "Two");
		System.out.println(alist);
//		alist.remove(0);
//		System.out.println(alist);
		for(String str:alist) {
			System.out.println(str + " at position: " + alist.indexOf(str) );
		}
		Collections.sort(alist);
		for(String str:alist) {
		System.out.println(str);
	}
//		alist.clear();
//		System.out.println(alist);
		
		
}}
