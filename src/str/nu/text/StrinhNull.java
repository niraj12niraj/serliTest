package str.nu.text;

public class StrinhNull {
	public static void main(String[] args) {
		new A(null);
		
	}
	

}
class A{
	A(Object obj){
		System.out.println("obj "+obj);
	}
	/*A(String str){
		System.out.println("str"+str);
	}*/
	/*A(Integer i){
		System.out.println("integer "+i);
	}*/
	/*A(Character c){
		System.out.println("char "+c);
	}*/
	A(Double d){
		System.out.println("double "+d);
	}
}
