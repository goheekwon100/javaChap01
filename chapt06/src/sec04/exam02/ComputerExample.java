package sec04.exam02;

public class ComputerExample {
	public static void main(String[] args) {
		Computer myCom = new Computer();
		
		// 1. 매개값으로 배열을 넘김
		int[] values = {1,2,3,4,5};
		int result1 = myCom.sum1(values);
		System.out.println(result1);
		
		int result2 = myCom.sum1(new int[] {1,2,3,4,5});
		System.out.println(result2);
		
		// 2. 가변인자 ...
		int result3 = myCom.sum2(new int[] {1,2,3,5});
		System.out.println(result3);

		int result4 = myCom.sum2(1,3,4,5,111);
		System.out.println(result4);
		
	}
	
	//자바는 가변인자로 부름
	//참고 in 자바스크립트
	//1. argument 객체 사용 - 오래된 방식
	//function sum () {
	//	console.log(arguments);
	//}
	//2. Rest 파라미터 - 최신 표준(권장)
	//function sum (a,b,c, ...numbers) {
	//	console.log(numbers);
	//}
}
