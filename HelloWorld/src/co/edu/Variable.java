package co.edu;

public class Variable {
	public static void main(String[] args) {
		byte b1 = 10; // -128 < byte < 127
		short s1 = 32767; // -32768 < short < 32767 128*2*2*2*2*2*2*2*2
		int n1 = 0; // -2147483648 < int < 2147483647
		long l1 = 8; // -9223372036854775808
		
		int result = b1 + 20; // (int) bi + 20;
		long result1 = l1 + (long) 20; // 데이터타입 변환 : 자동형변환(promotion)
		result = (int) l1 + 20; // 데이터타입 변환 : 강제형변환(casting)
		System.out.println(result); 
		
		char c1 = 'A';
		c1++; // int 연산.
		for(int i= 0; i < 27; i++) {
		System.out.println((int) c1++);
		System.out.println(c1++);
		
		//이력변경추가 2022.07.01 12:55
		System.out.println("이력변경추가.");
		
	 
		//반영하도록 하겠습니다.
		}
	}
}
