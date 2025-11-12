package sec04.exam05;

import java.util.Scanner;

public class ScannerExample2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("단어를 입력하세요.");
		while(sc.hasNext()) {
			String nextWord = sc.next(); //공백전까지 abc def 는 abc까지 가져옴.
			if("quit".equals(nextWord)) {
				break;
			}else {
				System.out.println("nextWord: " + nextWord);
			}
		}
		sc.close();
	}
}
