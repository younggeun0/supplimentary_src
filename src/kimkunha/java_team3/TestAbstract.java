package java_team3;

/**
 *	����� ���� ����� Ŭ���� �̴�.
 *	�߻�Ŭ������ ��üȭ�� �Ҽ� ����. ������ is a����� ��üȭ�� �����ϴ�
 *	�߻�method�� ������ �ڽ� Ŭ������ �ݵ�� �������̵����� �����Ͽ��� �Ѵ�
 *	Ű����� abstract
 *	���������� abstract Ŭ������
 *	���������� abstract ��ȯ��, method�� ( ) ; ��ȯ���� �Ű������� ������ �ִ�.
 *	�߻�method : �ٵ� ����. ���� �Ҽ�����. �׷��Ƿ� �ڽ�Ŭ������ �ݵ�� �̰��� �����ؾ��ϴ� �ǹ��� �ִ�.
 *
 * @author KIM
 */
public abstract class TestAbstract  {
	
	//�θ��� �ڿ�(����, method ����Ҽ� �ִ�)
	public String ssn="����";
	public int age=5;
	
	public String play(int eat) {
		String msg;
		return msg=eat+"�ְ� ���� �Դ´�";
	}//method
	
	//�����ڵ� ������ �ִ�.
	public TestAbstract() {
		System.out.println("�θ��� ������ �Դϴ�.");
	};
	
	public abstract void study() ;
	public abstract String  study(int i) ; //�����ε� ����
	
	public static void main(String[] args) {

	}

}
