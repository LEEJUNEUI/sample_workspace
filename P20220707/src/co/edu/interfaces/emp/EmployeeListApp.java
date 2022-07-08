package co.edu.interfaces.emp;

import java.util.Scanner;

public class EmployeeListApp {
	public static void main(String[] args) {

		EmployeeList app = EmployeeArray.getInstance();
		Scanner scn = new Scanner(System.in);

		while (true) {
			System.out.println("1.사원수(초기화) 2.사원입력 3. 사원조회 4.상세조회 9.종료");
			System.out.println("선택>");

			int selectNo = scn.nextInt();
			if (selectNo == 1) {
				System.out.println("사원수>");
				int employee = scn.nextInt();
				Employee num = app.search(employee);
			} else if (selectNo == 2) {
				System.out.println("사원 입력");
				String name = scn.nextLine();
			
				
			} else if (selectNo == 3) {

			} else if (selectNo == 4) {
				System.out.println("검색할 사번입력>");
				int empId = scn.nextInt();
				Employee emp = app.search(empId);
				System.out.println(emp.getDetailInfo());

			} else if (selectNo == 9) {
				System.out.println("프로그램 종료");
			}
		}
	}
}
