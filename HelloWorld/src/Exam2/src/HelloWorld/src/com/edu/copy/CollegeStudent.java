package HelloWorld.src.com.edu.copy;

public class CollegeStudent extends Student {
//	대학생정보 : 담당교수, 전공과목 정보 추가.
	private String pro;
	private String major;

	// 생성자.
	public CollegeStudent(String studNo, String studName, int score) {
		super(studNo, studName, score);
		this.pro = pro;
		this.major = major;

		// toString()
		
	}

	public String getPro() {
		return pro;
	}

	public void setPro(String pro) {
		this.pro = pro;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String toString() {
		return "CollegeStudent [pro=" + pro + ", major=" + major + "]";
	}
}
