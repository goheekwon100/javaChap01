package homework.homework02;

public class Run {
	public static void main(String[] args) {
		Person person1 = new Person("01012345678",190.5,100.2);
		Person person2 = new Person("01015478452",175.4,65.6);
		
		System.out.println(person1.phoneNumber);
		System.out.println(person1.key);
		System.out.println(person1.weight);
		System.out.println(person2.phoneNumber);
		System.out.println(person2.key);
		System.out.println(person2.weight);
		
	}
}
