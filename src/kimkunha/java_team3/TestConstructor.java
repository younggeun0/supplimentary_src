package java_team3;

/**
 * 	��ü�� �����ɶ� �⺻���� ������ �־�� �� �ʱⰪ
 * 	��ȯ���� ������ Ŭ������ �� �����ϰ� �����
 * 	�����ε��� �����Ѵ�.
 *	�����ڴ� compiler�� �⺻���� ���� ���ش�
 *	�����ִ� �����ڷ� ����� ����
 * @author KIM
 */
public class TestConstructor {

	public String name;
	public int age;
	
	//�⺻ ������
	public TestConstructor(  ) {
	}
	
	//�����ִ� ������
	public TestConstructor( String s, int i ) {
		//1.
				name = s;
				age = i;
		
	//3.		this�� ����ϴ°��� ���� ����.
		//		this.name=name;
		//		this.age=age;
	}
	public static void main(String[] args) {
		TestConstructor tc1=new TestConstructor("¯��",5);//1. �����ڿ��� �ٷ� ���� �־ ����
				//this�� ����Ͽ� �����ϰ� �� �Է� 
				System.out.println(tc1.name+" / "+tc1.age);
		
				TestConstructor tc2=new TestConstructor();//2.�ڵ尡 ������� ����.
				tc2.name="¯��";
				tc2.age=5;
				System.out.println(tc2.name+" / "+tc2.age);
	}//main

}//class
