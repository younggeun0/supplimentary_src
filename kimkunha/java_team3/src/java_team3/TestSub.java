package java_team3;

/**
 *	TestInheritance�� ��������� �ڽ� Ŭ����
 *	�ڽ��� �θ����ڿ�(����, method)�� ����Ҽ� �ִ�.
 *	 @author KIM
 */
public class TestSub extends TestInheritance {
	
	public String eat(int i) {
		String msg =i+"�� ���ְ� ���� �Դ´�.";
		
		return msg;
	}//eat

	public static void main(String[] args) {

		TestSub ts =new TestSub();
		//�θ��� �ν��Ͻ� ����
		ts.name="ö��";	
		ts.age=5;	
		
		//�θ��� method
		ts.play();
		
		System.out.println(ts.name);
		System.out.println(ts.age);
		
		System.out.println(ts.play());
		System.out.println(ts.play("��"));
	}//main

}//class
