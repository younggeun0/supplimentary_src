package HomeWork;

/**
 * interface를 구현하는 class (자식 클래스이고 interface내에 모든 추상method를 Override하는 클래스)
 * 구현 interface가 부모 interface를 가진다면 최종적인 자식클래스에서는 
 * 모든 추상 method를 구현해야 한다.
 * @author SIST
 */
public class InterfaceImpl implements SuperInterface {

	@Override	
	public String msg() {
		return "내일은 월요일";
	}
	@Override
	public String msgB() {
		return "오늘은 일요일";
	}
	
    @Override
	public void methodA() {
		System.out.println("methodA");
	}

	@Override
	public void methodB(int i) {
		System.out.println("methodB");
		
	}
	public void test() {
		
	}
	
	public static void main(String[] args) {
		InterfaceImpl ii=new InterfaceImpl();
		ii.methodB(12);

		SuperInterface si=new InterfaceImpl();
		System.out.println(si.msg());
		
		InterA ia=new InterfaceImpl();
		System.out.println(ia.msg());
		
		InterB ib=new InterfaceImpl();
		System.out.println(ib.msgB());
		
	}// main
}// class
