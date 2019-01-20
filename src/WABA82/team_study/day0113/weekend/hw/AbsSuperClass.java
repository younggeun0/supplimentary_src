package day0113.weekend.hw;

/**
 * 추상클래스 : 추상메소드를 가지는 메소드입니다.<br>
 * 
 * 추상클래스 특징> : 추상클래스는 상속을 목적으로 만드는 클래스입니다. - 객체화를 할 수 없습니다.<br>
 * 추상메소드를 반드시 구현해야 합니다.<br>
 * 추상클래스는 추상메소드를 가지고 있습니다.<br>
 */
public abstract class AbsSuperClass {

	int i; // 추상메소드는 맴버변수를 가질 수 있다.

	public AbsSuperClass() {
		System.out.println("추상메소드의 생성자는 서브클래스의 객체가 생성될 때 먼저 호출됩니다.");
	}// 기본생성자

	public void normal_Method() {
		System.out.println("추상메소드는 일반메소드를 가질 수 있습니다.");
	}// normal_Method

	public abstract void abs_Mthod();/* 추상메소드 : body의 구현은 서브클래스에서 오버라이딩을 통해 구현합니다. */

}// class
