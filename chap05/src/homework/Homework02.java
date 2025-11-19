package homework;

import java.util.Scanner;

public class Homework02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("생성을 원하는 배열크기를 입력해주세요(정수): ");
		int inputArrayLength = sc.nextInt();
		
		int[] intArr = new int[inputArrayLength];
		int sum = 0;
		
		for (int i = 0; i < intArr.length; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			intArr[i] = sc.nextInt();
		}
		
//		for (int i = 0; i < intArr.length; i++) {
//			System.out.print(intArr[i] + " ");
//			sum += intArr[i];
//		}
		for (int num : intArr){
			sum += num;
		}
		System.out.println("\n총 합 : " + sum);
		sc.close();
		
		
	}
}
