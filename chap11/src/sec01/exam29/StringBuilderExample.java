package sec01.exam29;

public class StringBuilderExample {
	public static void main(String[] args) {
		//StringBuilder
		// 문자열을 변경 가능한 객체로 다루기 위해 만들어졌으며,
		// 문자열을 이어붙이거나 수정할 때 보다 효율적이고 성능상 유리
		// 다중 연산 시 메모리 절약 가능
		// StringFuffer 와 완전 동일, 동기화 기능만 제거(싱글 쓰레드인 경우 성능 향상)
		// 동기화란? 한스레드에서 작업 중일 때 타 스레드에서의 작업요청을 막는 것, 순차대로 처리
		// 동기화란? 다중 쓰레드 환경에서 동시변경을 시도할 때 순차처리하여 데이터 무결성 유지하는 것
		// 쓰레드: 다중작업이 필요할 때 스레드를 생성하여 작업 가능
		
//		StringBuilder sb = new StringBuilder("Java");
		StringBuffer sb = new StringBuffer("Java");
		System.out.println(sb.hashCode());
		
		// 기존 문자열의 끝에 주어진 값을 추가
		sb.append(" Programing Study");
		
		System.out.println(sb);
		System.out.println(sb.hashCode());
		
		sb.append(" Programing Study").append("10   ").append("10"); //메소드 체이닝 가능
		System.out.println(sb);
		
		// 지정한 인덱스 위치에 주어진 값을 삽입
		
		sb.insert(4, "1234");
		System.out.println(sb);
		
		sb.replace(4,10, "java");
		System.out.println(sb);
		
		sb.setCharAt(4, 'a');
		System.out.println(sb);
		
		sb.delete(4, 10);
		System.out.println(sb);
		
		System.out.println(sb.length());
		
		String str = sb.toString();
		System.out.println(str.hashCode());
		
		// 정리:
		// 내부에서 문자열을 저장해서 조작하기 때문에 변경이 있을 때맘다 객체를 만들지 않음
		// 문자열 조작이 필요한 경우 성능상 StringBuilder 사용 권장
		
	}
	
	
}
