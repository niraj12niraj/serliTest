package serliTest;

import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test1 implements Serializable {
/*	final int a;
	*//**
	 * 
	 *//*
	private static final long serialVersionUID = 7885133828536598894L;

	public Test1() {
		a = 10;
	}

	public static void main(String[] args) {
		new Test1().show();
		display();
		removeit();
	}

	public void show() {
		System.out.println("Test1 show()");
	}

	public static void display() {
		System.out.println("Test1 display()");
	}

	public void list() {
		List<String> list = new ArrayList<>();
		list.add("abc");
	}

	
	 * public static void removeDuplicate() {
	 * System.out.println("removeDuplicate()"); int[] arr = { 1, 1, 2, 5, 3, 1, 0 };
	 * List<Object> list = new ArrayList<>(); list.add(arr); for (int i = 0; i <=
	 * arr.length; i++) { for (int j = i + 1; j <= i; j++) { if (arr[i] == arr[j]) {
	 * list.add(list.remove(i)); } System.out.println(list); } } Iterator<Object> it
	 * = list.iterator(); while (it.hasNext()) { System.out.println(it.next()); }
	 * System.out.println(list);
	 * 
	 * }
	 

	public static void removeit() {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(1);
		list.add(2);
		list.add(5);
		list.add(3);
		list.add(1);
		list.add(5);
		list.add(7);
		list.add(7);
		list.add(5);

		Iterator<Integer> it = list.iterator();
		
		 * Integer i=it.next(); if(i==it.next()) { it.remove(); }
		 * 
		 * while(it.hasNext()) {//loop is here System.out.println(it.next()); }
		 

		/// good
		List<Integer> list1 = new ArrayList<>();
		while (it.hasNext()) {
			Integer i = it.next();
			if (list1.contains(i)) {
				it.remove();
			} else {
				list1.add(i);
			}
		}
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println("i="+i+" "+list);
            for(int j = i + 1; j < list.size(); j++) {
            	System.out.println("j="+j+" "+list);
                if(list.get(i).equals(list.get(j))){
                	list.remove(j);
                    j--;
                    System.out.println(" j "+j);
                }
            }
        }
		
		System.out.println(list);

	}
*/
	
	public static void main(String[] args) {
		/*List<Integer> list2 = Arrays.asList(5, 6, 7);
		List<String> list1 = Arrays.asList("a","b","c");
	      
	      Optional<Integer> res = list2.parallelStream().reduce((s1, s2) -> s1*s2);
	      Stream ad = list1.parallelStream().map(s -> s+" xyz");
	      ad.forEach(s-> System.out.println(s));
	      System.out.println(res);*/
		
		/*Map<String, Integer> ages = new HashMap<>();
		ages.put("John", 25);
		ages.put("Freddy", 24);
		ages.put("Samuel", 30);
		 
		ages.forEach((name, age) -> System.out.println(name + " is " + age + " years old"));*/
	
		
		/*List<String> names = Arrays.asList("Angela", "Aaron", "Bob", "Claire", "David");
		 
		List<String> namesWithA = names.stream()
		  .filter(name -> name.startsWith("A"))
		  .collect(Collectors.toList());
		
		List<String> namesEndWithd = names.stream()
				  .filter(name -> name.endsWith("d"))  
				  .collect(Collectors.toList());
		System.out.println(namesWithA);
		System.out.println(namesEndWithd);
		//List<String> namesEndWit = names.stream().filter(name-> name.collect(Collectors.toList());
*/		
		List<String> names = Arrays.asList("bob", "josh", "megan");
		 
		//names.replaceAll(name -> name.toUpperCase());
		names.replaceAll(String::toUpperCase);
		//System.out.println(names);
		names.stream();
		System.out.println(names);
	    }
	
}

