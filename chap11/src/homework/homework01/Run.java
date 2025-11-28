package homework.homework01;

public class Run {
	public static void main(String[] args) {
		String str = "김철수,25,동작구,남\n홍길동,27,관악구,남\n이영희,29,강서구,여";
		
		String[] strArr = str.split("\n");
		for (String value : strArr) {
			System.out.println(value);
		}

		Person[] person = new Person[strArr.length];
		for(int i=0;i<strArr.length;i++) {
			String[] personArr = strArr[i].split(",");
			person[i] = new Person(personArr[0],Integer.parseInt(personArr[1]),personArr[2],personArr[3].charAt(0));
			System.out.println(person[i].toString());
		}
	}
}
