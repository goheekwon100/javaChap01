package homework;

public class rSP {
	int rSP(String userChoice) {
		if ("가위".equals(userChoice)) {
			return 0;
		}else if ("바위".equals(userChoice)) {
			return 1;
		}else if ("보".equals(userChoice)) {
			return 2;
		}
		return -1;
	}
}
