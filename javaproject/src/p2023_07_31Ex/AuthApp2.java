package p2023_07_31Ex;

public class AuthApp2 {

	public static void main(String[] args) {

//		System.out.println(args[0]);

		String id = "egoing";
		String inputId = args[0];

		String password = "1111";
		String inputPassword = args[1];

		System.out.println("Hi.");
		if (inputId.equals(id) && inputPassword.equals(inputPassword)) {
			System.out.println("Hello.");
		} else {
			System.out.println("Who are you?");
		}

	}

}

//		if(inputId == id) {
//		if(inputId.equals(id)) {
//			if(inputPassword.equals(password)) {
//				System.out.println("Hello.");
//			}else {
//				System.out.println("틀린 비밀번호");
//			}
//		}else {
//			System.out.println("Who are you?");
//		}