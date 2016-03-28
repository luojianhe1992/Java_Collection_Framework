package test_2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class App {
	public static void main(String[] args) {
		
		List<String> list1 = new LinkedList<String>();
		List<String> list2 = new ArrayList<String>();
		
		doTimings("LinkedList", list1);
		doTimings("ArrayList", list2);
		
		list1.add("abc");
		list1.add("efg");
		list1.add("hij");
		list1.add("opq");
		list1.add("rst");
		list1.add("uvw");
		
		System.out.println(list1);
		
		System.out.println("*****************************************");
		
		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		
		System.out.println("*****************************************");

		System.out.println(list1.contains("efg"));
		
		System.out.println("*****************************************");

		Iterator<String> it = list1.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("*****************************************");

		list1.remove("abc");
		
		System.out.println(list1);
		
		System.out.println("*****************************************");

		
		
	}
	
	public static void doTimings(String type, List<String> list){
		return;
	}
	
}
