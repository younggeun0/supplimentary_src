package java_team3;

/**
 * 	2���� �迭 �����
 * 	�ַ� 2���� �迭�� ���̺� ������ �����͸� ��µ� ���ȴ�.
 * 
 * @author KIM
 */
public class TestArray2 {

	public TestArray2() {
		//1. 2���� �迭����
		int [][] intArr =new int[4][3];   //�� �迭�� ��(����), �� �迭�� ��(����)
		//2. 2���� �迭�� ��(row), ��(column)���� �����Ǿ� �־� index�� ��,���� ���� �ϳ��� �����Ѵ�.
		//3. ������ �ʱ�ȭ ���ÿ�
		int [][] arr =new int [] []{   {  }  };  //2������ ��ȣ�� �߰��Ǿ� ���� ��ȣ�� �����������ش�.
	
		//���� ���α׷�
		int[][] score= {
							{100,100,100},
							{87,50,30},
							{86,48,38},
							{49,20,60},
							{99,58,60}
						 };
	//���� ����
		int javaTotal=0, orclTotal=0, pythonTotal=0;
		System.out.println("��ȣ\t�ڹ�\t����Ŭ\t���̽�\t����\t���");
		System.out.println("====================================================");
		
		for(int i=0; i<score.length; i++) {
			int sum=0; //���� ���ϴ� ����
			float avg=0.0f; //��� ���ϴ� ����
			
			javaTotal 	+=	score[i][0];
			orclTotal 		+=	score[i][1];
			pythonTotal 	+=	score[i][2];
			System.out.printf("3%d\t", i+1);
			
			for(int j=0; j<score[i].length; j++) {
				sum+=score[i][j];
				System.out.printf("%5d\t",score[i][j]);
			}//end for
			avg=sum/(float)score[i].length; //��հ��
			System.out.printf("%5d %5.1f%n", sum, avg);
		}
			System.out.println("===================================================");
			System.out.printf("����:\t%3d\t %4d\t %4d%n\t",javaTotal,orclTotal,pythonTotal );
	}
	
	public static void main(String[] args) {
			new TestArray2();
	}//main

}//class
