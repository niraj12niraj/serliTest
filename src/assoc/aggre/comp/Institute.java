package assoc.aggre.comp;

import java.util.List;

//aggregation
public class Institute {
	String name;
	private Department depart;
	private List<Student>student;
	List<Department>de;
	public Institute(String name,List<Department>de) {
		this.name=name;
		this.de=de;
	}
	
	public void show() {
		for(Department d:de) {
			student=d.getStudents();
			System.out.println("department name "+d.dname);
		}
		for(Student s:student) {
			System.out.println("studentname "+s.name+"deptment "+s.dept);
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Department getDepart() {
		return depart;
	}

	public void setDepart(Department depart) {
		this.depart = depart;
	}

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}

	public List<Department> getDe() {
		return de;
	}

	public void setDe(List<Department> de) {
		this.de = de;
	}
	

}
