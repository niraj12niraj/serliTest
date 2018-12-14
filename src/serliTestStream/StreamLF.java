package serliTestStream;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

import org.omg.Messaging.SyncScopeHelper;

public class StreamLF {
	public static void main(String[] args) {
		List<String> l = new ArrayList<>();
		l.add("1");
		l.add("2");
		l.add("3");
		l.add("4");
		l.add("5");
		l.add("5");
		l.add("3");
		l.add("6");
		l.add("6");
		Set<String> set = l.stream().parallel().collect(Collectors.toSet());
		HashSet list = (HashSet) l.stream().parallel().collect(Collectors.toSet());
		System.out.println(set);
		System.out.println(list);
		Optional<String> h = l.stream().parallel().findFirst();
		System.out.println(h);
		// ------------------------------
		List<Emp> li = new ArrayList<>();
		li.add(new Emp("aa", 12));
		li.add(new Emp("ab", 13));
		li.add(new Emp("ac", 13));
		li.add(new Emp("ad", 10));
		Emp e1 = new Emp("ae", 20);

		List<Emp> li1 = new ArrayList<>();
		li1.add(new Emp("bb", 22));
		li1.add(new Emp("bb", 23));
		li1.add(new Emp("bc", 23));
		li1.add(new Emp("bd", 20));

		// Stream<Emp> h1=li.stream().parallel().filter((p)->p.age>12);
		// h1.forEach(System.out::println);

		// h1.forEach((p)->show(p));
		// Stream<Emp> e1=li.stream().filter((p)->p.name!="aa");
		// e1.forEach(System.out::println);

		Stream.Builder<Emp> builder = Stream.builder();
		li.forEach(emp -> {
			builder.add(emp);

		});
		li1.forEach(emp1 -> {
			builder.add(emp1);
		});
		Stream<Emp> newEmp = builder.build();

		newEmp.forEach(System.out::println);

		Stream.Builder<String> builder1 = Stream.builder();
		Stream<String> s1 = builder1.add("aa").add("bb").add("cc").add("dd").build();
		s1.forEach(s2 -> {
			builder1.add(s2);
		});
		
		

	}

	public static void show(Object o) {
		Emp e = (Emp) o;
		System.out.println("name :-" + e.name + ", age :-" + e.age);
		// return o;
	}

}

class Emp {
	String name;
	int age;

	public Emp(String name, int age) {
		this.age = age;
		this.name = name;

	}

	public static Object show(Object o) {
		Emp e = (Emp) o;
		System.out.println("name :-" + e.name + ", age :-" + e.age);
		return o;
	}

	public String toString() {
		return "name -" + name + ", age -" + age;
	}
}
