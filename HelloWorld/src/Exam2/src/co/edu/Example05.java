package co.edu;

import java.util.Scanner;

public class Example05 {
	public static void main(String[] args) {
	
//		String name = new String ("홍길동");
		
		Scanner sn = new Scanner(System.in);
	
		// String input = sn.nextLine(); // 문자열.
		//		int input = sn.nextInt(); // 정수.
		//System.out.printf("입력값은 %s", input);

		System.out.println("첫번째 값을 입력.");
		int num1 = sn.nextInt();
		System.out.println("두번째 값을 입력.");
		int num2 = sn.nextInt();
		int tdi = 0;
//		int result = num1 + num2; // 입력 2수의 합.
//		System.out.printf("\n 입력값 %d와 %d 합은 %d 입니다.\n", num1 , num2, result);
//		// 입력값 10과 20의 합은 30 입니다.
		if(num1 > num2 ) {
			tdi = num1-num2;
		} else {
			tdi = num2-num1;
		}
	    System.out.printf("입력된 두 값의 차는 %d 입니다.", tdi );
		
	
	}
}
