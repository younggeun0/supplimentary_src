package java_team3;

/**
 *	������ : ��������� �ٸ��� ����ϴ� ��
 * 				method ������, ��ü ������, 
 * 	method ������ : ���� �̸��� method�� �ٸ��� ����ϴ°� overload, override ����
 * 		
 * overload : ���� ������ ��ȯ��,  method�� ���� ����� parameter�� �ٸ��� �ۼ�
 * 				���Ǽ��� ������ �ش�.
 * 
 * override :	 ���� ������(������ ����������), ��ȯ��, method�� parameter ���ƾ� �Ѵ�.
 * 				 ���� Ŭ������ �ڿ��� ������ ���� ������ ������ �Ͽ� ����Ҷ�.
 * 
 * 
 * @author KIM
 */
public class TestPolymorphsim {

	
	public void overload() {
		System.out.println("������ �Ͽ���");
	}//overload
	
	//���� ������, ��ȯ��, method�� parameter �ٸ��� 
	public void overload(int i) {
		System.out.println("������"+i+"��"+ "�Ͽ���");
	}//overload
	
	public void override() {
		System.out.println("�θ��� �ڿ� override");
	}//override
	
	
	public static void main(String[] args) {
			TestPolymorphsim tp=new TestPolymorphsim();
			tp.overload();
			//�����ε� ���� �ڵ��� ���뼺�� ���Ǽ��� ��������.
			//���� method���� ��������� method���� �뵵�� �ٸ��� ���Ǹ� ������� �ٸ��� ��Ÿ���� �ִ�.
			tp.overload(13);
	}//main
}//class
