package sec02.example09;

import java.util.Arrays;

public class MainStringArrayArgumentExample {
	public static void main(String[] args) {
		//2. ststem.arraycopy 메소드이용
		
		String[] oldStrArray = {"java","array","copy"};
		String[] newStrArray = new String[5];

		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		
		for (int i = 0; i < newStrArray.length; i++) {
			System.out.println(newStrArray[i]);
		}
		
		//3. Arrays.copyOf() 메소드 이용
		
		
		String[] newStrArray2 = Arrays.copyOf(oldStrArray, oldStrArray.length + 2);
		for (int i = 0; i < newStrArray2.length; i++) {
			System.out.println(newStrArray2[i]);
		}
	}
}
