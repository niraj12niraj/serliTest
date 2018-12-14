package Java8_Interface;

interface F{
	//public int show1(int a, int b);
	default int sum(int c,int d) {
		System.out.println("interface F");
		return c+d;
	}

}

interface H extends F{
	//public int show();
	default int sum(int c,int d) {
		System.out.println("interface H");
		return c+d;
	}

}

class AC implements F{

	@Override
	public int sum(int c, int d) {
		sum(c,d);
		// TODO Auto-generated method stub
		System.out.println("AC");
		return 0;
	}
	
	public static void main(String[] args) {
		/*H h=new AC();
		h.sum(1, 2);
		
		F f=new AC();
		f.sum(1, 2);	*/
		AC a=new AC();
		a.sum(12,10);
		//((H)a).sum(12,10);
			
		
		
	}
	
}
class AO{
	public AO() {
		System.out.println("AO");
	}
}
interface AOI{
	AO getList();
}