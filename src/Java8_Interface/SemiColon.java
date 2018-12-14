package Java8_Interface;

import java.text.Collator;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;


//all interface must be functional interface
/*public class SemiColon {
	
public static void main(String[] args) {
	Si si=S1::new;//:: it is method reference //constructor reference
	//Si si=new S1();
	List<String>list=new ArrayList<>();
	list.add("ads");
	list.add("adt");
	//si.getRecords(list);
	S1 s1=si.getRecords(list);
	Sii sii=S1::new;
	sii.show(list, "Hello");
	Sii1 s=(Sii1) new S1();
	s.show();
	
	
	Sii1 s=S1::new;
	s.show();
}


}
interface Si{
	S1 getRecords(List<String> list);
}
class S1{
	private List<String>list;
	private String s;
	S1(List<String>list){
		this.list=list;
		list.forEach(System.out::println);
	}
	S1(List<String>list,String s){
		this.list=list;
		this.s=s;
		list.forEach(a->System.out.println(list+" "+s));
		//list.forEach(a->System.out.println(list.add(s)));//Exception in thread "main" java.util.ConcurrentModificationException
	}
	S1(){
		System.out.println("S1");
	}
}
interface Sii{
	void show(List<String>list,String s);
}
interface Sii1{
	void show();
}*/
//static and instance method reference
class S2 implements Si1{
	int a=10;
	public static void main(String[] args) {
		/*Si1 si1=S2::show;    //static method reference
		si1.say();*/
		
		/*BiFunction<Integer, Integer, Integer>ad=ADD::add;   //static method reference by using BiFunction functional interface
		int result=ad.apply(12, 15);*/
		//System.out.println(result);
		/*
		Si2 si2=ADD::new; //default constructor reference
		si2.say();*/
		
		/*Si2 si2=ADD::show;*/   ////static method reference
		
		
		/*Si3 si3=ADD::new;
		si3.adder(14,48, 41);*/
/*		
		Si4 si4=ADD::sum;       ////static method reference
		si4.adder(14, 21, 13);
		
		ADD a=new ADD();
		Si4 si40=a::sum1;
		si40.adder(10, 12, 13);
		
		Si4 si41=new ADD()::sum1;
		si41.adder(14, 11, 11);
		
		//thread
		Thread t1=new Thread(new S2()::show2);
		t1.start();
		Runnable r=new S2()::show2;
		r.run();
		Runnable r1=Thread::new;
		r1.run();  //empty no implementation 
		Runnable r2=new Thread(new S2()::show2);
		r2.run();*/

		Si1 s;
		//s.say();
		
		
		s=new S2()::say1;
		s.say();
		//s=new S2().say1();
		
		
		
		//s=S2::new; //method reference -->constructor -->method with name as class--constructor as a special type of method only
		//s.say();
		
		
		//s=S2::say1;
		//s.say();
		
		
		
	}
/*	public void show2() {
		//Si4 si4=ADD::sum1;
		System.out.println("Thread...."+Thread.currentThread().getName());
	}
	public static void show() {
	System.out.println("show in s2");
	}
	@Override
	public S1 getRecords(List<String> list) {
		// TODO Auto-generated method stub
		return null;
	}*/
 public S2(){
	System.out.println("S2 "+a);
	
	//say();
}
 
@Override
public void say() {
	System.out.println("Si1");
	
}
public void say1() {
	System.out.println("say1 static");
	
}	
}
interface Si1{
	void say();
	
}
/*class ADD{
	//private int a,b,c;
	public static Integer add(int a,int b) {
		System.out.println("ADD--add() a:"+a+" b :"+b+" sum :"+(a+b));
		return a+b;
	}
	public static Integer sum(int a,int b,int c) {
		System.out.println("ADD--sum() a:"+a+" b :"+b+" c:"+c+" sum :"+(a+b+c));
		return a+b+c;
	}
	public  Integer sum1(int a,int b,int c) {
		System.out.println("ADD--sum1() a:"+a+" b :"+b+" c:"+c+" sum :"+(a+b+c));
		return a+b+c;
	}
	public static void show() {
		System.out.println("Show in ADD");
	}
	
	
	ADD(int a,int b,int c){
		sum(a,b,c);
	}
	
}*/
/*interface Si2{
	void say();
	
}
/*interface Si3{
	ADD adder(int a,int b,int c);
}
interface Si4{
	Integer adder(int a,int b,int c);
}*/