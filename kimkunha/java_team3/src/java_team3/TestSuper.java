package java_team3;

/**
 *	��� �������� ù��° �ٿ��� �θ� Ŭ������ �⺻ �����ڸ� ȣ���ϴ� super�� ������ �ִ�.
 *	super�� method���İ� keyword ���� �ΰ����� ����� �����ϴ�
 *	method���� :
 *	�θ�Ŭ������ �����ڸ� ȣ���Ҽ� �ִ� �������� ù��° �ٿ� �����Ҽ��ִ�. this()�ϰ� ���� ������.
 *	super�� this�� �ٺ������� ����.
 *
 * @author KIM
 */
public class TestSuper {

	public String name;
	public int number;

	public void superMethod() {
		System.out.println("�θ��� ������");
	}
	
	
	public TestSuper() {
		this(10);
		System.out.println("���� ���� ������");
	}
	
	public TestSuper( int i) {
		System.out.println("���� �ִ� �θ� ������ 200");
	}
	
	
//	public static void main(String[] args) {
//		TestSuper ts=new TestSuper();
		
//	}//main

}//class
