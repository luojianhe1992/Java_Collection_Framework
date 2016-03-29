package test_7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App {
	public static void main(String[] args) {
		
		List<String> animals = new ArrayList<String>();
		
		animals.add("Cat");
		animals.add("Elephant");
		animals.add("Tiger");
		animals.add("Lion");
		animals.add("Snake");
		animals.add("Mongoose");
		
		System.out.println(animals);
		
		System.out.println("************************************");
		
		Collections.sort(animals);
		
		System.out.println(animals);

		System.out.println("************************************");
		
		List<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(3);
		numbers.add(36);
		numbers.add(1);
		numbers.add(40);
		numbers.add(73);
		
		System.out.println(numbers);
		
		Collections.sort(numbers);
		
		System.out.println("************************************");

		System.out.println(numbers);
		
		System.out.println("************************************");

		System.out.println(animals);
		
		// Sort the animals list with new comparator
		Collections.sort(animals, new StringLengthComparator());
		
		System.out.println(animals);
		
		System.out.println("************************************");

		// Sort in alphabetical order
		Collections.sort(animals, new AlphabeticalComparator());
		
		System.out.println(animals);
		
		System.out.println("************************************");

		// Sort in reverse alphabetical order
		Collections.sort(animals, new ReverseAlphabeticalComparator());
		
		System.out.println(animals);
		
		System.out.println("************************************");

		// Using anonymous class, sort in reverse length
		Collections.sort(animals, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				int l1 = o1.length();
				int l2 = o2.length();
				
				if (l1 > l2) {
					return -1;
				}
				else if (l1 < l2) {
					return 1;
				}
				else{
					return 0;
				}
			}
		});
		
		System.out.println(animals);
		
		System.out.println("******************************************************************************************************************");

		List<Person> people = new ArrayList<Person>();
		
		people.add(new Person(1, "Joe"));
		people.add(new Person(5, "Sue"));
		people.add(new Person(3, "Iven"));
		people.add(new Person(6, "Bob"));
		people.add(new Person(2, "Alex"));
		people.add(new Person(7, "Andy"));
		people.add(new Person(4, "Ryan"));

		System.out.println(people);
		
		System.out.println("*********************************************");
		
		// Sort people list according to id
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				int id1 = o1.getId();
				int id2 = o2.getId();
				
				if (id1 > id2) {
					return 1;
				}
				else if (id1 < id2) {
					return -1;
				}
				else{
					return 0;
				}
			}
		});
		
		System.out.println(people);
		
		System.out.println("*********************************************");
		
		// Sort people list according to name
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				String n1 = o1.getName();
				String n2 = o2.getName();
				
				return n1.compareTo(n2);
			}
		});
		
		System.out.println(people);
		

		
		

	}
}