package day0114;

public class IsA_Sub extends IsA_Super {
	
	@Override
	public void parentMe() {
		System.out.println("�θ� �޼��� �������̵� ");
	}
	
	public void subMe() {
		System.out.println("�ڽ� Ŭ������ �޼��� ");
		
		
		
	}
	
	
	public static void main(String[] args) { //IsA ����
		
		IsA_Super sp = new IsA_Sub();// �ڽ��� �θ��̴�
		//�ڽ� Ŭ������ �θ� Ŭ������ ��üȭ ����⶧���� �ڽ� �޼��忡�� �������ִ� subMe�޼���� ����� �� ����.
		sp.parentMe();
		sp.parentMe();
		
		IsA_Sub sb = new IsA_Sub();
		sb.subMe();
		sb.parentMe();
		
//		IsA_Sub sb2 = new IsA_Super(); 
		//�θ� Ŭ������ �ڽ� Ŭ������ ��üȭ ���� �� ����.
		
		
		
		
		
		
		
	}
	
	
	
}
