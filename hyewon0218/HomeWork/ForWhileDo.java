package HomeWork;

public class ForWhileDo {

	public static void main(String[] args) {

		for(int i=0; i<10 ; i++ ) {
			System.out.println("i = "+i);
		}//for
		
		
		int j=1;
		
		while(j<3) {
			System.out.println("j ="+j);
			j++;
		}//while
		
		
		int i = Integer.parseInt(args[0]) ;

		if(i >1 && i<10) {
			System.out.println(i+"��");
			int g=1;
			do {
				System.out.println(i+"x"+g+"="+i*g);
				g++;
			}while(g <10);
		
		}else{
			System.out.println("���� 2�ܿ��� 9�ܱ��� �Է��� �ּ���");
		}//end if	

		
	}//main

}
