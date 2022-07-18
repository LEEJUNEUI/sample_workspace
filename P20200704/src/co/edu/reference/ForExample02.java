package co.edu.reference;

import java.util.Scanner;

public class ForExample02 {
	public static int sumAry(int[]ary) {
		int sum = 0;
		for(int i = 0; i < ary.length; i++) {
			sum += ary[i];
		}
		return sum;
		
	}
	
	
	
	public static void main(String[] args) {
		//메소드 호출구문.
//		int result = sumAry(10);
//		result = sumAry(20);
//		System.out.println("결과값: " + result);
		
		int sum = 0;
		double avg = 0;

		int[] intAry = { 34, 23, 56, 22, 99, 28 };
		// intArray배열의 합과 평균.
		sum = sumAry(intAry);
		avg = (double) sum / intAry.length;
		System.out.printf("합계 : %d " + "평균 : %.1f " , sum, avg);
		
			
		sum = 0;
		int[] intArray = new int[6];
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = (int) (Math.random() * 100) + 1;	
		}
		sum = sumAry(intArray);
		avg = (double) sum / intArray.length;
		System.out.printf("\n랜덤값 합계 : %d " + "평균 : %.1f ", sum , avg);
		
		// intArray배열의 합과 평균.
		int[] scanArray = new int[5];
		Scanner scn = new Scanner(System.in);
		for (int i = 0; i < scanArray.length; i++) {
			System.out.println("\n임의의 수를 입력>>>>");
			scanArray[i] = scn.nextInt();
			sum += scanArray[i];
		}
		// intArray배열의 합과 평균.
		avg = (double) sum / scanArray.length;
		System.out.printf("합계%d : " + "평균%.1f : ", sum , avg);
	}
}
