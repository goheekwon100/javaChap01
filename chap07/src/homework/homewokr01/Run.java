package homework.homewokr01;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Student[] StudentArr = new Student[3];
		StudentArr[0] = new Student("김철수", 20, 178.2, 70.0, 1, "정보시스템공학과");
		StudentArr[1] = new Student("이영희", 23, 167.0, 54.0, 4, "물리학과");
		StudentArr[2] = new Student("홍길동", 21, 197.6, 86.0, 2, "경영학과");
		
		for (int i = 0; i < StudentArr.length; i++) {
			System.out.println("=== " + StudentArr[i].getName() + " ===");
			System.out.println("나이 : " + StudentArr[i].getAge());
			System.out.println("키 : " + StudentArr[i].getHeight());
			System.out.println("몸무게 : " + StudentArr[i].getWeight());
			System.out.println("학년 : " + StudentArr[i].getGrade());
			System.out.println("전공 : " + StudentArr[i].getMajor());
		}

		Employee[] EmployeeArr = new Employee[10];
		EmployeeArr[0] = new Employee("주인성", 28, 180.3, 72, 2000000, "영업부");		
		EmployeeArr[1] = new Employee("공자철", 40, 182.0, 76, 3000000, "기획부");
		
		while(true) {
			Scanner sc = new Scanner(System.in);
			
			int i = 1;
			EmployeeArr[++i] = new Employee();
			System.out.println("=== 사원 입력받기 ===");
			System.out.println("이름: ");
			EmployeeArr[i].setName(sc.next());
			System.out.println("나이: ");
			EmployeeArr[i].setAge(sc.nextInt());
			System.out.println("키: ");
			EmployeeArr[i].setHeight(sc.nextDouble());
			System.out.println("몸무게: ");
			EmployeeArr[i].setWeight(sc.nextDouble());
			System.out.println("급여: ");
			EmployeeArr[i].setSalary(sc.nextInt());
			System.out.println("부서: ");
			EmployeeArr[i].setDept(sc.next());
			
			sc.nextLine();
			
			System.out.println("계속 입력하시겠습니까?");
			char input = sc.next().charAt(0);
			if(input == 'n' || input == 'N') {
				break;
			}
		}
		
		for (int i = 0; i < EmployeeArr.length; i++) {
			if(EmployeeArr[i] != null) {
				System.out.println("=== " + EmployeeArr[i].getName() + " ===");
				System.out.println("나이 : " + EmployeeArr[i].getAge());
				System.out.println("키 : " + EmployeeArr[i].getHeight());
				System.out.println("몸무게 : " + EmployeeArr[i].getWeight());
				System.out.println("급여 : " + EmployeeArr[i].getSalary());
				System.out.println("부서 : " + EmployeeArr[i].getDept());
			}
		}
	}
}
