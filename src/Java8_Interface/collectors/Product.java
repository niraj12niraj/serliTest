package Java8_Interface.collectors;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Product{
	private int price;
	private String name;
	//private List<Product>list;
	public Product() {
		// TODO Auto-generated constructor stub
	}
	/*public Product(int p,String n) {
		// TODO Auto-generated constructor stub
		this.price=p;
		this.name=n;
	}*/
	public static void main(String[] args) {
	List<Product>list=new ArrayList<>();
	
	/*list.add(new Product(145, "a"));
	list.add(new Product(142, "b"));
	list.add(new Product(149, "c"));
	list.add(new Product(147, "d"));
	list.add(new Product(144, "e"));*/
	
	

	
	
	//list.forEach(System.out::println);
	
	Product sp=new Product();
	sp.setName("pro");
	sp.setPrice(14);
	
	Product sp1=new Product();
	sp1.setName("pr");
	sp1.setPrice(10);
	list.add(sp1);
	list.add(sp);
	//Collectors class have different methods , it is final class from  java 8 under stream api
	//SortPrductByPrice sp=new SortPrductByPrice();
	
	Collections.sort(list,(Product p1,Product p2)->{return p1.getPrice()-p2.getPrice();});
	
	
	//Collections.sort(list, sp::compare);
	System.out.println(list);
	
	}
	public String toString() {
		return "price:-"+price+" name:-"+name;
	}
	public int getPrice() {
		return price;
	}
	public String getName() {
		return name;
	}
	public int setPrice(int p) {
		return this.price=p;
	}
	public String setName(String n) {
		return this.name=n;
	}
	public int compare(Product o1, Product o2) {
		
		return o1.getPrice()-o2.getPrice();
	}

}
interface p{
	Product getProduct(int a,String s);
}
/*class SortPrductByPrice{
	public int compare(Product p1,Product p2) {
		return p1.getPrice()-p2.getPrice();
	}
}*/