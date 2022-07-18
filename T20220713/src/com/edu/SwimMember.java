package com.edu;

public class SwimMember extends Member{
	// 강습반의 강사이름.
	// 수영등급(A,B,C,D)
	private String stName;
	private String stGrade;
	// 정보출력시 => 강사이름: 홍길동, 등급: A 
	public SwimMember(int memberId, String memberName, String phone, String picName, String className, String lbRoom, String lbName, String stName, String stGrade) {
		super(memberId, memberName, phone);
		this.stName = stName;
		this.stGrade = stGrade;
	}
	public String getStName() {
		return stName;
	}
	public void setStName(String stName) {
		this.stName = stName;
	}
	public String getStGrade() {
		return stGrade;
	}
	public void setStGrade(String stGrade) {
		this.stGrade = stGrade;
	}
	@Override
	public String toString() {
		return super.toString();
	}
	
		
}
