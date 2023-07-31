package p2023_7_31Ex;

public class AuthApp3 {

	public static void main(String[] args) {

//		String[] users = { "egoing", "jinhuck", "youbin" };

		// 2차원 배열
		String[][] users = { 
				{ "egoing", "1111" }, 
				{ "jinhuck", "2222" }, 
				{ "youbin", "3333" } 
				};

		String[] inputId = { "egoing", "jinhuck", "youbin" };
		String[] inputPass = { "1111", "2222", "3333" };

		boolean isLogined = false;
		for (int i = 0; i < users.length; i++) {
			String[] current = users[i];
			if (current[1].equals(inputId[i]) 
							&& 
				current[2].equals(inputPass[i])) 
			{
				isLogined = true;
				break; // 반복문이 참을 만나면 반복문을 종료
			}
		}

		System.out.println("Hi!");
		if (isLogined) {
			System.out.println("Hello!");
		} else {
			System.out.println("Who are you?");
		}
	}

}
