package HomeWork;

/**
 * interface�� �����ϴ� class (�ڽ� Ŭ�����̰� interface���� ��� �߻�method�� Override�ϴ� Ŭ����)
 * ���� interface�� �θ� interface�� �����ٸ� �������� �ڽ�Ŭ���������� 
 * ��� �߻� method�� �����ؾ� �Ѵ�.
 * @author SIST
 */
public class InterfaceImpl implements SuperInterface {

	@Override	
	public String msg() {
		return "������ ������";
	}
	@Override
	public String msgB() {
		return "������ �Ͽ���";
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
