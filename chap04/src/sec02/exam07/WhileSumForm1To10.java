package sec02.exam07;

import java.util.Scanner;

public class WhileSumForm1To10 {
	public static void main(String[] args) {
		int sum=0;

		int i = 1; //초기화
		while (i <= 10) { //조건식
			sum += i;
			i++; //증감식
		}
		System.out.println(sum);

		//(참고) 무한 루프
		// 조건식에 true 사용, 반복문 내부 IF문에 조건식 작성 후 break 사용
		
		//do while 1~100더하기
		
		sum=0;
		i=0;
		do {
			i++;
			sum += i;
		}while(i<100);
		System.out.println(sum);
		

		sum=0;
		i=100;
		do {
			sum += i;
			i--;
		}while(i>0);
		System.out.println(sum);
		
		
		//quiz 1~100까지 홀수합
		
		i=1;
		sum=0;
		while(i<=100) {
			sum += i;
			i+=2;
		}
		System.out.println("1부터 100까지 홀수의 합은: " + sum);
		
		//quiz 자연수 입력받아 각 자리수 합 출력
//		Scanner sc = new Scanner(System.in);
//		String strNum;
//		int numLength;
//		int num;
//		strNum = sc.next();
//		sc.close();
//		
//		numLength = strNum.length();
//		num = Integer.parseInt(strNum);
//		
//		int divisor;
//		int total=0;
//		i = 1;
//		
//		while(i <= numLength) {
//			divisor = (int)Math.pow(10 , numLength-i);
//			total += num / divisor;
//			num %= divisor;
//			i++;
//		}
//		System.out.println(total);
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		num = sc.nextInt();
		sc.close();
		
		int total=0;
		i = 1;
		
		while(num>0) {
			total += num%10;
			num /= 10;
		}
		System.out.println(total);
		
		
	}
}