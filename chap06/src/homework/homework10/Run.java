package homework.homework10;

public class Run {
	public static void main(String[] args) {
		Person person = new Person();
		
		person.setName("김철수");
		person.setAge(20);
		
		System.out.println("이름: " + person.getName()+ ", " + "나이: " +person.getAge());
		System.out.println("이름: " + person.name+ ", " + "나이: " +person.age);
	}
}
