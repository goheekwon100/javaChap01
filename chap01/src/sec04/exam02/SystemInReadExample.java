package sec04.exam02;

import java.io.IOException;

public class SystemInReadExample {
	public static void main(String[] args) throws IOException {
		int keyCode1;
		
		// 키보드로부터 키코드를 읽어올 때 예외가 발생할 수 있음 -> 예외처리
		
			keyCode1 = System.in.read();
			
			System.out.println("keyCode: " + keyCode1);
			keyCode1 = System.in.read();
			System.out.println("keyCode: " + keyCode1);  
			keyCode1 = System.in.read();
			System.out.println("keyCode: " + keyCode1);    
	}
}
