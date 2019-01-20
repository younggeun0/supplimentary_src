package java_team3;

import java.math.MathContext;
import java.util.Random;

/**
 * method : Ư�� �۾��� �����ϴ� �Ϸ��� ������� �ϳ��� ���� ��
 * 				1. �������뼺, �ߺ��� �ڵ����ŷ� method�� ���.
 * 
 * 	method�� 4��������
 * 	1. �Ű����� ���� ��ȯ�� ���� ������ Ÿ��
 * 	2. �Ű����� �ְ� ��ȯ�� ���� ������ Ÿ��
 * 	3. ��ȯ�� �ְ� �Ű����� ���� ��	 ������ Ÿ��
 * 	4. �Ű����� �ְ�, ��ȯ�� �ִ� ��. ������ Ÿ��
 * @author KIM
 *
 */
public class TestMethod {
	
	private void methodA() {
		//�Ű����� , ��ȯ�� ���� ������ �ϴ� method
		//�Ű������� ��ȯ���� ���� Ÿ���̶� �ܼ��� ����� �����ϱ� ���� method�� �����ϴ�.
		System.out.println("�Ű�����,��ȯ�� ���� method");
	}//methodA
	
	//��ȯ���� ���� �Ű������� �޾� ����ϴ� �޼ҵ� 
	private void methodB(int i) {
		if(i>70) {
			System.out.println("� �ϼ���.");
		}else if(i<69){
			System.out.println("�����մϴ�.");
		}
		
	}//methodB
	//��ȯ�� �ְ� �Ű����� ���� ������
	private int methodC( ) {
		int result=0;
		result=(int)(Math.random()*10);
		System.out.println(result);
		return result;
	}//methodc
	
	//��ȯ���� �Ű������� �ִ� ������
	public String methodD(String name) {
		String msg="";
		if(name.contains("������") && name.equals("������")) {
			msg="�����Դϴ�.";
		}
		System.out.println(msg);
		return msg;
	}
	
	
	public static void main(String[] args) {
		TestMethod tm=new TestMethod();
		tm.methodA();
		tm.methodB(80);
		tm.methodC();
		tm.methodD("������");
	}//main

}//class
