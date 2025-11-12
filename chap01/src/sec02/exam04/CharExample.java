package sec02.exam04;

public class CharExample {
	public static void main(String[] args) {
		char var1 = '가';
		char var2 = '갸';
		char var3 = '거';
		char var4 = '겨';
		char var5 = 'ㅏ';
		char var6 = 'ㅑ';
		char var7 = 'ㅓ';
		char var8 = '가';
//		char var9 = '\u0041'; //16진수 유니코드
		System.out.println((int)var1);
		System.out.println((int)var2);
		System.out.println((int)var3);
		System.out.println((int)var4);
		System.out.println((int)var5);
		System.out.println((int)var6);
		System.out.println((int)var7);
		System.out.println((int)var8);
		System.out.println((char)(4352));
		System.out.println((char)(4353));
		
		//12593 ㄱ
		//44032 가
		//4352 ~ 4607
		
		//55295 마지막 범위
		
		int num;
		int j_max=13;
		for(int i=0;i < 400;i++) {
			for(int j=0; j < j_max; j++ ) {
				num = 54431	+ i*j_max + j;
				System.out.print(num +":" +(char)(num) + "     ");
			}
			System.out.println("");
		}
	}
}
