package homework.homework09;

public class Run {
	public static void main(String[] args) {
		Student person1 = new Student();
		Student person2 = new Student();
		Student person3 = new Student();
		
		person1.setName("김철수");
		person1.setClassName("A");
		person2.setName("홍길동");
		person2.setClassName("F");
		person3.setName("이영희");
		person3.setClassName("B");
		
		System.out.println(person1.getStudentNo()+ " " + person1.getName() + " " + person1.getClassName());
		System.out.println(person2.getStudentNo()+ " " + person2.getName() + " " + person2.getClassName());
		System.out.println(person3.getStudentNo()+ " " + person3.getName() + " " + person3.getClassName());
	}
}
