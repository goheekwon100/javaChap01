package sec02.exam06;

public class UserServiceExample {
	public static void main(String[] args) {
		UserService service = new UserService();
		
		try {
			service.registerUser(-1);
		} catch (InvalidAgeException e) {
			System.out.println("예외발생 : " + e.getMessage());
		}
	}
}
