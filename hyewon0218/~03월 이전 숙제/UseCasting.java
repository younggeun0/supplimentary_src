package HomeWork;

class UseCasting{ 

	public static void main(String[] args) {
		byte b1=10,b2=20;
		byte result =(byte)(b1+b2);
		System.out.println(b1+" + " +b2+ " = "+result);
		
		
		double d=1.14;
		float f=(float)d;
		System.out.println("double : "+d+",float :"+f);

		float f1=(float)2019.1;
		System.out.println("float : "+f1);
	
		int i=(int)f1;
		System.out.println("int : "+i+",foalt : "+f1);

		char c='A';
		System.out.println(c +"ÀÇ unicode(ASCII code)°ª "+(int)c);

	

	  boolean b=true;
	    boolean bc= (boolean)b;
		System.out.println(bc);
	}//main
}//class
