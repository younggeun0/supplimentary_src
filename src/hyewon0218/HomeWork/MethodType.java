package HomeWork;

public class MethodType {

	public void typeA() {
		System.out.println("��������");
	}//typeA
	
	public void typeB(int i) {
		System.out.println(i+"���Դϴ�");
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
		 	System.out.println("�¾ ��.�� : "+i);
		 	int j=mt.typeD(99.9999);
		 	System.out.println(j);
	}//main

}//class
