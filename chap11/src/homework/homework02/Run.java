package homework.homework02;

public class Run {
	public static void main(String[] args) {
		String[] strArr = new String[4];
		
		strArr[0] = "서울특별시 금천구 구로디지털2로 95";
		strArr[1] = "서울특별시 서대문구 연희로 248";
		strArr[2] = "울산광역시 남구 돋질로 233";
		strArr[3] = "경상북도 구미시 송정대로 55";
		
		for (String value : strArr) {
			System.out.println(Practice.takeState(value));
		}
	}
}
