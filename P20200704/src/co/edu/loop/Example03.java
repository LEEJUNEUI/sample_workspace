package co.edu.loop;

import java.util.Scanner;

public class Example03 {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		boolean isTrue = true;
		int sum = 0;
		int result = 0;
		// sum의 누적값이 100을 초과할 때 반복문 종료.

		do {
			System.out.println("임의의 값을 입력>>>");
			int num = scn.nextInt();
			sum += num;
			if (sum > 100) {
				System.out.println("반복문을 종료.");
				isTrue = false;
				break;
			}

		} while (isTrue);
		// 누적값이 100을 초과하기 전의 값을 출력.
		System.out.println("임의의 값을 입력>>>");
		int num = scn.nextInt();
		sum -= num;
		if (sum >= 100) {
			System.out.println("반복문을 종료.");
			isTrue = false;

//		System.out.println("sum의 누적값:" + sum);
//		System.out.println("end of program.");
		}
	}
}