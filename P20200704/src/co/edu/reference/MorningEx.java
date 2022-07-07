package co.edu.reference;

import java.util.Scanner;

public class MorningEx {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0; // 학생수
		int[] scores = null; // 참조변수 초기화
		Scanner scn = new Scanner(System.in);

		while (run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("--------------------------------------------");
			System.out.print("선택>");

			int selectNo = Integer.parseInt(scn.nextLine());
			
			if (scores==null) {
				if(!(selectNo ==1 || selectNo ==5)) {
					System.out.println("학생 수를 먼저 지정하시오");
					continue;
				}
			}
			
			

			if (selectNo == 1) {
				// 작성 위치
				System.out.print("학생수>");
				studentNum = Integer.parseInt(scn.nextLine());// nextInt()
				scores = new int[studentNum];
				System.out.println("정상적으로 처리되었습니다.");
			} else if (selectNo == 2) {
				// 작성 위치
				for (int i = 0; i < scores.length; i++) {
					System.out.print("scores[" + i + "]> ");
					scores[i] = Integer.parseInt(scn.nextLine());
				}
			} else if (selectNo == 3) {
				// 작성 위치
				for (int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "]> " + scores[i]);
				}
			} else if (selectNo == 4) {
				// 작성 위치
				int max = 0;
				double avg = 0;
				int A = 0;
				for (int i = 0; i < scores.length; i++) {
					if (max < scores[i]) {
						max = scores[i];
					}
				}
				for (int j = 0; j < scores.length; j++) {
					if (avg == 0) {
						A += scores[j];
					}
				}
				avg = (double) A / scores.length;
				System.out.println("최고 점수:" + max);
				System.out.println("평균 점수:" + avg);
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
}
