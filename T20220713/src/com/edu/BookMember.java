package com.edu;

public class BookMember extends Member {
	// 도서반의 반장이름.
	// 도서반의 강의실정보.(지혜실, 지식실, 모험실)
	private String lbName;
	private String lbRoom;
	
	// 정보출력시 => 반장이름: 홍길동, 강의실: 모험실 (toString overriding해라.)
	public BookMember(int memberId, String memberName, String phone, String picName, String className, String lbRoom, String lbName) {
		super(memberId, memberName, phone);
		this.lbName = lbName;
		this.lbRoom = lbRoom;
	}

	public String getLbName() {
		return lbName;
	}

	public void setLbName(String lbName) {
		this.lbName = lbName;
	}

	public String getLbRoom() {
		return lbRoom;
	}

	public void setLbRoom(String lbRoom) {
		this.lbRoom = lbRoom;
	}

	@Override
	public String toString() {
		return super.toString();
	}

	
	
}


