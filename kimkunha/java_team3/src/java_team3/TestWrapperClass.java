package java_team3;

/**
 *	�⺻�������͸� �����������ͷ� ����Ҽ� �ְ� ��ü�� ���
 *	�⺻�������͵��� ��ü������ ���Ǿ�� �� ��� 
 * @author KIM
 */
public class TestWrapperClass {
	
	public static Integer integer1=100;
	public static Integer integer2;
	public TestWrapperClass() {
		System.out.println(integer1);
		System.out.println(integer2); //��ü�� �ʱⰪ null
	}
	
	public static void main(String[] args) {
		new TestWrapperClass();
	}//main

}//class
