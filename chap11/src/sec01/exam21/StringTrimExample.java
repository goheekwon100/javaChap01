package sec01.exam21;

public class StringTrimExample {
	public static void main(String[] args) {
		String str1 = "       java pro  1    ";
		str1 = str1.trim();
		
		
		String tel1 = "   02";
		String tel2 = "  233 ";
		String tel3 = "  2202   ";
		
		String tel = tel1.trim() + "-" + tel2.trim() + "-" + tel3.trim();
		System.out.println(tel);
	}
}
