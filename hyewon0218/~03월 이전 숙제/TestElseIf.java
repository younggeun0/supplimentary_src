package HomeWork;

public class TestElseIf {

	public static void main(String[] args) {
		
		int i=Integer.parseInt(args[0]);
		
		System.out.println(i+"��(��)");
		if(i < 0) {
			System.out.println("0���� �۾Ƽ� ����");
		}else if (i > 100) {
			System.out.println("100���� Ŀ�� ����");
		}else {
			System.out.println("�Է¼���");
		}//end else
	
	}//main

}//class
