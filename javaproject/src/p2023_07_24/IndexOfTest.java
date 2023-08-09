package p2023_07_24;

public class IndexOfTest {
	public static void main(String[] args) {

//	indexOf ( ) : 특정 문자의 인덱스 번호를 구해주는 메소드
		
					//	0, 1, 2 순으로 번호를 매김
		String message = "Java program creates many objects.";
		
		// 가장 먼저 나오는 'a'의 인덱스 번호를 구해준다.		
		int index1 = message.indexOf('a');
		// 10 진수 아스기 코드값(97) 에 해당되는 문자 'a'의 인덱스 번호를 구해준다.
		int index2 = message.indexOf(97);

		System.out.println(index1);
		System.out.println(index2);

		// index번호 13번째 이후에서 a를찾음
		int index3 = message.indexOf('a', 13);	// 16
		System.out.println(index3);

		int index4 = message.indexOf("av");	//	1
		System.out.println(index4);

		int index5 = message.indexOf("man", 12);	//	21
		System.out.println(index5);

		// 찾고자 하는 문자가 없을 때는 - 1을 메소드가 자체적으로 리턴한다.
		int index6 = message.indexOf("java");
		System.out.println(index6);
	}
}
