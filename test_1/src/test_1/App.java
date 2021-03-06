package test_1;

import java.util.ArrayList;
import java.util.List;

public class App {
	public static void main(String[] args) {
		
		List<String> list1 = new ArrayList<String>(5);
		// call add function
		list1.add("Jianhe Luo");
		list1.add("Xingyu Yan");
		list1.add("CMU MSBIC");
		
		System.out.println(list1);
		
		System.out.println(list1.size());
		
		for (int i = 0; i < list1.size(); i++) {
			// call get function
			System.out.println(list1.get(i));
		}
		
		System.out.println("*********************************");
		
		for (String temp: list1){
			System.out.println(temp);
		}
		
		System.out.println("*********************************");

		String str = "Jianhe Luo";
		
		// call contains function
		System.out.println(list1.contains(str));

		System.out.println("*********************************");
		
		// call remove function, remove according to the index
		list1.remove(list1.size() - 1);
		
		System.out.println(list1);

		System.out.println("*********************************");

		// call remove function, remove according to the object
		list1.remove(str);
		
		System.out.println(list1);

		System.out.println("*********************************");

		
		
	}
}
