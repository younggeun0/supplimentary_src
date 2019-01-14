package HomeWork;

public class MethodType {

	public void typeA() {
		System.out.println("최혜원은");
	}//typeA
	
	public void typeB(int i) {
		System.out.println(i+"번입니다");
	}//typeB
	
	public double typeC() {

		return 1994.2;
	}//typeC
	
	public int typeD(double d) {

		int i=(int)d;
		
		return i;
	}//typeD
	
	public static void main(String[] args) {
		
		MethodType mt = new MethodType();
		 	mt.typeA();
		 	mt.typeB(155);
		 	double i= mt.typeC();
		 	System.out.println("태어난 년.월 : "+i);
		 	int j=mt.typeD(99.9999);
		 	System.out.println(j);
	}//main

}//class
