package homework.homework02;

public class UnSupportedException extends RuntimeException{
	public UnSupportedException() {
	}
	@Override
	public String getMessage() {
		super.printStackTrace();
		return "원인을 알 수 없는 문제가 발생했습니다.";
	}
}