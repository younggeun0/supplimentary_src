package java_team3;

public class TestOverride extends TestPolymorphsim {
	
	//�θ��� �ڿ��� ����ϱ� ���� ��ӹ޴´�.
	//����������, ��ȯ��, method��, parameter �����Ѵ�.
	@Override	//anotaion�� ����� overriding �Ѱɷ� ǥ�����ش�.
	public void override() {
		System.out.println("���� �ڽ��Դϴ�.");
	}//override

	public static void main(String[] args) {
		TestOverride to=new TestOverride();
		//�θ��� �ڿ� method�� ���� ���� �����Ͽ� �ڵ��� �� ��뼺�� ������.
		to.override();
	}//main
}//class
