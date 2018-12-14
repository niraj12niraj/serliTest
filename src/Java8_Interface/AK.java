package Java8_Interface;


interface AI{
	default void m1() {
		System.out.println("AI-m1()");
	}
}
interface AI1{
	default void m1() {
		System.out.println("AI1-m1()");
	}
}

public class AK implements AI,AI1{
	public void m1(){
		AI.super.m1();
		AI1.super.m1();
		//m1();  //AI-m1() Exception in thread "main" java.lang.StackOverflowError
		System.out.println("AK-m1()");
	}
	public static void main(String[] args) {
		AK a=new AK();
		//a.m1();
		((AI)a).m1();
		//((AI1)a).m1();		
	}

}

class AL implements AI3{
	
	public static void main(String[] args) {
		AL a=new AL();
		a.m1();	
	}
	public void m1() {
		AI3.super.m1();
	}

}
interface AI4{
	default void m1() {
		System.out.println("AI4");
	}
}
interface AI2 extends AI4{
	
}
interface AI3 extends AI4{
	
}