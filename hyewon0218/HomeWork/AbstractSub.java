package HomeWork;

public class AbstractSub extends AbstractSuper{
	
	public void subMethod() {
		System.out.println("�ڽ� method!!!!!");
	}
	
	@Override
	
	public  void absMethod() {
		System.out.println("Override�� �ڽ��� absMethod");
	}
	@Override
	public  String absMethod1(int param_i) {
		return String.valueOf(param_i).concat("- �ڽ�");
	}
	
	
	public static void main(String[] args) {
		AbstractSub as =new AbstractSub();
		as.i=12;
		as.method();
		
		as.absMethod();
		System.out.println(as.absMethod1(3));
		as.subMethod();
		
		AbstractSuper as1=new AbstractSub();
		as1.i=100;
		as1.method();
		as1.absMethod();
		System.out.println(as1.absMethod1(2018));
		
	
	}//main

}
