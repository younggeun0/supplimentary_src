package HomeWork;

public class CallByReference {
	private int i;
	private int j;
	
	public void swap(CallByReference cbr) {
		int temp=0;
		temp=cbr.i;
		cbr.i=cbr.j;
		cbr.j=temp;
		System.out.println("swap method�� i="+i+",j="+j);
	}
	
	public static void main(String[] args) {
		CallByReference cbr = new CallByReference();
		cbr.i=77;
		cbr.j=33;
		
		
		System.out.println("swap �� �� i="+cbr.i+",j="+cbr.j);
		cbr.swap(cbr);
		System.out.println("swap �� �� i="+cbr.i+",j="+cbr.j);
		
		
	}//main

}//class
