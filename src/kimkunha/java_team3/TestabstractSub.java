package java_team3;

/**
 *	�߻�Ŭ������ ��ӹ��� �ڽ� Ŭ����
 *	�ڽ��� �θ�Ŭ������ �߻�method�� �����ؾ� �� �ǹ��� �ִ�.
 * @author KIM
 */
public class TestabstractSub extends TestAbstract {

	
	public TestabstractSub() {
		super();
	}//������
	
	

	@Override
	public void study() {
		System.out.println("�ڽ��� �ݵ�� �θ��� �߻� method�� �����Ͽ��� �Ѵ�.");
	}

	@Override
	public String study(int i) {
		String msg;
		return msg=i+"�� �� �ְ� �ü��̴� �������̴�.";
	}
	
	
	public static void main(String[] args) {
		TestabstractSub tbs=new TestabstractSub();// 
		//�θ��� �����ڿ� �ڿ�(����, �޼ҵ� ��밡��)
		System.out.println(tbs.age);
		System.out.println(tbs.ssn);
		System.out.println(tbs.play(5000));
		
		tbs.study();
		System.out.println(tbs.study(300));
		
		
//		TestAbstract tb=new TestAbstract() is a ������ ��üȭ �����ϴ�.
			
			
		
	}//main

}//end 