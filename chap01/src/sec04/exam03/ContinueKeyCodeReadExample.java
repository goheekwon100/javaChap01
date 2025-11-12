package sec04.exam03;

import java.io.IOException;

public class ContinueKeyCodeReadExample {
	public static void main(String[] args) throws IOException {
		int keyCode;
		
		while(true) {
			keyCode = System.in.read();
			System.out.println("keyCode: " + keyCode);
			
			if (keyCode=='q') {
				System.out.println("입력 탈출 완료");
				break;
			}
		}
	}
}
