package java_team3;

/**
 *	�������̽��� �����ؾ� �ϴ�  Ŭ����
 *	Ű���尡 implements
 *	�����ؾ��ϴ� �������̽��� �θ� ��ӹް� �ִٸ� �� �θ���� ���� �߻�method�� �����ؾ��ϴ� �ǹ��� �ִ�.
 * @author KIM
 */
public class TestInterfacesub implements TestInterface {

	//�����ؾ� �ϴ� �߻�method�� Overriding�ؾ��ϴ� �ǹ��� ����.
	@Override
	public void eat() {
		System.out.println("����Ŵϴ�.");
	}
	
	public static void main(String[] args) {
		TestInterfacesub tf=new TestInterfacesub();
		tf.eat();
	}//main

}//class
