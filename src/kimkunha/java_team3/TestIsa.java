package java_team3;

/**
 *	is a ���� :  �θ� Ŭ������ ��ü�� = new �ڽ� Ŭ������ ������
 *	�ڽ��� �θ� �˱⿡ ��üȭ�� �����ϴ�.
 *	�θ��� �ڿ�(����, method)�� ����Ҽ� �ִ�.
 *	override�� method�� ��� �ڽ���method�� ���� ȣ��ȴ�.
 * @author KIM
 */
public class TestIsa extends TestSub{
	
//	has a����� ��ü�� �޾ƿ� ����Ҽ� �ִ�.
	private TestHasa th;
	
	public TestIsa() {
//		th =new TestHasa();
	}
	
	@Override
	public String eat(int i) {
		String msg=i+"�� �ְ� ����� �Դ´�.";
		
		return msg;
	}//�ڽ� method
	
	@Override
	public String play() {
		String msg=name+"�� ������ �Ѵ�.";
		return msg;
	}//�ڽ� method
	
	public static void main(String[] args) {
		TestSub ts= new TestIsa();
		//�θ� ��ӹ��� ����, method�� ����Ҽ� �ִ�.
		ts.name="¯��";
		ts.age=4;
		
		//�θ��� method�� ����Ѵ�. ���� �ȵ�� Overriding�� �������Ͽ� ���
		ts.eat(500);
		//�θ��� �ڿ� ������ overriding���� �ڽ� method�� ���� ȣ��ȴ�.
		ts.play();
		
		System.out.println(ts.name);
		System.out.println(ts.age);
		System.out.println(ts.eat(6000));
		System.out.println(ts.play());
		
		
		
	}//main

}//class
