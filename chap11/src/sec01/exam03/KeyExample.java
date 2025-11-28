package sec01.exam03;

import java.util.HashMap;

public class KeyExample {
	public static void main(String[] args) {
		// Map: key/value 쌍으로 저장하는 컬렉션
		// Key 객체를 식별키로 사용해서 String 값을 저장하는 HashMap 객체 생성
		
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		
		// 식별키 "new Key(1)" 로 "홍길동"을 저장함.
		
//		hashMap.put(key, "홍길동");
		hashMap.put(new Key(1),"홍길동");
		// Key가 같으면 값이 덮어쓰기 됨
		
		// 식별키로 홍길동 읽어옴.
		String value = hashMap.get(new Key(1));
		
		System.out.println(value);
		
		// eqauls() 메소드를 재정의 했음에도 동등 객체로 판단하지 않는다.
		// hashcode() 메소드를 재정의 해야 한다.
		
		System.out.println("========================");
		
		HashMap<String, String> hashMap1 = new HashMap<String, String>();
		hashMap1.put(new String("1"),"홍길동");
		String value1 = hashMap1.get(new String("1"));
		
		System.out.println(value1);
		
		// 참고
		// String hashCode() 예
		
		String str1 = "김";
		String str2 = "김";
		String str3 = new String("김");
		String str4 = new String("가나다라마바사자차");
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
		System.out.println("=========");
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
		
		
	}
}
