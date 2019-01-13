package HomeWork;

public class TestOverload {

	public void printStar() {
		System.out.println("¢¾");
	}//printStart

	public void printStar(int count) {
		for(int i=0; i < count ; i++) {
			System.out.print("¡Ú");
		}//end for
	}//printStart
	
	
	
	public static void main(String[] args) {
		TestOverload to=new TestOverload();
		to.printStar();
		to.printStar(5);		
	}

}//class
