package HomeWork;

/**
 * 1���� �迭 : �� �ϳ��� ���θ� ������ �迭
 * �迭 - �޸𸮿� ���ϵ����������� ������ �������� <br>
 * ������ ��������, ���������� <br>
 * �ϰ�ó���� ���<br>
 * ���� ���� ��� (�迭��.length)
 * 
 * @author SIST
 */
public class UseArray1 {
	
	/**
	 * 1���� �迭�� ������ �������� ���.
	 */
	public UseArray1() {
		//1	. �迭�� ����) �������� []�迭��=null;
		int[] arr=null;
		System.out.println(arr);
		
		//2. �迭 ����)�迭��=new ��������[���� ����];
		//�迭�� �����ϸ� ��� ���� ���� �ʱ�ȭ�ȴ�.
		arr=new int[6];
		System.out.println(arr);
		//����� ����) ��������[]�迭��=new ��������[���� ����];
		int[] arr1=new int[8];
		System.out.println(arr+"/"+arr1);
		
		System.out.println("arr �迭 ���� ����"+arr.length
							+",arr �迭 ���� ���� :"+arr1.length);
		
		
		//3. �� �Ҵ� )�迭��[���� �ε���]=��;
		arr[0]=11;
		arr[1]=27;
		arr[2]=14;
		arr[3]=46;
		//4. �� ���
		System.out.printf("arr[0]=%d,arr[1]=%d,arr[2]=%d\n",
								arr[0],arr[1],arr[2]);
		// �迭�� ���� �ε����� ����ϸ� error
//		arr[6]=10;
		System.out.println("arr[5]="+arr[5]);
		
		System.out.println("=======================================");
		//�ϰ�ó�� 
		for(int i=0; i < arr.length ; i++) {
			System.out.printf("arr[%d]=%d\n",i,arr[i]);
		}//end for
		
	}//UseArray1
	
		
	/**
	 * ������ �迭�� �⺻�� ������ ���. new ��� x
	 */
	public void arrayPrimative() {
		System.out.println("=======================�⺻�������� ���====================================");
		//1.���� : ��������[] �迭��={��.,,,,,,,,,};
		int[] arr= {2018,11,27,15,20};
		System.out.println("���� �� : "+ arr.length);
		int[] arr1=new int[] {1, 2, 3, 4, 5, 6, 7};//���� ������ �����ϸ� error
		System.out.println("arr1�� ���� �� :"+arr1.length);
		
		arr[0]=2019;
		System.out.println(arr[0]+"/"+arr[1]);
		for(int i=0; i <arr.length; i++) {
			System.out.println("arr["+i+"]="+arr[i]);
		}//end for
		//���� for : �迭 Collention(List,Set)�� ó�� ����� ������� ��� ���� ���� ���������� �ս��� ����� ��. 
/*		for(�迭���� ���� ������ ���� : �迭){
 *		������ 				
		*/
		for(int value : arr1) {
			System.out.println( value);
		}//end for
		
		// arr1�迭�� ������ ����� ó������� ��� 
		for(int i=arr1.length-1; i >-1; i--) {//�迭�� length��° �ε����� ����. length����°!
			System.out.println("arr1["+i+"]="+arr1[i]);
		}
	}//arrayPrimitive
	
	public static void main(String[] args) {
		new UseArray1().arrayPrimative();
//		new UseArray1();
	}//main

}//class
