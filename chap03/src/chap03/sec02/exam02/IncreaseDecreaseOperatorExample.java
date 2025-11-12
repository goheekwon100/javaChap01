package chap03.sec02.exam02;

public class IncreaseDecreaseOperatorExample {
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		x++; // x = x + 1 x는11
		++x; // x = x + 1 x는12
		System.out.println("X=" + x++); //12출력 후 13
		System.out.println("X=" + ++x); //1  증가 후 14출력 
		y++;
		System.out.println("Y=" + y);
		x++;
		System.out.println("X=" + x);
		
		
		x= 14;
		y= 8;
		// Quiz1
		// z, x, y의 값은?
		z = ++x + y++;
		
		System.out.println(z + " " + x + " " + y);
		//z는23, x는15, y는9
		
		// Quiz2
		// 다음 코드 실행 후 x의 값은?
		x = 3;

		if (x++ == 3) {
		    x++;
		}
		System.out.println(x);
		//x는5
		
		System.out.println("-----------------------");
		// Quiz3 - 개념 이해를 위한 퀴즈로 실무에서는 아래와 같이 쓰면 안됨 
		// 다음 코드 실행 후 a, b, result1, result2의 값은?
		int a = 10;
		int result1 = ++a + a++; //
		a = 10;
		result1 = ++a + ++a; //
		
		int b = 10;
		int result2 = b++ + ++b; 
		
		System.out.println("a: " + a + " b: " + b + " result1: " + result1 + " result2: " + result2);
		//a는 12, b는 12
		//result1은 22
		//reault2는 22
		System.out.println("-----------------------");
		x = 1;
		y = x++ + ++x + x;
		
		x = 1;
		y = 
	            x++ + ++x + x++ + ++x + x++ + ++x + x++ + ++x + x++ + ++x +
	            x++ + ++x + x++ + ++x + x++ + ++x + x++ + ++x + x++ + ++x +
	            x++ + ++x + x++;
        System.out.println("y = " + y);
		
		
		
		
		
	}
}
