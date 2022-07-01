package co.edu;

import java.util.Scanner;

public class Example08 {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("[필수 정보 입력]");
	System.out.print("1. 이름: ");
	String name = scanner.nextLine();
	System.out.print("2. 주민번호 앞 6자리:");
	int id = scanner.nextInt();
	System.out.print("3. 전화번호:");
	String number = scanner.next();
	
	
	System.out.print("\n[입력한 내용]\n");
	System.out.printf("%s", name);
	System.out.printf("\n%d\n", id);
	System.out.printf("%s\n", number);
	
	
}
}
