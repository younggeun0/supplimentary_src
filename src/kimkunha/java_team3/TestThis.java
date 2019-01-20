package java_team3;

/**
 *	method���� this
 *	�������� �̸����� Ŭ������ ��� this���
 *	�� Ŭ������ �����ε� �� �����ڸ� ȣ���Ҷ� ��� this()
 *	�� �����ڿ��� �ٸ� �����ڸ� ȣ���Ҷ� �ݵ�� ù�ٿ����� ȣ���� �����ϴ�.this
 *
 * @author KIM
 */
public class TestThis {
	
	public String color;
	public String gearType;
	public int door;

	public TestThis(String color, String gearType, int door) {
		//this�� ����Ͽ� this.color�� �ν��Ͻ�����  /  color�� �Ű������� ���ǵ� ���������� ������ �����ϴ�.
		//this�� static���� ������ ����� �Ұ�.
		//this , this()�� �ٸ���
		//this�� ���������� �ڽ��� ����Ų��.
		this.color=color;
		this.gearType=gearType;
		this.door=door;
	}
	
	public TestThis() {									//3.���� ���� �����ڷ� �ͼ� �����ϰ� } <- �� ȣ��Ȱ����� ���ư���.
		this("�ȳ�",10);
		System.out.println("���� ���� ������");
	}
	
	public TestThis(int i) {								//2. �Ű����� �ִ� �����ڷ� ȣ��Ǿ�����
		this();												//		this(); ���� ���� �����ڷ� ȣ�� �϶�� ��ɾ�
		System.out.println("���� �ϳ� �ִ� ������");//4. ���ƿͼ� ���� ���� 
	}															
															
	public TestThis(String str, int i) {
//		this();											//ȣ��Ȱ����� �ٽ� �θ��� ���ѷ����� error
		System.out.println("���� �ΰ� �ִ� ������");
	}
	

	public static void main(String[] args) {
//		TestThis tt = new TestThis("white","auto",4);	//this�� ���
		new TestThis(20); //1. �Ű����� �ִ� ������ ȣ�� this();�� �������� ù��° �ٿ����� ���� ����
		
	}//main

}
