package java_team3;

import java.util.Random;

/**
 * 	���� Ÿ���� ������ �ϳ��� �������� �ٷ�°��� �迭�̶� �Ѵ�. ���������� �ٸ�Ÿ���� ������ ���� �� ����.
 * 	�迭�� for���� �����ϴ�.
 * 
 * @author KIM
 */
public class TestArray {

	public TestArray() {
	
	//1. �迭 ���� 
		//�������� [] �迭��
		int [] intArr;
	//2. �迭 ����
		//�迭�� = new �������� ����
		intArr = new int [6];
	//3. ����� ���� ���ÿ�
		int[] arr=new int[6];
	//4. �� �Ҵ�
		intArr[1]=10;
		intArr[2]=20;
	//5. �ѹ��� ���Ҵ� ���� �� ���
		int [] arrInt=new int[] {10,20,30};
		//������ �迭�� �� ��������� '�迭�� ���' ��� �Ѵ� �迭�� �ε����� 0������ ����
		//�迭�� ���̸� �� ��� �迭��.length�� ���Ҽ� �ִ�
		
	}//������
	
	public void TestLotto() {
		Random r = new Random();
//		System.out.println(r.nextInt(45));

		int[] arrInt = new int[6];
//		Arrays.sort(arrInt);
		for (int i = 0; i < arrInt.length; i++) {
			arrInt[i] = (int) (r.nextInt(45) + 1);
			for (int j = 0; j < i; j++) {
				if (arrInt[i] == arrInt[j]) {
					j--;
					break;

				} // end if
			} // end for
			System.out.print("[" + arrInt[i] + "] ");
		} // end for
		System.out.println();
	}// TestLotto

	public static void main(String[] args) {
		TestArray ta=new TestArray();
		ta.TestLotto();
	}// main

}// class
