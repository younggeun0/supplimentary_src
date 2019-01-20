package HomeWork;

public class TestConstructor {

	public TestConstructor() {
		System.out.println("기본 생성자");
	}
	
	public TestConstructor(int i) {
		System.out.println("인자 있는 생성자:"+i);
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
