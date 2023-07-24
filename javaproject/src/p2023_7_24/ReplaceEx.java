package p2023_7_24;

public class ReplaceEx {

	public static void main(String[] args) {

//	replace ( ) : replace(oldChar, newChar)
//	: oldChar를 newChar로 치환해주는 역할

//	replace("자바", "JAVA") : 자바를 JAVA로 치환해주는 역할

		String oldstr = "자바는 객체 지향 언어입니다.";

		String newstr = oldstr.replace("자바", "JAVA");
		System.out.println(oldstr);
		System.out.println(newstr);

	}

}
