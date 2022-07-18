package co.edu.reference;

public class MathodExample01 {
	public static void main(String[] args) {
		// 실행구문.
//		long sum = sum(10); //arguments(매개값)
//		showInfo("홍길동");
//		showInfo("이준의");
////		printStar("*");
//		for (int i = 2; i <= 9; i++)
			printGugudan(1);
	}

	public static void printGugudan(int dan) {
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++)
//			System.out.println("2 " + "* " + i + " = " + num*i);
				System.out.printf("%d * %d = %2d    ", j, i, (i * j));
		System.out.println();
		}
		System.out.println();
	}

	public static void printStar(String shape) {
		for (int i = 1; i <= 4; i++) {
			for (int j = 4 - i; j > 0; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 4; j++) {
				System.out.print(shape);
			}
			System.out.println();
		}
	}

//	public static void printStar(int times, String shape) {
//		for (int i = 1; i <= times; i++)
//			System.out.println(shape);
//	}

	public static void showInfo(String name) {
		System.out.println("반갑습니다. " + name + " 입니다.");
	}

	public static int sum(int num) { // parameter(매개변수)
		int result = num * 2;
		return result; // 자동형변환 (promotion)
	}
}
