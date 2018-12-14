package serliTest;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Student {
String name;
int age;
public Student(String name,int age) {
	this.name=name;
	this.age=age;
}

public static void main(String s[]) {
	List<Student>list=new ArrayList<>();
	list.add(new Student("Aaa",12));
	list.add(new Student("bbb",13));
	list.add(new Student("ccc",14 ));
	list.add(new Student("ddd", 14));
	
	
	Stream<Student> high = list.parallelStream().filter(p -> p.age >13);
	high.forEach(p -> display(p));
	//high.forEach(s::dispaly);
	
}
public static void display(Object s) {
	Student st = (Student)s;
	System.out.println("name--"+st.name+"age "+st.age);
}
}
