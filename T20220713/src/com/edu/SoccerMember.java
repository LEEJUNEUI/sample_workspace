package com.edu;

public class SoccerMember extends Member{
	// 축구반의 코치이름.
	// 락커룸의 이름.(A, B, C, D)
	private String scName = "홍길동";
	private String scLocker = "A";
	// 정보출력시 => 코치이름: 홍길동, 락커룸: A 
	public SoccerMember(int memberId, String memberName, String phone, String picName, String className, String lbRoom, String lbName, String scName, String scLocker) {
		super(memberId, memberName, phone);
		this.scName = scName;
		this.scLocker = scLocker;
	}
	public String getScName() {
		return scName;
	}
	public void setScName(String scName) {
		this.scName = scName;
	}
	public String getScLocker() {
		return scLocker;
	}
	public void setScLocker(String scLocker) {
		this.scLocker = scLocker;
	}
	@Override
	public String toString() {
		return super.toString();
	}
	
	
}
