package test_6;

import java.util.HashMap;
import java.util.Map;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

public class App {
	public static void main(String[] args) {
		Map<String, Integer> map1 = new HashMap<String, Integer>();
		
		map1.put("One", 1);
		map1.put("Two", 2);
		map1.put("Three", 3);
		
		// replace the key value pair
		map1.put("One", 4);
		
		System.out.println(map1);
		
		System.out.println("**********************************************");

		Person person1 = new Person(1, "abc");
		Person person2 = new Person(2, "efg");
		Person person3 = new Person(3, "hij");
		Person person4 = new Person(1, "abc");
		Person person5 = new Person(5, "rst");
		
		System.out.println(person1);
		System.out.println(person2);
		System.out.println(person3);
		System.out.println(person4);
		
		System.out.println("**********************************************");
		
		Map<Person, Integer> map2 = new HashMap<Person, Integer>();
		map2.put(person1, 1);
		map2.put(person2, 2);
		map2.put(person3, 3);
		/* because I add a equal function in Person class, 
		 * it will know that person1 and person4 are the same
		 */
		map2.put(person4, 4);
		map2.put(person5, 5);
		
		System.out.println(map2);
		
		System.out.println("**********************************************");
		
		/* because I add a equal function in Person class, 
		 * it will know that person1 and person4 are the same
		 */
		System.out.println(person1.equals(person4));
			
		System.out.println("**********************************************");


	}
}
