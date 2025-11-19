package homework;

import java.util.Scanner;

public class Homework03 {
	public static void main(String[] args) {
		int inputArrayLength;
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("정수 : ");
			inputArrayLength = sc.nextInt();
			if(inputArrayLength < 3 || inputArrayLength % 2 == 0)
				System.out.println("다시 입력하세요.");
			else {
				break;
			}
		}
		sc.close();
		
		int[] intArr = new int[inputArrayLength];	
		int num=0;
		
		for (int i = 0; i < intArr.length; i++) {
			if(i < intArr.length / 2 + 1) {
				intArr[i] = ++num;
			}else {
				intArr[i] = --num;
			}
			System.out.print(intArr[i]);
			
			if(i == intArr.length-1) return;
			System.out.print(", ");	
		}
		
		
	}
}
