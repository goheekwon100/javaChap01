package sec01.exam04;

public class VariableScopeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v1 = 15; //메인메소드 블록에서 선언
		
		if(v1 > 10) {
			int v2=10;
			System.out.println(v1 + " " + v2); //v1은 상위 블록의 변수이므로 사용 가능
		}
//		System.out.println(v2); v2는 지역변수이므로 컴파일 에러 발생
	}

}
