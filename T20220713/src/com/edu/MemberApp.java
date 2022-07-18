package com.edu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberApp implements MemberService {

	List<Member> members = new ArrayList<Member>();
	Scanner scn = new Scanner(System.in);

	public void execute() {
		// 메뉴: 1.등록 2.수정 3.전체리스트 9.종료
		// 1)도서반(bookMember)=>기본정보+도서반장,강의실이름
		// 축구반=>기본정보+코치이름,락커룸이름
		// 수영반=>기본정보+강사이름,수영등급(S,A,B,C)

		while (true) {
			System.out.println("1.등록 2.수정 3.전체리스트 9.종료");
			System.out.println("번호 선택>");
			int selectNo = Integer.parseInt(scn.nextLine());
			if (selectNo == 1) {
				System.out.println("1.도서반 2.축구반 3.수영반");
				int choice = Integer.parseInt(scn.nextLine());
				

			} else if (selectNo == 2) {
				System.out.println("수정할 회원 ID를 입력하시오>>");
				int searchId = Integer.parseInt(scn.nextLine());
				Member member = new Member();

			} else if (selectNo == 3) {
				for (int i = 0; i < members.size(); i++) {
					System.out.println(members.get(i).toString());
				}

			} else if (selectNo == 9) {
				System.out.println("프로그램 종료");
				break;
			}

		}
		System.out.println("프로그램 종료");
	}

	@Override
	// 등록
	public void addMember(Member member) {
		members.add(member);
	}

	@Override
	// 수정
	public void modifyMember(Member member) {
		for (int i = 0; i < members.size(); i++) {
			if (member.getMemberId() == members.get(i).getMemberId()) {
				members.get(i).setPhone(member.getPhone());
			}
		}

		System.out.println("성함>>" + member.getMemberName());
		System.out.println("수정할 이름>");
		String modifyName = scn.nextLine();
		System.out.println("현재 연락처>" + member.getPhone());
		String modifyPhone = scn.nextLine();
		member.setMemberName(modifyName);
		member.setPhone(modifyPhone);

	}

	@Override
	// 전체리스트
	public List<Member> memberList() {
		return members;
	}
}
