package sec01.example01;

public class ReferenceTypeExmaple {
	public static void main(String[] args) {
		String hobby = null;
//		System.out.println(hobby.length()); //참조하는 객체가 없어서 예외 발생, NPE(Null Pointer Exception
		
		hobby = "배드민턴";
		System.out.println(hobby.length()); //참조하는 객체가 있어 길이값 반환
		
		String name = "김재현";
		System.out.println(name.hashCode());
		name = null; //참조를 끊음
		System.gc();
		Runtime.getRuntime().gc();

		
		String name1 = "김재현";
		String name2 = "김재현";
		System.out.println(name1.hashCode());
		System.out.println(name2.hashCode());
		
		// 이때 "김재현"이라는 문자열 객체는 쓰레기 객체가 됨
		// Garbage Collector가 CPU가 한가할 때나 메모리가 부족할 때 메모리에서 자동제거함.
	}
}
