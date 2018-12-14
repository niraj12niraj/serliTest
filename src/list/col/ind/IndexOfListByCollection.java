package list.col.ind;

import java.awt.image.SampleModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IndexOfListByCollection {
	public static void main(String[] args) {
		int arr[] = { 3, 4, 5, 7, 4, 3 };
		List<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(7);
		list.add(4);
		list.add(3);
		List<Integer> li = new ArrayList<>();
		li.add(3);
		li.add(4);
		//System.out.println(list.indexOf(3));
		int i=list.lastIndexOf(4);
		
		Set<Integer>set=new HashSet<>();
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(7);
		set.add(4);
		set.add(3);
		//set.forEach(System.out::println);
		
		int count =1;
		Map<Integer,Integer>m=new HashMap<>();
		
		m.put(list.iterator().next(),Collections.frequency(set, list));
		
		m.forEach((k,v)->System.out.println("number "+k+", count "+v));
		//System.out.println(i);
		HashSet<Integer> h = new HashSet<>();
		Map<Integer, Emp> map = new HashMap<>();
		map.put(1, new Emp(1100, "Jhons"));
		map.put(2, new Emp(7100, "Jhoni"));
		map.put(3, new Emp(9100, "Don"));
		map.put(4, new Emp(5100, "Soni"));
		map.put(5, new Emp(1800, "Sonu"));
		map.put(6, new Emp(6100, "Sonia"));
		Map<Integer, Integer> ma = new HashMap<>();
		List<Emp> list1 = new ArrayList<>();
		list1.add(new Emp(1100, "Jhons"));
		list1.add(new Emp(7100, "Jhoni"));
		list1.add(new Emp(9100, "Don"));
		list1.add(new Emp(5100, "Soni"));
		list1.add(new Emp(1800, "Sonu"));
		list1.add(new Emp(6100, "Sonia"));
		//Stream<Emp> e = list1.parallelStream().filter(p -> p.salary > 1800);
		//map.forEach((k, v) -> System.out.println("id-: " + k + " Emp name-: " + v.name + " Emp salary-: " + v.salary));
		//list1.forEach((p) -> p.show());
		System.out.println("salary>1800------");
		//e.forEach(p -> p.show());
		System.out.println("sorted emp---salary>6100...");
		//Stream<Emp>e1=list1.parallelStream().filter(a->a.salary>5100);
		//e1.forEach(a->a.show());
		System.out.println("--sorted...");
		//Stream<Emp>e2=list1.stream().sorted();
		//e2.forEach(System.out::println);
		// map.parallelStream().filter(p->p>5).collect(list);
		System.out.println();
		Collections.sort(list1, new Comparator<Emp>() {

			@Override
			public int compare(Emp o1, Emp o2) {
				// TODO Auto-generated method stub
				return ((Integer)o1.salary).compareTo((Integer)o2.salary);
			}
			
		});
		//Collections.sort(list1,(Emp o1,Emp o2)->((Integer)o1.salary).compareTo((Integer)o2.salary));
		Stream<Emp> s=list1.parallelStream().filter(p->p.salary>1100);
		 s.forEach(System.out::println);
		 System.out.println("=================");
		 list1.sort((Emp o1,Emp o2)->((Integer)o1.salary).compareTo((Integer)o2.salary));
		 list1.forEach(System.out::println);
	}

}


class Emp {
	int salary;
	String name;

	Emp(int salary, String name) {
		this.salary = salary;
		this.name = name;
		//System.out.println("salary--"+salary+", name--"+name);
	}
Emp(List<Emp>list){
	
}
	public void show() {
		System.out.println("salary-: " + salary + ", name-: " + name);
	}

	
	public String toString() {
		return "salary-: "+salary+", Name-: "+name;
	}
	Emp(int a,int b){
		if(a>b) {
			System.out.println(a);
		}
		System.out.println(b);
	}	
}
@FunctionalInterface
interface ssa{
	void sal(int a,String b);
}

@FunctionalInterface
interface Sallist{
    public List<Emp>list();
}


@FunctionalInterface
interface sorted{
	void sort(int a,int b);
}