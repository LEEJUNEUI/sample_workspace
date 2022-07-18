package co.edu.emp;

import java.util.Calendar;

/*
 * Calendar 클래스 연습
 */
public class CalendarExample {
	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();
		System.out.print(cal.get(Calendar.YEAR) + "년 ");
		System.out.print(cal.get(Calendar.MONTH) + 1 + "월 ");// 0 ~ 11
		System.out.print(cal.get(Calendar.DATE) + "일 ");
		System.out.println(cal.get(Calendar.DAY_OF_WEEK) + "요일"); // 1(일) ~ 7(토)
		System.out.println(cal.getActualMaximum(Calendar.DATE) + "일"); // 말일날짜.

		cal.set(2022, 5, 1); // 2022년 6월 1일 지정.
		System.out.print(cal.get(Calendar.YEAR) + "년 ");
		System.out.print(cal.get(Calendar.MONTH) + 1 + "월 ");// 0 ~ 11
		System.out.print(cal.get(Calendar.DATE) + "일 ");
		System.out.println(cal.get(Calendar.DAY_OF_WEEK) + "요일"); // 1(일) ~ 7(토)
		System.out.println(cal.getActualMaximum(Calendar.DATE) + "일"); // 말일날짜.

		int year = 2022;
		int month = 8;
		System.out.printf("%d년 %d월의 마지막날짜는 %d\n", year, month, getLastDate(year, month));
		System.out.printf("%d년 %d월 1일의 요일정보는 %d", year, month , getDayInfo(year,Calendar.DAY_OF_WEEK));
	}

	// 년, 월 정보 => 해당 년,월의 말일정보를 가져오는 메소드 2022년 9월 => 30일.
	public static int getLastDate(int year, int month) {
		Calendar cal = Calendar.getInstance();
		cal.set(year, month - 1, 1);

		return cal.getActualMaximum(Calendar.DATE);
	}

	// 년, 월 정보 => 해당 년,월의 1일의 요일정보를 가져오는 메소드 2022년 9월 => 5요일.
	public static int getDayInfo(int year, int month) {
		Calendar cal = Calendar.getInstance();
		cal.set(year, month - 1, 4);
		
		return cal.get(Calendar.DAY_OF_WEEK);
	}
}