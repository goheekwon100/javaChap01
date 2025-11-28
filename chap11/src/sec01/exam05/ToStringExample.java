package sec01.exam05;

import java.util.Date;

public class ToStringExample {
	public static void main(String[] args) {
		Object obj1 = new Object();
		
		System.out.println(obj1.toString());
		System.out.println(obj1);
		
		//Date 클래스의 toString은 날짜가 출력되게 재정의 된 것
		Date date1 = new Date();
		System.out.println(date1.toString());
		System.out.println(date1);
	}
}
