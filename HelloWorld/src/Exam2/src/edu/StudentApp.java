package edu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentApp implements StudentService {

	List<Student> list = new ArrayList<Student>();
	Scanner scn = new Scanner(System.in);

	public void execute() {
		while (true) {
			System.out.println("1.등록 2.수정 3.전체리스트 9.종료");
			System.out.println("번호 선택>");
			int selectNo = Integer.parseInt(scn.nextLine());
			if (selectNo == 1) {
				System.out.println("1.대학생 2.고등학생");
				int choice = Integer.parseInt(scn.nextLine());
				System.out.println("학생 번호>>");
				int choice1 = Integer.parseInt(scn.nextLine());
				System.out.println("학생 이름>>");
				String choice2 = scn.nextLine();
				System.out.println("학생 점수>>");
				int choice3 = Integer.parseInt(scn.nextLine());
			} else if (selectNo == 2) {
				System.out.println("수정할 학생 번호를 입력하시오");
				int searchId = Integer.parseInt(scn.nextLine());
				System.out.println("학생 이름>>");
				String searchId1 = scn.nextLine();
				System.out.println("학생 점수>>");
				int searchId2 = Integer.parseInt(scn.nextLine());
			} else if (selectNo == 3) {
				System.out.println("조회할 학생번호를 입력하시오");
				int searchId = Integer.parseInt(scn.nextLine());
				List<Student> list = studentList();
				for (int i = 0; i < list.size(); i++) {
					System.out.println(list.get(i).toString());
				}
			} else if (selectNo == 9) {
				System.out.println("프로그램 종료");
				break;
			}
		}
		System.out.println("프로그램 종료");
	}

	@Override
	//등록
	public void addStudent(Student student) {
		list.add(student);
	}

	@Override
	//수정
	public void modifyStudent(Student student) {
		for (int i = 0; i < list.size(); i++) {
			if (student.getStudNo() == list.get(i).getStudNo()) {
				list.get(i).setScore(student.getScore());
			}
		}
	}
	
	@Override
	//전체리스트
	public List<Student> studentList() {
		return list;
	}
}