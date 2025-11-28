package homework.homework06;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		String sentence = "the quick brown fox jumps over the lazy dog";
		String[] sentenceArr = sentence.split(" ");
		
		try (Scanner sc = new Scanner(System.in)) {
			A:while(true) {
				System.out.print("단어를 입력하세요: ");
				String word = sc.next();
				
				for (int i = 0; i < sentenceArr.length; i++) {
					if(sentenceArr[i].equals(word)) {
						if (i == sentenceArr.length - 1) {
							System.out.println("마지막 단어입니다.");
						}else {
							System.out.println(sentenceArr[i] + "다음 단어: " + sentenceArr[i+1]);
						}
						continue A;
					}
				}
				System.out.println("존재하지 않는 단어입니다.");
				break;
			}
		}
	}
}
