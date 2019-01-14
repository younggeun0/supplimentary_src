package day0113.weekend.hw;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

/*
영근 주말 숙제 0113 

데이터형
형변환
상수
래퍼클래스
조건문
반복문
변수 : 데이터(값)을 메모리에 저장하는 공간
메소드 : 함수
다형성 - 오버로딩 : 클래스 안에서 같은 메소드를 새로 정의 하는 것(매개변수만 다르게 작성합니다.)
다형성  - 오버라이딩 : (상속관계)서브클래스에서 수퍼클래스의 메소드를 덮어쓴 메소드.
클래스 : 객체를 생성하기 위한 데이터형(틀)
생성자 : 객체가 생성될 때 실행되는 메소드
this : 객체의 자원과 매개변수, 외부자원을 구분하는 키워드(구분자).
this() : 클래스 내의 생성자를 호출하는 메소드입니다.
call by value : 기본데이터타입의 값 복제하여 사용. 
call by reference : 참조형데이터타입의 주소를 참조하여 값 사용.
배열 : 같은 데이터타입의 데이터(값)을 모아서가지고 있는 참조데이터타입  
2차원배열 : 배열을 가지고 있는 배열을.
상속 : extends 클래스명 - 수퍼클래스의 자원을 사용합니다.
super :  슈퍼클래스의 자원과 서브클래스의 자원을 구분하는 키워드(구분자).
super() : (상속관계)수퍼클래스의 생성자를 호출하는 메소드입니다.
객체다형성 - Is A 관계 : 상속관계
객체다형성 - Has A 관계 : 어떤 클래스가 다른 클래스의 객체를 매개변수로 가지고 생성되는 관계
추상클래스 : 추상메소드(마치 변수를 선언하는 것처럼 메소드를 선언하는 것)를 가지는 클래스 
인터페이스 : 추상메소드와 
*/
@SuppressWarnings("serial")
public class TypeToInterface extends JFrame implements ActionListener { /* 상속 : extends JFrame 자원을 사용합니다. */

	/* 상수(final) : Class Filed에 선언. 변하지 않는 값을 저장합니다(변수와 반대의 개념) */
	/* 전역변수(static) : 사용할 때는 [ 클래스명.OK ]식으로 사용해야 합니다. */
	public static final int OK = 1;
	private String msg; /* 맴버변수 : 객체가 생성될 때 가지고 있는 변수 */
	private int num;

	/**
	 * TypeToInterface 생성자 : 클래스의 객체가 생성될 떄 실행되는 메소드입니다. 주로 클래스의 자원을 초기화합니다.<br>
	 * 
	 * 작성법> : 클래스의 이름과 같은 메소드명을 가지고 있습니다.
	 */
	public TypeToInterface() {
		super("수퍼클래스 JFrame의 매개생성자를 호출합니다.");
		System.out.println(msg);
		num = 0;
	}// 기본생성자

	/**
	 * 매개생성자 : 생성자오버로딩입니다.
	 * 
	 * @param msg
	 */
	public TypeToInterface(String msg) {
		this.msg = msg; /* this키워드 : 외부의 자원과 클래스의 자원을 구분합니다. */
	}// 매개생성자

	/**
	 * call by reference : 객체의 주소를 참조하여 값을 사용합니다.<br>
	 * 
	 * @param callByRef
	 * @param callByRef1
	 */
	public TypeToInterface(int num) {
		this.num = num;
	}// 매개생성자

