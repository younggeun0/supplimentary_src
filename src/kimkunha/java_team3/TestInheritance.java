package java_team3;

/**
 *	��� : �θ�Ŭ������ �ڿ�(����, method) �� �ڽ�Ŭ�������� �ڽ��� ��ó�� ����ϴ°�. (�ڵ��� ���뼺)
 *			������ : private�� ���� ����. public���, ���ϻ�Ӹ� �Ҽ� �ִ�. ���߻�� �Ұ���
 *					   �����ڴ� ����Ҽ� ����.
 *			�θ�� �ڽ��� �˼� ����. 
 *
 *	super : �θ�Ŭ������ �ڿ��� �ڽ�
 * @author KIM
 */
public class TestInheritance {

	public String name;
	public int age;
	
	public String play() {
		String msg=name+"�� ���θ� �Ѵ�.";
		return msg;
	}
	
	//Overload
	public String play(String str) {
		String msg="";
		return msg=name+"��"+str+"�� �����鼭 �����Ѵ�.";
	}
	
	public static void main(String[] args) {

		
	}//main

}//class
