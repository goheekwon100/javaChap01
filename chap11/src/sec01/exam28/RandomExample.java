package sec01.exam28;

import java.util.Random;

public class RandomExample {
	public static void main(String[] args) {
		// Random 클래스
		// Math.random() 보다 더 다양하 기능과 제어를 제공
		// 정수, 실수, 논리값 등 다양한 타입의 난수 생성 가능
		// 반복, 시드 필요, 테스트 용도 또는 멀티 쓰레드 환경에서 사용
		
		
		// 시드(seed)란?
		// 난수 생성기의 "초기값"
		// 동일한 시드를 넣으면 항상 같은 난수 순서(시퀀스)가 생성됨
		// 시드를 지정하지 않으면 시스템의 현재 시각에 따라 자동으로 지정됨
		
		Random random = new Random();
		random.setSeed(1234);
		
		int randInt1 = random.nextInt(1,46);
		int randInt2 = random.nextInt(1,46);
		int randInt3 = random.nextInt(1,46);
		int randInt4 = random.nextInt(1,46);
		int randInt5 = random.nextInt(1,46);
		int randInt6 = random.nextInt(1,46);
		int randInt7 = random.nextInt(1,46);
		int randInt8 = random.nextInt(1,46);
		int randInt9 = random.nextInt(1,46);
		
		System.out.println(randInt1);
		System.out.println(randInt2);
		System.out.println(randInt3);
		System.out.println(randInt4);
		System.out.println(randInt5);
		System.out.println(randInt6);
		System.out.println(randInt7);
		System.out.println(randInt8);
		System.out.println(randInt9);
		
		double randDouble1 = random.nextDouble(3.14,3.16);
		System.out.println(randDouble1);
		
		boolean randBool1 = random.nextBoolean();
		System.out.println(randBool1);
		
	}
}
