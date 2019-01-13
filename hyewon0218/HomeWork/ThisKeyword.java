package HomeWork;

public class ThisKeyword {
	int i;

	public void useThis(int i) {
		this.i=i;
	}//useThis
	
	public static void main(String[] args) {
		ThisKeyword tk = new ThisKeyword();
		System.out.println(tk.i);
		tk.useThis(900);
		System.out.println(tk.i);
				
	}//main

}//calss
