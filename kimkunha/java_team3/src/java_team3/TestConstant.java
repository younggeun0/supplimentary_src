package java_team3;

/**
 *	Constant������ ������� ����ϴ°� �ѹ� �� �Ҵ��ϸ� ���� �Ұ���
 *	�ַ� field���� ���� �Ѵ�.
 *	final Ű���带 �ٿ� ���
 * @author KIM
 */
public class TestConstant {
	//3. ����� �����ڵ� ���� �Ϲ����� ��� �빮�ڷ� ����ϴ°� ��õ�Ѵ�.
	//4. ���������� ����� ��� ����� ����ϴ°��� ����.
	public static final int MAX_VALUE = 100;
	
	public static void main(String[] args) {

		final int i=10;
		int y=20;
		System.out.println(i);
		//1. �ѹ� �� �Ҵ��ϸ� �� ���� �Ұ���
//		int i=20;
//		y=30; //�� ���氡��
		//2. ����� class field���� ������ ����ϴ°��� �ٶ����ϴ�.
		
		System.out.println(MAX_VALUE);
		
	}//main

}//class
