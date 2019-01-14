package HomeWork;

public class CallByValue {

	public void swap(int i, int j) {
		
		int temp=0;
		temp=i;
		i=j;
		j=temp;
		System.out.println("swap method내에서 i="+i+",j="+j);
		
	}
	
	public static void main(String[] args) {
			CallByValue cbv=new CallByValue();
			int i=77, j=33;
			
			System.out.println("swap 전 i= "+i+", j="+j);
			cbv.swap(i, j);
			System.out.println("swap 후 i= "+i+",j="+j);
	}

}//class
