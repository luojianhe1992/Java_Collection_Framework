package test_5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {
	public static void main(String[] args) {
		
		Set<String> setExample = new HashSet<String>();
		
		setExample.add("abc");
		setExample.add("efg");
		setExample.add("hij");
		setExample.add("opq");
		setExample.add("rst");
		
		// HashSet has no order
		System.out.println(setExample);
		
		System.out.println("**********************************************");
		
		System.out.println(setExample.size());
		
		System.out.println("**********************************************");

		System.out.println(setExample.contains("efg"));
		
		System.out.println("**********************************************");

		// add duplicates to the set
		setExample.add("efg");
		setExample.add("hij");
		
		System.out.println(setExample);
		
		System.out.println("**********************************************");

		System.out.println(setExample.remove("efg"));

		System.out.println(setExample);
		
		System.out.println("**********************************************");
		
		Iterator<String> it = setExample.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("**********************************************");

		
		Set<String> setExample2 = new LinkedHashSet<String>();
		Set<String> setExample3 = new TreeSet<String>();
		
		setExample2.add("abc");
		setExample2.add("efg");
		setExample2.add("rst");
		setExample2.add("opq");
		setExample2.add("hij");
		
		setExample3.add("abc");
		setExample3.add("efg");
		setExample3.add("rst");
		setExample3.add("opq");
		setExample3.add("hij");
		
		// LinkedHashSet in add order
		System.out.println(setExample2);
		
		System.out.println("**********************************************");

		// TreeSet in natural order
		System.out.println(setExample3);
		
		
	}	
}
