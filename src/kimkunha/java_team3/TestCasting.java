package java_team3;

/**
 *	casting ���δٸ� ������ Ÿ������ �Ͻ������� ��ȯ�Ͽ� ���
 * @author KIM
 */
public class TestCasting {

	public static void main(String[] args) {
		byte b=10;
		int i=20;
		long l=30;
		System.out.println("����Ʈ b �ǰ� : "+b+" + ��Ʈ i �� �� "+i+" = "+(i+b));
		//�������� ũ�Ⱑ �ٸ��� ������ �Ǵ������� byte�� ���� int�� ũ��� ����ȯ�� �Ǿ ������ �Ȱ��̴�.
		//int ũ�� 4by��  byte, short���� ũ�Ⱑ Ŀ�� �ڹٰ���ӽſ��� �ڵ����� ����ȯ�� ���־� ���� ���ľ��� ��밡��
		//����� �� ���������� ũ�Ⱑ ū������ �Ǽ� ���갡��, �⺻�������� ������ �����ϴ�.
		System.out.println("��Ʈ i �ǰ� : "+i+" + �� l �� �� "+l+" = "+(i+l)); //long Ÿ������ �����
		
		//����ȯ ���
		//int�� ���� byte������ �־��ٶ��� ������ �տ� ���� ������ Ÿ�Կ� ������� �Ѵ� 
		//boolean�� ������ ������ Ÿ�Ե��� ����ȯ�� �����ϴ�  
//		b=i; X������
		b=(byte)i;    
		i=(int)l;
		//�Ǽ����� ���������� casting�Ұ�� int�� �������̶� �Ҽ����� ���󰣴�
		double d=114.1231;
		i=(int)d;
		System.out.println(i);
		
	}//main
	
}
