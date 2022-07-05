package co.edu.loop;

import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		boolean run = true;
		int balance = 0;
		int amt = 0;
		while (run) {
			System.out.println("");
			System.out.println("1.예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("");
			System.out.println("선택>");
			amt = sn.nextInt();
			if (amt == 1) {
				System.out.println("입금액을 입력하세요>>>");
				amt = sn.nextInt();
				if (amt + balance > 100000) {
					System.out.println("입금액이 100000원을 초과했습니다.");
					continue;
				}
				if (amt < 0) {
					System.out.println("입금액은 0보다 커야합니다.");
					continue;
				}
				balance += amt;
				System.out.println("정상적으로 처리완료.");

			} else if (amt == 2) {
				System.out.println("출금액을 입력하세요");
				amt = sn.nextInt();
				if (amt >= balance) {
					System.out.println("출금불가");
				} else {
					balance -= amt;
					System.out.println("정상적으로 처리완료");
				}
			} else if (amt == 3) {
				amt = sn.nextInt();
				System.out.println("현재 잔액은 : " + balance);
			} else if (amt == 4) {
				amt = sn.nextInt();
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("잘못된 메뉴를 입력했습니다.");
			}
		}
	}

}
