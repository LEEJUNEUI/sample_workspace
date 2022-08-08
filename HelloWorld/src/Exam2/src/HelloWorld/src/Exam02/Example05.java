package HelloWorld.src.Exam02;

import java.util.Scanner;

public class Example05 {
	public static void main(String[] args) {
		/*
		 * 문제 5) 다음과 같이 두 개의 정수가 주어졌을 경우 두 정 수 중에서 음수가 있다면 'One of a or b is negative
		 * number'를, 만일 그렇지 않다면 'both a and b are zero or more'를 출력하도록 구현하세요.
		 */
		Scanner scn = new Scanner(System.in);
		int a = 10;
		int b = -8;
		String strResult;

		if (a > 0 && b > 0) {
			strResult = "both a and b are zero or more";
		} else {
			strResult = "One of a or b is negative number";
		}
		System.out.printf(strResult);
	}
}
