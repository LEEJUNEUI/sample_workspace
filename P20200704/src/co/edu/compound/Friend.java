package co.edu.compound;

/*
 * 이름, 연락처, email, 생일, 키, 몸무게: 
 */
public class Friend {

	// 필드. 명명규칙(소문자, camelCase, 영문이 제일 먼저 와야함, 특수문자 가능 _.)

	// 생성자: 기본생성자를 생성.
	public Friend() {
		System.out.println("생성자를 호출");
	}

	// 메소드.
	private String fullName;
	private String num;
	private String email;
	private String brith;
	private double height;
	private double weight;

	// 이름, 연락처를 보여주는 showInfo()

	public void showInfo() {
		System.out.printf("이름은 %s", "연락처는 %s", fullName, num, email, brith, height, weight);
	}

	public void setfullName(String fullName) {
		this.fullName = fullName;
	}
	public String getfullName() {
		return fullName;
	}

	public void setPhone(String num) {
		this.num = num;
	}
	public String getNum() {
		return num;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail() {
		return email;
	}

	public void setBrith(String brith) {
		this.brith = brith;
	}
	public String getBrith() {
		return brith;
	}

	public void setHeight(double height) {
		if (height > 0) {
			this.height = height;
		} else {
			this.height = 170;
		}
	}

	public double getHeight() {
		return height;
	}
	public void setWeight(double weight) {
		if (weight > 0) {
			this.weight = weight;
		} else {
			this.weight = 70;
		}
	}
	public double getWeight() {
		return weight;
	}

	public String getFullName() {
		return fullName;
	}

}
