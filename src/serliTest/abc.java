package serliTest;


//there is no any .class file is created for Lambda Expression which provide replacement of ANANOMUS and reusability of ANANOMUS  
@FunctionalInterface
public interface abc {
	public void doWork();

}

@FunctionalInterface
interface A {
	public int show(int a,int b);

	public default void test() {
	}

	public static void s() {
	}
}

@FunctionalInterface
interface C {
	public int show(int a, int b);

	public default void test() {
	}

	public static void s() {

	}
}

@FunctionalInterface
interface D {
	public int show1(int a, int b);

	public default void test() {
	}

	public static void s() {

	}
} 
interface E{
	public int show1(int a, int b);
}
interface F{
	public int show1(int a, int b);
	default int sum(int c,int d) {
		System.out.println("C+D "+(c+d));
		return c+d;
	}
	default void s(int c,int d) {
		System.out.println("C+D "+(c+d));
		
	}
}

interface H{
	public int show();
	default int sum(int c,int d) {
		System.out.println("C+D "+(c+d));
		return c+d;
	}
	default void s(int c,int d) {
		System.out.println("C+D "+(c+d));
		
	}
}
interface I{
	public int show();
	public static int sum(int c,int d) {
		System.out.println("C+D "+(c+d));
		return c+d;
	}
	default void s(int c,int d) {
		System.out.println("C+D "+(c+d));
		
	}
}
interface G extends A,C{

	@Override
	default void test() {
		// TODO Auto-generated method stub
		
	}
	default int x(int a) {
		return 0;
	}
	public static void main(String[] args) {
		int c;
		G g=(a,b)->{System.out.println("show--"+(a+b));return a+b;};
		g.show(10, 12);
	//	G g1=x(c) -> {System.out.println();return (c*c);};
	}
	
}
class AB implements A,C,D{
	int a=10,b=12;
	@Override
	public int show(int a,int b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub

	}
	@Override
	public int show1(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
	A s=(int a,int b)->a+b;
	
	C c=(int a,int b)->a*b;
	
	C c1=(int e,int f)->{System.out.println("product c1");return e*f ;};
	
	D d=(int a,int b)->{System.out.println("Product d");return a*b;};
	public void show2() {
		int ans1=s.show(a, b);
		int ans2=c.show(a, b);
		System.out.println("Ans1-"+ans1+" Ans2-"+ans2);
	}
	
	
	public static void main(String[] args) {
		AB aa=new AB();
		aa.show2();
		aa.show1(7, 5);
	F d1=new F() {	
		public int show1(int a, int b) {
			System.out.println("F-show1()--"+(a+b));
			return a+b;
		}
		
	};
	d1.show1(14,45);
	E e1=(a,b)->{System.out.println("E show1()--");return a+b;};
		e1.show1(14, 12);
		d1.show1(12, 15);
		E e2=(a,b)->{return a+b;};
		e2.show1(10, 10);
		E e3=(a,b)->(a+b);
		e3.show1(10, 10);
		//(e3)->{System.out.println("")};
	}
	F f1=(c,d)->{System.out.println("C+D-- "+c+d); return (c+d);};
	//H h1=(c,d)->{System.out.println("C+D-- "+c+d); return 0;};//default
	//I i1=(c,d)->{System.out.println("C+D-- "+c+d); return 0;};//static
	
	A a1=(int a,int b)->{
		return a;};
	C c2=(int a,int b)->{
		return a;};

}

//default
class AC implements F,H{

	@Override
	public int show() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int show1(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int sum(int c, int d) {
		// TODO Auto-generated method stub
		return F.super.sum(c, d);
	}

	@Override
	public void s(int c, int d) {
		// TODO Auto-generated method stub
		F.super.s(c, d);
	}
	
	
}
class AD implements I1{	
}

class AE implements I1,I2{	
}
interface I1{
	default void show() {
		System.out.println("I1--show");
	}
}
interface I2 extends I1{}
	
interface I3{
	default void show() {
		System.out.println("I3--show");
	}
}
interface I4 extends I3{
	default void show() {
		System.out.println("I4--show");
	}
}

class AF implements I3,I4{	
}



//static and default
class AG implements I5,I6,I7{	
}

interface I5{
	default void show() {
		System.out.println("I3--default show");
	}
}
interface I6 {
	public static void show1() {
		System.out.println("I4--static show");
	}
	
}
interface I7 {
	public static int show1() {
		System.out.println("I4--static show");
		return 0;
	}
}



