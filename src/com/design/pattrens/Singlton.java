package com.design.pattrens;

public class Singlton {
	private static Singlton instance=null;
	
	private Singlton() {
		
	}
	
	
	public synchronized static Singlton getInstance() {
		
			if(instance==null) {
				instance =new Singlton();
				return instance;
			}
			else
				return instance;
	}
	
	public void testSinglton() {
		System.out.println("testSinglton....."+instance);
	}

}
class AB{
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
	Singlton i1=Singlton.getInstance();
	Singlton i2=Singlton.getInstance();
	//Singlton i3=i2.getClass().newInstance();
	System.out.println(i1.getClass().getName()+" --"+i1);
	System.out.println(i2);
	//System.out.println(i3);
	}
	
}
