package p2023_8_6;

class MemberService {

	boolean login(String id, String password) {
		if (id.equals("hong") && password.equals("12345")) {
			return true;
		} else {
			return false;
		}
	}

	public void logout(String id) {
		System.out.println("로그아웃");
	}
}

public class MethodEx02 {

	public static void main(String[] args) {

		MemberService ms = new MemberService();
		boolean result = ms.login("hong", "12345");
		if (result) {
			System.out.println("로그인");
			ms.logout("hong");
		} else {
			System.out.println("올바르게 입력해주세요.");
		}

	}

}
