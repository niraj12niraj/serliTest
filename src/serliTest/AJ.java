package serliTest;


public class AJ implements I9,I8 {
	public void m1() {
		//m1();
		System.out.println("AJ");
	}

	public static void main(String[] args) {
		AJ a=new AJ();
		//a.m1();
	 I9 i=()->{a.m1();};	
	 i.m1();
	 ((I9)a).m1();
	 I8 i1=()->{};	
	 i1.m1();
	 //((I8)a).m1();

	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}

}

@FunctionalInterface
interface I9{
	default void m1() {
		System.out.println("I9");
	}
	void m2();
}

interface I8 {
	default void m1() {
		System.out.println("I8");
	}
	void m3();
}