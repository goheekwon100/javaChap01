package sec01.exam12;

import java.io.IOException;
import java.util.Scanner;

public class KeyboardToStringExample {
	public static void main(String[] args) throws IOException {
//		byte[] bytes = new byte[100];
//		
//		System.out.println("입력: ");
//		int readByteNo = System.in.read(bytes);
//		// 입력 스트림에서 바이트들을 여러개 읽어 배열에 저장하고 읽은 바이트 수를 반환
//		
//		System.out.println(readByteNo); // 7
//		// 엔터의 키코드인 \r(CR) \n(LF) 를 포함하기 때문
//		
//		String str = new String(bytes, 0 , readByteNo-2); // -2 해줘야 엔터제외 가능
//		System.out.println(str);
//		
//		System.out.println("============");
		
		// Scanner 객체 사용
		// System.in.read()의 단점은 키코드를 하나씩 읽음
		// 이러한 단점을 보완하기 위해 자바는 Scanner 클래스를 제공
		
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine(); // 한줄 통으로 읽어오고 엔터키 이전까지 반환
		
		System.out.println(str1);
		sc.close();
		
		// 참고: try = with - resource
		// 리소스를 자동으로 닫아주는 try 문법
		
		try (Scanner sc2 = new Scanner(System.in)){
			System.out.print("스캐너 입력: ");
			String str2 = sc2.nextLine();
			System.out.println(str2);
		}
	}
}
