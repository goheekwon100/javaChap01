package sec01.exam01;

public class StudentExample {
	public static void main(String[] args) {
		Student s1 = new Student(); //Student 객체를 하나 만들고 생성번지를 s1에 저장
		System.out.println("s1 변수가 Strudent 객체를 참조합니다.");
		System.out.println(s1); //자동으로 toString()메소드 호출함.
		System.out.println(s1.toString());
		System.out.println(s1.hashCode());
		
		Student s2 = new Student();
		System.out.println(s2.hashCode()); //s1과 s2는 서로 다른 객체
		
		if(s1 == s2) {
			System.out.println("s1과 s2는 서로 같은 객체를 참조합니다.");
		}else {
			System.out.println("s1과 s2는 서로 다른 객체를 참조합니다.");
		}
		
		if(s1.equals(s2)) {
			System.out.println("s1과 s2는 서로 같은 객체를 참조합니다.");
		}else {
			System.out.println("s1과 s2는 서로 다른 객체를 참조합니다.");
		}
		
		System.out.println(s1.getClass());
		
		
	}
}
