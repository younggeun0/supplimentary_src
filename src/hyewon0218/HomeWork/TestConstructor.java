package HomeWork;

public class TestConstructor {

	public TestConstructor() {
		System.out.println("�⺻ ������");
	}
	
	public TestConstructor(int i) {
		System.out.println("���� �ִ� ������:"+i);
	}
	
	public void test() {
		System.out.println("test method!!!");
		temp();
		
	}
	public void temp() {
			System.out.println("-------------temp method!!!");
	}
	
	public static void main(String[] args) {
		TestConstructor tc = new TestConstructor();
		TestConstructor tc1 = new TestConstructor(26);

		tc.test();
		
	}//main

}//class
