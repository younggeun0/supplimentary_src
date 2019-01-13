package HomeWork;


public class UseStaticVariable {
	static int i;
	int j;
	
	

	public static void main(String[] args) {
		UseStaticVariable.i=2000;
		System.out.println(UseStaticVariable.i);
		
		UseStaticVariable usv=new UseStaticVariable();
		UseStaticVariable usv1=new UseStaticVariable();
		usv.j=5000; 
		usv1.j=10000;
		
		UseStaticVariable.i=20;
		

		System.out.println("usv객체 인스턴스변수 :"+ usv.j+", 스태틱변수 :"+UseStaticVariable.i);
		System.out.println("usv1객체 인스턴스변수 :"+ usv1.j+", 스태틱변수 :"+UseStaticVariable.i);
		
		i=100;//어디에서든 사용가능
//		j=200;
//		System.out.println(i+"/"+j);
		
	}//main

}//class
