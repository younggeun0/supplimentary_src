package java_team3;

/**
 *	 is a ����� �θ� ��ӹ޾Ƽ� ��üȭ�� �ϴ°�������
 *	 has a ����� ��ü�� �޾Ƽ� �� Ŭ������ �ڿ��� ����ϼ� �ִ�.
 *	has a����� ��ӹ޴°��� �ƴ϶� Ŭ���� �ʵ忡�� �ν��Ͻ��� ���� �����Ͽ� ����Ͽ��� �Ѵ�.
 *	�ַ� ������ �ȿ� �ִµ�.
 *
 * @author KIM
 */
public class TestHasa {

	private TestIsa ti;
	public String gun;
	
	public TestHasa() {
		ti=new TestIsa();
	}
	
	public String play() {
		return ti.eat(5000); 
			//has a ����� testisa�� �ڿ��� ���	
			//��ȯ���� ���� ������� �Ѵ�.
	}
	
	
	public static void main(String[] args) {
		TestHasa th=new TestHasa();		
		System.out.println(th.play());
		
	}//main

}//class
