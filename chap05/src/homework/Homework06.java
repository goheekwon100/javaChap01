package homework;

import java.util.Arrays;
import java.util.Scanner;

public class Homework06 {
	public static void main(String[] args) {
		boolean flag = true;
		char replayChar;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열의 크기를 입력하세요 : ");
		int arrSize = sc.nextInt();
		sc.nextLine();
		String[] subject = new String[arrSize];
		
		
		int addIndex=0;
		
		while(flag) {
			for (int i = 0+addIndex; i < subject.length; i++) {
				System.out.print((i+1) +"번째 문자열 : ");
				subject[i] = sc.nextLine();
			}
			addIndex = subject.length;
			while(true) {
				System.out.println("더 값을 입력하시겠습니까?");
				replayChar = sc.nextLine().charAt(0);
				if ("n".equalsIgnoreCase(replayChar+"")) {
					flag = false;
					break;
				}else if ("y".equalsIgnoreCase(replayChar+"")) {
					flag = true;
					break;
				}else {
					System.out.println("입력할 수 없는 값입니다.");
				}
			}
			if (flag) {
				System.out.print("더 입력하고 싶은 갯수 : ");
				int addArrSize = sc.nextInt();
				sc.nextLine();
				subject = Arrays.copyOf(subject,subject.length+addArrSize);
			}
		}
		for (int i = 0; i < subject.length; i++) {
			System.out.println(subject[i]);
		}
		
	}
}