	/**
	 * 데이터형<br>
	 * 기본데이터형 : 정수, 실수, 문자, 불린형 (문자열, 배열은 참고형_데이터타입 입니다.)
	 */
	public void priDataType() {
		// 정수형 - 초기화 0
		byte b = (byte) 127; /* byte (1 byte) : -128 ~ 127 */
		short s = (short) 32767; /* short (2 byte): -32,768 ~ 32,767 */
		int i = 214748367; /* int (4 byte) : -2,147,483,648~2,147,483,647 */
		long l = 9223372036854775807L; /* long (8 byte) : -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807 */
		System.out.println("정수 양수 범위 " + "byte : " + b + "short : " + s + "int : " + i + "long : " + l);

		// 문자형 : '\u0000'로 초기화
		char c = 66; // 유니코드 65 = A
		char c1 = '0';
		char c2 = '가';
		System.out.println("char : " + c + ", " + c1 + ", " + c2);

		// 실수형 :
		float ft = 3.14F; // 형명시 - 우항(실수의 literal은 8byte)이고 좌항(float 데이터형은 4byte이므로) 값 할당을 위해 형명시를 한다.
		double db = 3.14D; // 우항의 값과 좌항의 literal이 같으므로 생략이 가능하다.
		System.out.println("float : " + ft);
		System.out.println("double : " + db);

		// 불린형
		boolean t = true;
		boolean f = false;
		System.out.println("BOOLEAN : " + t + ", " + f);
	}// dataType

	/**
	 * 형변환<br>
	 * 
	 * 자동형변환 : 자바에서 int값 이하의 데이터형을 연산하면 자동으로 int데이터타입으로 변환해 주는 것.<br>
	 * 강제형변환 : 변수의 데이터형을 일시적으로 변환하여 사용하는 것.<br>
	 * 
	 * 주의 : 형변환은 작은자료형에서 큰자료형으로만 가능하다.<br>
	 * 형변환이 가능한 순서 : byte -> short / char -> int -> long -> float -> double
	 */
	public void useCasting() {
		byte b = (byte) 10; // 리터럴의 값의 기본 : 정수일 때 int(4byte), 실수일 때 double(8byte)
		long l = 2147483648L; // 형명시 : (int의 값을 넘어간 값); 4byte가 literal에 저장이 되지 않으므로 literal의 크기를 변경.
		System.out.println("byte b의 리터럴은 (byte)로 캐스팅 되었습니다 : " + b);
		System.out.println("long l의 리터럴은 int형의 수용범위를 넘었기 때문에 형명시를 했습니다 : " + l);
	}// useCasting

	/**
	 * 래퍼클래스 : 기본데이터타입을 감싸는 참고형데이터타입 입니다.<br>
	 * Byte, Short, Integer, Long, Float, Double, Character, Boolean
	 */
	public void useWrapperClass() {

		Integer num = new Integer(10);
		Character ch = new Character('c');

		boolean integerFlag = num.equals(1); // 래퍼클래스는 주소를 참조하기 때문에 ==을 사용할 수 없습니다.
		boolean characterFlag = ch.equals('a'); // 래퍼클래스는 주소를 참조하기 때문에 ==을 사용할 수 없습니다.

		System.out.println(integerFlag); // false 반화
		System.out.println(characterFlag); // false 반환

	}// useWrapperClass

	/**
	 * 조건문 : 조건에 따라 다른 결과를 얻고자 할 때.<br>
	 * 조건문 종류 : if, else, else if, switch<br>
	 * 
	 * if 계열 - boolean형을 사용합니다. switch 계열 - 주로 정수를 비교하기 위해 사용하고, 값에 따라 여러 결과를 도출할 때
	 * 사용합니다.
	 */
	public void conditionalStmt() {

		boolean flag = false; // 조건문에는 boolean형이 들어갑니다.

		if (!flag) {
			System.out.println("if문 입니다.");
		} // end if

		if (flag) {
			System.out.println("else문 입니다.");
		} else {
			System.out.println("if의 조건에 맞지않을 때 수행 합니다. else문 입니다.");
		} // else

		if (flag) {
			System.out.println("else if문 입니다.");
		} else if (flag) {
			System.out.println("첫 번째 if조건에 맞지 않을 때, 다음 조건을 수행합니다. else if문 입니다.");
		} // end else if

	}// useIf

