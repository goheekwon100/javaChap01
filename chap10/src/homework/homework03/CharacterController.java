package homework.homework03;

public class CharacterController {
	CharacterController(){}
	
	public int countAlpha(String a) throws CharCheckException{
		int alphaCount = 0;
		
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == ' ') {
				throw new CharCheckException("체크할 문자열 안에 공백이 포함되어 있습니다.");
			}else if (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z') {
				alphaCount++;
			}else if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z') {
				alphaCount++;
			}
		}
		return alphaCount;
	}
}
