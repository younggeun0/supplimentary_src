package HomeWork;

public class TestSwitchCase {

	public static final int GRADE_A_PLUS=10;
	public static final int GRADE_A=9;
	public static final int GRADE_B=8;
	public static final int GRADE_C=7;
	public static final int GRADE_D=6;
	
	
	public static void main(String[] args) {

		int score=78;
		char grade=64;
		if(score >=0 && score <=100 ) {
			switch(score / 10 ) {
			case TestSwitchCase.GRADE_D: grade++;
			case TestSwitchCase.GRADE_C: grade++;
			case TestSwitchCase.GRADE_B: grade++;
			case TestSwitchCase.GRADE_A: 
			case TestSwitchCase.GRADE_A_PLUS: grade++;break;
			default: grade+=6;
	
		}//end switch
		
		System.out.println(score+"점의 학점은"+ grade);
		}else {
			 System.out.println("점수는 0~100점 사이만 입력 가능!!! 입력점수{ " + score + "]");
		}
	}//main

}//class











