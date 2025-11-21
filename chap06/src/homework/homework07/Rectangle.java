package homework.homework07;

public class Rectangle {
	private int width;
	private int height;
	
	public Rectangle() {
		width = 1;
		height = 1;
	}
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public int calculateRound() {
		int result = (width+height)*2;
		return result;
	}
	public int calculateArea() {
		int result = width*height;
		return result;
	}
	public void printInfo() {
		System.out.println("=== 사각형 정보 ===");
		System.out.println("1. 사각형의 둘레: " + calculateRound());
		System.out.println("2. 사각형의 넓이: " + calculateArea());
	}
}	
	

//클래스 다이어그램
//
//+ : public
//# : protected
//~ : (default)
//- : private
//
//static은 밑줄
//final은 대문자로 표현
//대문자이면서 밑줄이 있을 경우 static final 상수임을 뜻함