package sec03.exam07;

public class PrimitiveAndStringConvertExample {
	public static void main(String[] args) {
		//Primitive 원시타입
		
		int value1 = Integer.parseInt("10");
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		
//		int value4 = Integer.parseInt("1a");
//		byte value5 = Byte.parseByte("128");
		
		String str1 = String.valueOf(10);
		String str2 = String.valueOf(3.14);
		String str3 = String.valueOf(true);
		
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		System.out.println("str3 : " + str3);
		
		String str = "" + 3;
		System.out.println(str);
		
		double var1 = 1e-323 ;
		float var2 = 1e2f;
		
		System.out.println(var1);
		System.out.println(var2);
		
		System.out.println("");
	}
	
	
}
