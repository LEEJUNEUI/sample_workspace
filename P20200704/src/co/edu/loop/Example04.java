package co.edu.loop;

import java.util.Scanner;

public class Example04 {
	public static void main(String[] args) {
		// while 반복문의 종료조건.
		// 1~ 100 임의의 수를 생성.
		int temp = (int) (Math.random()* 100)+1;
		int inputVal = temp;
		boolean isTrue = true;
		Scanner sn = new Scanner(System.in);
		
		
		while(isTrue) {
			System.out.println("임의의 값을 입력하세요.");
			 int num = sn.nextInt();
						if(inputVal == num) {
				System.out.println("맞췄습니다."); 
				break;
				
			}else if (inputVal >= num) {
				System.out.println("입력값보다 큽니다.");
			}else if (inputVal <= num) {
				System.out.println("입력값보다 더 작습니다.");
			}
		}
	}
}
