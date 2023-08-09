package p2023_8_02;

import java.util.Date;
import java.util.Stack;

public class StackTest {
	public static void main(String[] args) {
		
		// Stack 객체 생성
		Stack s = new Stack();
		System.out.println(s.empty());	// 비어있다면 true

		// Stack에 값을 넣음
		s.push("gemini");
		Date d = new Date();
		s.push(d);
		s.push(new Integer(10));
		s.push("johnharu");

		// Stack의 값을 출력
		System.out.println(s.empty());	// false
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.empty());	// true
	}
}
