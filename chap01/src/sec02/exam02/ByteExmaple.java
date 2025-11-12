package sec02.exam02;

public class ByteExmaple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//byte(1byte)
		//값의 범위: -128 ~127
		
//		byte var1 = 127;
		byte var2 = 0x7F;
		
		//값의 범위를 넘어가는 입력이 일어날 경우 오버플로우,언더플로우 발생
		//127을 넘어갈 경우 -128로 변경
		//-128을 넘어갈 경우 127로 변경
		System.err.println(var2);
		var2--;
//		var1++;
	}

}
