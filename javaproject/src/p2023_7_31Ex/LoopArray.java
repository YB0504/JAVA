package p2023_7_31Ex;

public class LoopArray {

	public static void main(String[] args) {

		// 반복문 + 배열

		String[] users = new String[3];
		users[0] = "egoing";
		users[1] = "jinhuck";
		users[2] = "youbin";

		for (int i = 0; i < users.length; i++) {
							//배열의 길이
			if (users[i].equals(users[2])) {
				// equals 메소드로 배열끼리의 값을 비교
				System.out.print(users[i]);
			} else {
				System.out.print(users[i] + ", ");
			}
		}
	}

}
