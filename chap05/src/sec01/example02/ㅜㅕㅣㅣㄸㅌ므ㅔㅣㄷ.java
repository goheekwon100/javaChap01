package sec01.example02;

public class ㅜㅕㅣㅣㄸㅌ므ㅔㅣㄷ {
	public static void main(String[] args) {
		String strVar1 = "김재현"; //"김재현" 객체를 가리킴
		String strVar2 = "김재현"; //"김재현" 객체를 가리킴
		
		if (strVar1 == strVar2) {
			//참조변수의 비교연산은 동일한 객체를 가리키고 있는지 확인하는 것
			System.out.println("strVar1과 strVar2는 참조가 같음");
		}else {
			System.out.println("strVar1과 strVar2는 참조가 다름");			
		}
		
		if (strVar1.equals(strVar2) == true ) {
			System.out.println("strVar1과 strVar2은 문자열이 같음");
		}else {
			System.out.println("strVar1과 strVar2는 문자열이 다름");
		}
		
		String strVar3 = new String("김재현"); //새로운 "김재현" 객체를 생성함
		String strVar4 = new String("김재현"); //새로운 "김재현" 객체를 생성함.
		
		if (strVar3 == strVar4) {
			//참조변수의 비교연산은 동일한 객체를 가리키고 있는지 확인하는 것
			System.out.println("strVar3과 strVar4는 참조가 같음");
		}else {
			System.out.println("strVar3과 strVar4는 참조가 다름");			
		}
		
		if (strVar3.equals(strVar4) == true ) {
			System.out.println("strVar3과 strVar4은 문자열이 같음");
		}else {
			System.out.println("strVar3과 strVar4는 문자열이 다름");
		}
	}
}
