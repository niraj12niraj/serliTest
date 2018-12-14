package assoc.aggre.comp;

import java.util.ArrayList;
import java.util.List;


//association
public class Admin {
	public static void main(String[] args) {
		Student s=new Student("Rajesh", "CSE");
		Student s1=new Student("Raju", "CSE");
		Student s2=new Student("Jhon", "CSE");
		Student s3=new Student("Monty", "ECE");
		Student s4=new Student("Mon", "ECE");
		Student s5=new Student("Munmun", "ECE");
		
		List<Student>slist=new ArrayList<>();
		slist.add(s);
		slist.add(s1);
		slist.add(s2);
		
		List<Student>slist1=new ArrayList<>();
		slist1.add(s3);
		slist1.add(s4);
		slist1.add(s5);
		
		Department d=new Department("CSE", slist);
		Department d1=new Department("ECE", slist1);
		
		List<Department>dlist=new ArrayList<>();
		dlist.add(d);
		dlist.add(d1);
		Institute i=new Institute("HBIT", dlist);
		i.show();
		
	}

}
