package homework.homework01;

public class Run {
	public static void main(String[] args) {
		Employee people1 = new Employee("김철수", "교육운영팀");
		Employee people2 = new Employee("이영희", "경영지원팀");
		
		System.out.println("이름: " + people1.name + "   팀: " + people1.team);
		System.out.println("이름: " + people2.name + "   팀: " + people2.team);
	}
}
