package HelloWorld.src.Exam02;

public class Example04 {
	public static void main(String[] args) {
		// 문제4) 변수 val의 값이 양수일 경우엔 변수 값을, 아닐 경우엔 0을 담는 변수를 선언하세요. (단, 삼항연산자를 사용)
		int val = 0;
		int intResult = (val > 0) ? val : 0;
			
		System.out.println(intResult);

	}
}
