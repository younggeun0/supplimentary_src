package java_team3;

/**
 *	Ŭ������ ������������, ��������� �ڷ��� 2������ �����°� ������
 *	������ �������� : ��ü�� �����Ͽ� ���
 *	Ŭ������ ����ϱ� ���ؼ��� heap �޸𸮿� ��ü�� �ø��°� ����
 *	��ü�� ����Ϸ��� ��üȭ�� �ؾ� �Ѵ�
 *	
 * 
 * @author KIM
 */
public class TestClass {

	public TestClass() {
	}

	public void classMethod() {
		
	}
	public static void main(String[] args) {
		//��üȭ�� 5���� ���
		//1. Ŭ���� ��ü�� = new ������ ��ü������ ���� ��� ��밡��
			TestClass tc=new TestClass();
		//2. new ������
			new TestClass();	//��üȭ�� ����� �����°�� methodȣ��X
		//3. new ������.method��
			new TestClass().classMethod(); //��üȭ �� method�ϳ��� ȣ���Ͽ� �����ϴ°��
		//4. is a ������ ��üȭ
			//�θ����̺�� ��ü�� =new �ڽ����̺�� �ڽ� ������
		//5.innerclass ��üȭ	
			//�ٱ�Ŭ������.����Ŭ������ ��ü�� =�ٱ�Ŭ�����ǰ�ü��.new ����Ŭ������ ������
			//outer.inner in =out.new inner( );
			
			
			
	}//main

}
