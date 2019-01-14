package day0113.weekend.hw;

/**
 * 추상서브클래스 : 추상클래스를 상속받고 수퍼클래스의 추상메소드를 반드시 구현합니다.<br>
 */
public class AbsSubClass extends AbsSuperClass {

	public AbsSubClass() {
		System.out.println("추상메소드를 상속받은 서브클래스 입니다.");
	}// AbsSubClass

	@Override
	public void abs_Mthod() {
		System.out.println("AbsSuperClass의 추상메소드를 AbsSubClass에서 구현합니다.");
	}// abs_Mthod

	public static void main(String[] args) {
		AbsSubClass subclass = new AbsSubClass(); // 추상클래스를 상속받은 서브클래스는 객체가 생성될 때 수퍼클래스의 생성자를 먼저 호출합니다.

		subclass.i = 12; // 서브클래스는 수퍼클래스의 자원을 모두 사용할 수 있습니다.
	}// main

}// class
