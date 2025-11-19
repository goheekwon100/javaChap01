package homework;

public class Homework01 {
	public static void main(String[] args) {
//		int[] keyArray = {152,180,165,158,171};
		int[] keyArray = {5,3,8,4,2};

		System.out.print("정렬대상:{");
		for (int i = 0; i < keyArray.length; i++) {
			System.out.print(keyArray[i]);
			if(i < keyArray.length-1) {
				System.out.print(", ");
			}
		}
		System.out.println("}");
		
		for (int i = 0; i < keyArray.length-1; i++) {
			for (int j = 0; j < keyArray.length-1-i; j++) {
				if(keyArray[j] > keyArray[j+1]) {
					int tmp = keyArray[j+1]; 
					keyArray[j+1] = keyArray[j];
					keyArray[j] = tmp;
				}
			}
			System.out.print((i+1)+"회전 → {");
			for (int j = 0; j < keyArray.length; j++) {
				if(j > 0 ) System.out.print(", ");
				System.out.print(keyArray[j]);
			}
			System.out.print("}");
			if(keyArray.length-2 == i) {
				System.out.print(" ← 정렬 완료");
			}else {
				System.out.print("\n");
			}
		}
	}
}
