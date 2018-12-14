package assoc.aggre.comp;

import java.util.List;

public class Department {
String dname;

List<Student>students;
public Department(String dname,List<Student>s) {
	// TODO Auto-generated constructor stub
	this.dname=dname;
	this.students=s;
}
public String getDname() {
	return dname;
}
public void setDname(String dname) {
	this.dname = dname;
}
public List<Student> getStudents() {
	return students;
}
public void setStudents(List<Student> students) {
	this.students = students;
}

public String toString() {
	return "dname "+dname;
}
}
