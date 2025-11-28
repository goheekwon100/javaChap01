package sec02.exam02;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Locale;

public class CalendarExample {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;
		int day = now.get(Calendar.DAY_OF_MONTH);
		System.out.println(year + "." + month + "." + day);
		
		int week = now.get(Calendar.DAY_OF_WEEK);
		String strWeek = null;
		
		switch (week) {
			case Calendar.MONDAY: strWeek = "월"; break;
			case Calendar.TUESDAY: strWeek = "화"; break;
			case Calendar.WEDNESDAY: strWeek = "수"; break;
			case Calendar.THURSDAY: strWeek = "목"; break;
			case Calendar.FRIDAY: strWeek = "금"; break;
			case Calendar.SATURDAY: strWeek = "토"; break;
			case Calendar.SUNDAY: strWeek = "일"; break;
		}
		System.out.println(strWeek + "요일");
		
		int amPm = now.get(Calendar.AM_PM);
		String strAmPm=null;
		switch (amPm) {
			case Calendar.AM : strAmPm = "오전"; break;
			case Calendar.PM : strAmPm = "오후"; break;
		}
		System.out.println(strAmPm);
		
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		System.out.println(hour +":" + minute  + " : " + second);
		
		
		// 자바 8 이후 권장 방식
		// Calendar 대신 java.time.API로 대체
		// 현재 날짜/시간 얻기
		LocalDateTime now2 = LocalDateTime.now();
		
		// 날짜 구성 요소 얻기
		int year2 = now2.getYear();
		int month2 = now2.getMonthValue();
		int day2 = now2.getDayOfMonth();
		System.out.println(year2 + "." + month2 + "." + day2);
		
		DayOfWeek dayOfWeek = now2.getDayOfWeek();
		System.out.println(dayOfWeek);
		
		String strWeek2 = dayOfWeek.getDisplayName(TextStyle.SHORT, Locale.KOREAN);
		System.out.println(strWeek2);
		
		// 오전/오후 구분 
		int hour24 = now2.getHour(); // 24t시간제 시각
		String strAmPm2 = hour24 < 12 ? "오전" : "오후";
		System.out.println(strAmPm2 + " ");
		
		// 12시간제 시각: 1~12
		int hour12 = hour24 % 12;
		if (hour12 == 0) hour12 = 12; // 24시간제 기준으로 0시, 12시일 때 -> 12시
		
		int minute2 = now2.getMinute();
		int second2 = now2.getSecond();
		
		System.out.println(hour12 +":" + minute2  + ":" + second2);
		System.out.println("==================================");
		
		// 날자 더하기/빼기
		LocalDateTime plusYears = now2.plusYears(3);
		System.out.println(plusYears);
		
		
		LocalDate today = LocalDate.now();
		LocalDate targetDate = LocalDate.of(2025, 5, 27);
		System.out.println(targetDate);
		
		if (today.isBefore(targetDate)) {
			System.out.println("크리스마 이전입니다.");
		}else if (today.isAfter(targetDate)) {
			System.out.println("크리스마스 지났습니다");
		}else {
			System.out.println("오늘은 크리스마스입니다!");
		}
		
		// 시간 비교
		
		LocalDateTime todayTime = LocalDateTime.now();
		LocalDate deadLineDate = LocalDate.of(2025, 11, 27);
		LocalDateTime deadLine = LocalDateTime.of(deadLineDate, LocalTime.of(15, 25));
		
		if (todayTime.isBefore(deadLine)) {
			System.out.println("마감시간 전입니다.");
		}else if (todayTime.isAfter(deadLine)) {
			System.out.println("마감시간 지났습니다.");
		}else {
			System.out.println("지금이 마감시간입니다.");
		}
		
		System.out.println("=============================");
		
		// 날짜 시간 차이 구하기
		// 날짜 차이
		LocalDate startDate = LocalDate.of(2025, 4, 7);
		LocalDate endDate = LocalDate.of(2025, 10, 24);
		
		// 날짜차이 계산
		// Period 클래스 : 두 날짜 사이의 간격을 다루는 클래스
		Period period = Period.between(startDate, endDate);
		
		System.out.println("연 차이: " + period.getYears());
		System.out.println("월 차이: " + period.getMonths());
		System.out.println("일 차이: " + period.getDays());
		
		// 시간차이
		LocalTime start = LocalTime.of(10, 0, 0);
		LocalTime end = LocalTime.of(12, 5, 32);
		
		// 시간 차이 계산
		// Duration: 두 시간 사이의 간격을 다루는 클래스
		Duration duration = Duration.between(start,end);
		
		System.out.println("총 초: " + duration.getSeconds());
		System.out.println("단순 초: " + duration.toSecondsPart());
		System.out.println("총 분: " + duration.toMinutes());
		System.out.println("단순 분: " + duration.toMinutesPart());
		System.out.println("총 시간: " + duration.toHours());
		
		System.out.println("==================================");
		
		// 차이 계산: ChronoUnit
		// 두 날짜/시간 의 차이를 원하는 단위로 바로 계산
		long dayBetween = ChronoUnit.DAYS.between(startDate, endDate);
		System.out.println(dayBetween);
		// 사용 가능한 단위: DAYS, WEEKS, MONTHS, YEARS
	}
}
