package day0113.weekend.hw;

public class ImplSubClass implements InterfaceSuper {

	private int i;

	public ImplSubClass() {
		System.out.println("인터페이스를 구현한 클래스입니다.");
		i = 1;
	}// 기본생성자

	@Override
	public void interSuper_Method() {
		System.out.println("인터페이스 InterfaceSuper의 메소드 오버라이딩입니다.");
	}// interSuper_Method

	public static void main(String[] args) {

		ImplSubClass isc = new ImplSubClass();
		System.out.println("인터페이스 구현클래스의 맴버변수 : " + isc.i);
		isc.interSuper_Method();// 오버라이딩한 메소드 사용.
		System.out.println(InterfaceSuper.INTERSUPER_CONSTANT); // 인터페이스의 상수 값 출력

	}// main

}// class
