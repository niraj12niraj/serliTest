package list.user;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

public class User {

	private long id;

	private String name;

	private int age;

	private double salary;

	public User() {
		id = 0;
	}

	private static final AtomicLong counter = new AtomicLong();
	private static List<User> users;
	static {
		users = populateDummyUsers();
	}

	public User findById(long id) {
		User s = null;
		Iterator<User> it = users.iterator();
		while (it.hasNext()) {
			s = it.next();
			// System.out.println("s.getID"+s.getId());
			if (id == s.getId()) {
				System.out.println(
						"id " + id + " name " + s.getName() + " age " + s.getAge() + " salary " + s.getSalary());
				return s;
			}
		}
		// TODO Auto-generated method stub
		return s;
	}

	public User findByName(String name) {
		User s = null;
		Iterator<User> it = users.iterator();
		while (it.hasNext()) {
			s = it.next();
			if (name == s.getName()) {
				System.out.println(
						"id " + s.getId() + " name " + s.getName() + " age " + s.getAge() + " salary " + s.getSalary());
				return s;
			}
		}
		return null;
	}

	private static List<User> populateDummyUsers() {
		List<User> users = new ArrayList<User>();
		users.add(new User(counter.incrementAndGet(), "Sam", 30, 70000));
		users.add(new User(counter.incrementAndGet(), "Tom", 40, 50000));
		users.add(new User(counter.incrementAndGet(), "Jerome", 45, 30000));
		users.add(new User(counter.incrementAndGet(), "Silvia", 50, 40000));
		return users;
	}

	public void saveUser(User user) {
		user.setId(user.getId());
		user.setName(user.getName());
		user.setAge(user.getAge());
		user.setSalary(user.getSalary());
		users.add(user);
		// users.add(new
		// User(counter.incrementAndGet(),user.getName(),user.getAge(),user.getSalary()));
		// System.out.println("Save Success");
		// TODO Auto-generated method stub

	}

	public void updateUser(User user) {
		// TODO Auto-generated method stub
		// System.out.println("updated User get invoked ");
		Iterator<User> it = users.iterator();
		while (it.hasNext()) {
			if (user.getId() == it.next().getId()) {
				users.iterator().next().setId(user.getId());
				users.iterator().next().setName(user.getName());
				users.iterator().next().setAge(user.getAge());
				users.iterator().next().setSalary(user.getSalary());
				// System.out.println("updated Id "+user.getId());
			}
		}
		System.out.println("Upser updated successfully");

	}

	public void deleteUserById(long id) {
		// TODO Auto-generated method stub
		Iterator<User> it = users.iterator();
		while (it.hasNext()) {
			if (id == it.next().getId()) {
				it.remove();
			}
		}
		System.out.println("User deleted successfully");

	}

	public List<User> findAllUsers() {
		// TODO Auto-generated method stub
		Iterator<User> it = users.iterator();
		while (it.hasNext()) {
			findById(it.next().getId());
		}
		return null;
	}

	public boolean isUserExist(User user) {
		// TODO Auto-generated method stub
		boolean uExist = false;
		Iterator<User> it = users.iterator();
		while (it.hasNext()) {
			if (user.getId() == it.next().getId()) {
				uExist = true;
				// System.out.println(uExist);
			}
		}
		System.out.println(uExist);
		return uExist;
	}

	public void deleteAllUsers() {
		// TODO Auto-generated method stub
		Iterator<User> it = users.iterator();
		while (it.hasNext()) {
			it.next();
			it.remove();
		}

	}

	public User(long id, String name, int age, double salary) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}

class FindUser {
	public static void main(String[] args) {
		User u = new User();
		u.findById(2);
		u.findByName("Silvia");
		User usave = new User(5, "rajesh", 41, 144254.0);
		User us = new User(6, "roli", 24, 44151.0);
		u.saveUser(usave);
		u.saveUser(us);
		System.out.println("find by name");
		u.findByName("rajesh");
		u.updateUser(us);
		System.out.println("find by name");
		u.findByName("roli");
		System.out.println("delete user by id ");
		u.deleteUserById(6);
		u.findById(2);
		System.out.println("Find All Users");
		us.findAllUsers();
		System.out.println("delete all users called");
		u.deleteAllUsers();
		System.out.println("find all users get call");
		u.findAllUsers();
		System.out.println("new user added..");
		User usa = new User(7, "rajneet", 23, 74254.0);
		u.saveUser(usa);
		System.out.println("User Exist method get call");
		u.isUserExist(usa);
	}
}
