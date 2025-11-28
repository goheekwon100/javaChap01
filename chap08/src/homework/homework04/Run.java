package homework.homework04;

public class Run {
	public static void main(String[] args) {
		SmartPhone[] smartPhone = new SmartPhone[2];
		smartPhone[0] = new GalaxyS24();
		smartPhone[1] = new Iphone15();
		
		for (SmartPhone phone : smartPhone) {
			if(phone instanceof GalaxyS24) {
				System.out.print("갤럭시S24는 ");
			}else if(phone instanceof Iphone15) {
				System.out.print("아이폰15는 ");
			}
			phone.printMaker();
			System.out.println("에서 만들어졌다.");
			phone.makeCall();
			phone.takeCall();
			phone.touch();
			phone.charge();
			phone.picture();
			System.out.println();
		}
	}
}
