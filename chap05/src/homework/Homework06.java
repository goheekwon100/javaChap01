package homework;

public class Homework06 {
	public static void main(String[] args) {
		int num = 5;
		
		int left, right;
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num*2-1; j++) {
				left = (num*2-1) / 2 - i;
				right = (num*2-1) / 2 + i;
				if(j >= left && j <= right){
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
}

//첫번째줄: i가 0일 때 j가 4만 *, 나머지는 모두 공백
//if문에서 012345678 중 4만 걸러내는 방법
//j값이 4와 4 사이일 때
//dan은 5이다, 칸 수는 9칸이다.
//left와 right 식을 한개씩 정해준다.

//left는 i가 2일때 3 / (num*2-1) / 2 - i
//right는 i가 2일 때 5 / (num*2-1) / 2 + i
