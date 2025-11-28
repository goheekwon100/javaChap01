package sec02.exam01;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateExample {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now.toString());
		System.out.println(now);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd.(E). [HH:mm:ss]");
		sdf.format(now);
		System.out.println(sdf.format(now));
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yy년 M월 d일 E요일 HH시 m분 s초 S");
		System.out.println(sdf1.format(now));
		
		// 참고 : 자바 8이후 권장 방식 (java.time API)
		// Date 대신 LocalDate, LocalDateTime 등을 사용권장
		// SimpleDateFormat 대신 DateTimeFormatter 사용 권장
		// 훨씬 더 안전하고 직관적 사용성 좋음
		// 날짜 시간 조작
		
		
		// 1. LocalDate
		// 날짜(년,월,일) 정보만 가짐
		// 시간 정보 없음
		// 시간대 정보 없음
		// 생일, 기념일, 마감일 등 날짜만 필요한 경우"에 사용
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		// 2. LocalDateTime
		// 날짜(년,월,일) 정보 + 시간 정보
		// 시간대 정보 없음
		// 로그 생성 시간, 예약 시간 등 "날짜 + 시간 필요한 경우"에 사용
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);
		
		// 3. ZonedDateTime
		// 날짜(년,월,일) + 시간 + 시간대 정보
		// 표준 시간대 간의 변환이 필요할 때 사용
		ZonedDateTime zonedDateTime = ZonedDateTime.now();
		System.out.println(zonedDateTime);
		
		// 참고: 시간 정보만 필요하면 LocalTime
		
		// 4. DateTimeFormatter 
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년MM월dd일 a HH시 mm분 ss초");
		System.out.println(zonedDateTime.format(formatter));
		
		
		
		
		
		
	}
}
