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
		

		System.out.println("usv��ü �ν��Ͻ����� :"+ usv.j+", ����ƽ���� :"+UseStaticVariable.i);
		System.out.println("usv1��ü �ν��Ͻ����� :"+ usv1.j+", ����ƽ���� :"+UseStaticVariable.i);
		
		i=100;//��𿡼��� ��밡��
//		j=200;
//		System.out.println(i+"/"+j);
		
	}//main

}//class
