package homework.homework04;

public class NumberController {
	NumberController(){}
	
	public boolean checkDouble(int num1, int num2) throws NumberRangeException{
		
		if(numRange1To100(num1) && numRange1To100(num2)) {
			if(num1 / num2 * num2 == num1) {
				return true;
			}else {
				return false;
			}
		}else {
			throw new NumberRangeException("1부터 100사이의 값이 아닙니다.");
		}
		
	}
	public boolean numRange1To100(int num) {
		if(num > 0 && num <= 100)
			return true;
		else return false;
	}
}
