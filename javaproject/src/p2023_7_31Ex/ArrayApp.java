package p2023_7_31Ex;

public class ArrayApp {

	public static void main(String[] args) {
		
		// 1차원 배열의 1형식 값을 모르는 경우
		String[] users = new String[3];
		users[0] = "egoing";
		users[1] = "jinhuck";
		users[2] = "youbin";
		
		System.out.println(users[1]);
		
		// 배열의 길이를 알려주는 length속성
		System.out.println(users.length);
		
		// 1차원 배열의 2형식
		// 배열 선언과 동시에 각 인덱스에 값을 전달
		int[]scores = {10, 100, 100};
		System.out.println(scores[1]);
		System.out.println(scores.length);
		
	}

}
