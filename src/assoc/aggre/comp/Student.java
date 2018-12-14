package assoc.aggre.comp;

public class Student {
String name;
String dept;

Student(String name,String dept){
	this.name=name;
	this.dept=dept;
}
public String toString() {
	return "name"+name+" Department "+dept;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}

}
