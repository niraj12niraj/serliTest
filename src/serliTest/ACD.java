package serliTest;

public class ACD {
	
	public ACD() {
		System.out.println("Default Constructor");
	}
public static void main(String[] args) {
	AC1 ac=ACD::new;
	ac.say();
	
}
}
@FunctionalInterface
interface AC1{
	public void say();
}

