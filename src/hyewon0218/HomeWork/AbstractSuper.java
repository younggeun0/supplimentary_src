package HomeWork;


public abstract class AbstractSuper {
	int i;
	
	public AbstractSuper() {
		System.out.println("AbstractSuper 부모 생성자");
	}	
	public void method() {
	 System.out.println("부모 일을 하는 일반 method");	
	}
	public abstract void absMethod(); 
	public abstract String absMethod1(int i);
	
	}


