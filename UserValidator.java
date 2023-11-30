package lab3;

public class UserValidator {
	public void emailCheck (String email) throws IllegalArgumentException {
		if (!email.matches("@gmail.com")) {
			throw new IllegalArgumentException("Email address is not in a valid format.");
		}
	}
	
	public static void main (String args[]) {
		UserValidator uv = new UserValidator();
		String email = "yusufselman@gmail.com";
		uv.emailCheck(email);
	}
}
