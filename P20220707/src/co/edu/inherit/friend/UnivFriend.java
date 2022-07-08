package co.edu.inherit.friend;
/*
 * 학교친구.
 *  */
public class UnivFriend extends Friend{
	private String univ;
	private String major;
	
	public UnivFriend(String name, String phone, String univ, String major) {
		super(name, phone);
		this.univ = univ;
		this.major = major;
		
		
	}

	@Override
	public String toString() {
		return "UnivFriend [이름:" + getName() +", 연락처: " + getPhone() + ", 학교" + univ + ", 학과=" +major + "]";
	}
	public void showInfo() {
		//친구이름, 연락처, 회사이름, 부서
			super.getShowInfo();
			System.out.printf("이름 :" + getName() + "연락처 : " + getPhone() + "학교 : " + univ + "학과 : " + major);
			
	}
	
}
