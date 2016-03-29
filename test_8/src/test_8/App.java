package test_8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class App {
	public static void main(String[] args) {
		
		List<String> list1 = new ArrayList<String>();
		Set<String> set1 = new TreeSet<String>();
		
		addElements(list1);
		showElements(list1);
		System.out.println("****************************************");
		addElements(set1);
		showElements(set1);

		System.out.println("****************************************");

		Collections.sort(list1);
		showElements(list1);
		
		System.out.println("****************************************************************************");

		List<Person> list2 = new ArrayList<Person>();
		Set<Person> set2=  new TreeSet<Person>();
		
		addPersons(list2);
		showPersons(list2);
		
		System.out.println("****************************************");

		addPersons(set2);
		showPersons(set2);
		
		System.out.println("****************************************");

		Collections.sort(list2);
		
		showPersons(list2);
	}
	
	private static void addPersons(Collection<Person> collection){
		collection.add(new Person("Joe"));
		collection.add(new Person("Joe"));
		collection.add(new Person("Sue"));
		collection.add(new Person("Juliet"));
		collection.add(new Person("Clare"));
		collection.add(new Person("Mike"));
		collection.add(new Person("Iven"));
		collection.add(new Person("Ryan"));
	}
	
	private static void showPersons(Collection<Person> collection){
		for(Person tempPerson : collection){
			System.out.println(tempPerson);
		}
	}
	
	private static void addElements(Collection<String> collection){
		collection.add("Joe");
		collection.add("Sue");
		collection.add("Juliet");
		collection.add("Clare");
		collection.add("Mike");
		collection.add("Iven");
		collection.add("Ryan");
	}
	
	private static void showElements(Collection<String> collection){
		for(String element : collection){
			System.out.println(element);
		}
	}
	
}
