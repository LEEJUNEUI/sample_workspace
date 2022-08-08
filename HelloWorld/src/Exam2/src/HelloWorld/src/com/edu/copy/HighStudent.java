package HelloWorld.src.com.edu.copy;

public class HighStudent extends Student{
//	고등학생정보 : 담임교사, 학년 정보 추가.
	private String tc;
	private String grade;
	// 생성자.
	public HighStudent (String studNo, String studName, int score) {
		super(studNo, studName, score);
		this.tc = tc;
		this.grade = grade;
	// toString()
	
	}
	public String getTc() {
		return tc;
	}
	public void setTc(String tc) {
		this.tc = tc;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "HighStudent [tc=" + tc + ", grade=" + grade + "]";
	}
}
