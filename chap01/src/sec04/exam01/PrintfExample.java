package sec04.exam01;

public class PrintfExample {
	public static void main(String[] args) {
		int value = 123;
		
		System.out.printf("상품의 가격: %d 원\n", value);
		System.out.printf("상품의 가격: %-5d 원\n", value);
		System.out.printf("상품의 가격: %5d 원\n", value);
		System.out.printf("상품의 가격: %5d 원\n", value+1000);
		System.out.printf("상품의 가격: %5d 원\n", value+10000);
		System.out.printf("상품의 가격: %05d 원\n", value);
		
		double area = 3.14159 * 10 * 10;
		System.out.printf("반지름이 %1$d인 원의 넓이: %2$08.3f\n",10, area);
		System.out.printf("반지름이 %2$d인 원의 넓이: %1$08.3f\n",area, 10);
		
		String name = "홍길동";
		String job = "도적";
		
		System.out.printf("%1$6d| %2$-10s| %3$10s|\n",1,name,job);
	}
}
