package java_team3;

/**
 * �ݺ������� for�� while��, do while���� �ִ� for���� �ݺ�Ƚ���� �˶� ����ϸ� do while���� �ּ� �ѹ� ������ �Ѵ�
 * 
 * @author KIM
 */
public class TestFor {

	public static void main(String[] args) {

		// 00
		// 	1011
		//   202122
		//    30313233
		for(int i=0;  i<4; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<=i; k++) {
				System.out.print(i+""+k);
			}
			System.out.println();
		}
		//*
		//**
		//***
		//****
		for(int i=0; i<4; i++) {
			System.out.print("*");
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=0; i<4; i++) {
			for(int j=1; j<=i; j++) {
					System.out.print(" ");
				}
			for(int k=0; k<=i; k++) {
				System.out.print(i+""+k);
		}
			System.out.println();
		}
	
		//���� for��
		int[]arr=new int[5];
		for(int tmp : arr ) {
			System.out.println(tmp);
		}
		
	}// main

}// class
