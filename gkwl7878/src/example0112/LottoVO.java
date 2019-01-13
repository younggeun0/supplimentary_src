package example0112;

public class LottoVO {
	private int times,winnercount,num1,num2,num3,num4,num5,num6,num7;
	private String  amount, date;
	
	public LottoVO() {
	}

	public LottoVO(int times, String date ,int winnerCount, String amount, int num1, int num2, int num3, int num4, int num5, int num6, int num7) {
		super();
		this.times = times;
		this.amount = amount;
		this.winnercount=winnerCount;
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
		this.num4 = num4;
		this.num5 = num5;
		this.num6 = num6;
		this.num7 = num7;
		this.date = date;
	}

	public int getTimes() {
		return times;
	}

	public String getAmount() {
		return amount;
	}

	public int getNum1() {
		return num1;
	}

	public int getNum2() {
		return num2;
	}

	public int getNum3() {
		return num3;
	}

	public int getNum4() {
		return num4;
	}

	public int getNum5() {
		return num5;
	}

	public int getNum6() {
		return num6;
	}

	public int getNum7() {
		return num7;
	}

	public String getDate() {
		return date;
	}

	public int getWinnercount() {
		return winnercount;
	}



	
}
