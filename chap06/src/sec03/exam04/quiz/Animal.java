package sec03.exam04.quiz;

public class Animal {
	String kind;
	int age;

	Animal() {
		this("사람",1);
	}

	Animal(String kind, int age) { //this로 접근
		this.kind = kind;
		this.age = age;
	}

	Animal(String kind) {
		this(kind, 1);
	}

	Animal(int age) {
		this("사람", age);
	}

	public void info() {
		System.out.println(kind + ": " + age + "살");
	}
}