	/**
	 * 반복문 : 반복 수행한 결과를 얻고자 할 때.<br>
	 * 반복문 종류 : for, each~for, while, do~while
	 * 
	 * for 계열 - 반복문이 종료되는 시점이 명확합니다. while 계열 - 종료시점을 예측할 수 없을 때 사용합니다.
	 */
	public void repetiveStmt() {

		for (int i = 0; i < 10; i++) { // for : 명확한 범위 내에서 반복문이 실행 됩니다.
			System.out.println(i);
		} // end for

		String[] name = { "오영근", "김건하", "공선의", "이재현", "최혜원", "박정" };
		for (String temp : name) { // for each : 값을 하나씩 꺼내 올 때 사용합니다.
			System.out.println(temp);
		} // for~each

		boolean whileFlag = false;
		while (whileFlag) { // boolean형을 기준으로 범위가 명확하지 않을 때 사용합니다.
			System.out.println("while문은 끝나는 조건이 명확하지 않을 때 사용");
		} // end while

		do { // 일단, do에 속한 코드를 1번 먼저 실행합니다. 다름 while(조건-boolean)에 따라 반복문을 수행합니다.
			System.out.println("do ~ while문 무조건 1번 실행하고 while 조건에 따라 반복문을 종료 합니다.");
		} while (whileFlag); // end while

	}// repetiveStmt

	/**
	 * 다형성 - 오버로딩 : 하나의 클래스 안에서 메소드를 덮어쓴 메소드<br>
	 * 
	 * 작성법> : 메소드의 선언은 같고, 매개변수는 달라야 합니다.
	 */
	public void useOverLoad() {
		System.out.println("일반 메소드 입니다.");
	}// useOverLoad

	public void useOverLoad(String temp) {
		System.out.println("useOverLoad메소드를 덮어쓴 메소드 입니다. " + temp);
	}// useOverLoad

	/**
	 * 다형성 - 오버라이딩 : 수행결곽만 다릅니다. (상속관계)수퍼클래스의 메소드를 서브에서 덮어쓴 메소드입니다.
	 * 
	 * 작성법> : 수행코드는 달라야 합니다.<br>
	 * 매개변수 포함 모든 메소드선언이 같아야 합니다.(단, 접근지정자는 광의로 변경가능)
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
	}// actionPerformed

	/**
	 * Call by Val : 기본_데이터타입을 매개변수로 받는 변수입니다.
	 */
	public static void swap(int num, int num1) {
		int temp = num;
		num = num1;
		num1 = temp;
	}// swap

	/**
	 * Call by Ref : 참조_데이터타입을 매개변수로 받는 변수입니다.
	 */
	public static void swap(TypeToInterface ref, TypeToInterface ref1) {
		int temp = ref.num;
		ref.num = ref1.num;
		ref1.num = temp;
	}// swap

	/* 메인메소드입니다. */
	public static void main(String[] args) {

		/**
		 * 생성자 호출 : this()메소드 사용 결과 확인입니다.
		 */
		// new TypeToInterface(); // 기본생성자를 호출합니다.
		TypeToInterface ttif = new TypeToInterface("매개생성자를 생성했습니다."); // 매개생성자를 호출합니다.
		System.out.println(ttif.msg + "\n");

		/**
		 * Call by Value : 값을 복제 합니다.
		 */
		int num1 = 10;
		int num2 = 20;

		System.out.println("swap() 메소드 사용 전 : num1 = " + num1 + ", num2 = " + num2);
		swap(num1, num1);
		System.out.println("swap() 메소드 사용 후 : num1 = " + num1 + ", num2 = " + num2 + "\n");

		/**
		 * Call by Reference : 객체는 하나의 주소를 참조하고 있기 때문에
		 */
		TypeToInterface call_by_Ref = new TypeToInterface(10);
		TypeToInterface call_by_Ref2 = new TypeToInterface(20);

		System.out.println("swap() 메소드 사용 전 : num1 = " + call_by_Ref.num + ", num2 = " + call_by_Ref2.num);
		swap(call_by_Ref, call_by_Ref2);
		System.out.println("swap() 메소드 사용 후 : num1 = " + call_by_Ref.num + ", num2 = " + call_by_Ref2.num + "\n");

	}// main

}// class
