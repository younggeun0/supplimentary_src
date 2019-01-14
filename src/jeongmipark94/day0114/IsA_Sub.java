package day0114;

public class IsA_Sub extends IsA_Super {
	
	@Override
	public void parentMe() {
		System.out.println("부모 메서드 오버라이드 ");
	}
	
	public void subMe() {
		System.out.println("자식 클래스의 메서드 ");
		
		
		
	}
	
	
	public static void main(String[] args) { //IsA 관계
		
		IsA_Super sp = new IsA_Sub();// 자식은 부모이다
		//자식 클래스를 부모 클래스로 객체화 해줬기때문에 자식 메서드에서 가지고있던 subMe메서드는 사용할 수 없다.
		sp.parentMe();
		sp.parentMe();
		
		IsA_Sub sb = new IsA_Sub();
		sb.subMe();
		sb.parentMe();
		
//		IsA_Sub sb2 = new IsA_Super(); 
		//부모 클래스로 자식 클래스를 객체화 해줄 수 없다.
		
		
		
		
		
		
		
	}
	
	
	
}
