package sec01.exam15;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

//문자열을 바이트 배열로 변환
// 쓰는 경우?
// 1. 파일에 문자열을 바이트로 저장할 때
// 2. 네트워크 전송 시 문자열을 바이트로 변환할 때
// 3. 문자열 암호화/해시 처리할 때

public class StringGetBytesExample {
	public static void main(String[] args) {
		String str = "안녕하세요";
		
		// 인코딩 : 문자열을 바이트 배열로 바꾸는 과정
		byte[] bytes1 = str.getBytes();
		System.out.println(bytes1.length);
		// UTF-8에서 한글은 3바이트로 변경
//		for (int i = 0; i < bytes1.length; i++) {
//			System.out.println(bytes1[i]);
//		}
		
		//디코딩 : 바이트 배열을 문자열로 바꾸는 과정
		String str1 = new String(bytes1);
		System.out.println(str1);
		
		
		try {
			byte[] bytes2 = str.getBytes("EUC-KR");
			System.out.println(bytes2.length);
//			String str2 = new String(bytes2); //EUC-KR로 인코딩 후 UTF-8 로 디코딩하면 깨짐
			String str2 = new String(bytes2,"EUC-KR"); // 인코딩과 동일하게 EUC_KR을 지정해줘야함.
			System.out.println("bytes2->String: " + str2);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
//		String str2 = new String(bytes2,"EUC-KR");
		
	}
}
