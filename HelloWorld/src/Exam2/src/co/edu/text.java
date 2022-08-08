package co.edu;

public class text {
public static void main(String[] args) {
	float f1 = 23.4f; // 4byte *근사치로 계산
	System.out.println(Float.MIN_VALUE);
	System.out.println(Float.MIN_VALUE);
	double d1 = 23.4; // 8byte
	
	// 0 ~ 10 정수. 명확한 값을 원할 때 사용
	// 0 ~ 1 실수.
	double result = 1.1 + 2.2;
	System.out.println(result);
	
	// long ( 8byte ) float ( 4byte );
	float sum = 2345L + 22.3F;
}
}
