package java_team3;

/**
 *	Call by Refernce
 *	�Ű������� ������������(class, array, String)�� �ָ� �ϳ��� �ּҰ��� �״�� �Ѿ��.
 * @author KIM
 */
public class TestCallByReference {
	
	private int num;
	private int num2;
	
	public TestCallByReference(int num, int num2) {
		this.num=num;
		this.num2=num2;
	}
	
	public void swap(TestCallByReference cbr) {
		int temp;
		temp=num;
		num=num2;
		num2=temp;
		System.out.println("method ���ο��� �� num : ="+num+", num2 �� �� : "+num2);
	}
	
	public static void main(String[] args) {
		TestCallByReference tcbr=new TestCallByReference(10, 30);
		
		System.out.println("swap �� �� num = "+tcbr.num+", num2 = "+tcbr.num2);
		tcbr.swap(tcbr);
		System.out.println("swap �� �� num = "+tcbr.num+", num2 = "+tcbr.num2);
		//���� ���� �� ����?
		//ȣ��� ���� �ƴ� �ּҸ� �Ѱ������ν� �ּҸ� �����Ͽ� �� ������ ����
		
		
	}//main

}//class
