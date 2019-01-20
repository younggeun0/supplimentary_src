package login.vo;

public class AddressVO {
	private String zipcode, sido, gugun, dong, bunji;

	public AddressVO(String zipcode,String sido, String gugun, String dong, String bunji) {
		super();
		this.zipcode = zipcode;
		this.sido = sido;
		this.gugun = gugun;
		this.dong = dong;
		this.bunji = bunji;
	}
	

	public String getZipcode() {
		return zipcode;
	}

	public String getSido() {
		return sido;
	}

	public String getGugun() {
		return gugun;
	}

	public String getDong() {
		return dong;
	}

	public String getBunji() {
		return bunji;
	}


	@Override
	public String toString() {
		return "AddressVO [zipcode=" + zipcode + ", sido=" + sido + ", gugun=" + gugun + ", dong=" + dong + ", bunji="
				+ bunji + "]";
	}
	
	
}
